package io;

import java.io.*;

public class IoFundamentals {
    private static double dirNumbers;
    private static double fileNumbers;
    private static double fileNameLength;

    public static void main(String[] args) throws IOException {

        FileOutputStream folder = new FileOutputStream("d:/study/test.txt", true);
        String separator = "\n";
        String dirDescription = "Numbers of directories=";
        String fileDescription = "Numbers of files=";
        String averageFileDescription = "Average number of files in directories=";
        String averageFilelengthDescription = "Average length  of files name=";

        for (String thatDir:args){
            File derectory = new File(thatDir);
            if (thatDir.endsWith(".txt")) {
                readFile(derectory);
            }
            else {
                showFileStructer(derectory, 0);

                double dirNum = getNumbersOfDirectores(derectory);
                double fileNum = getNumbersOfFiles(derectory);
                double fileLength = getLengthOfFiles(derectory);
                double fileAverage = fileNum / dirNum;
                double fileLengthAverage = fileLength / fileNum;

                folder.write(dirDescription.getBytes());
                folder.write(Double.toString(dirNum).getBytes());
                folder.write(separator.getBytes());
                folder.write(fileDescription.getBytes());
                folder.write(Double.toString(fileNum).getBytes());
                folder.write(separator.getBytes());
                folder.write(averageFileDescription.getBytes());
                folder.write(Double.toString(fileAverage).getBytes());
                folder.write(separator.getBytes());
                folder.write(averageFilelengthDescription.getBytes());
                folder.write(Double.toString(fileLengthAverage).getBytes());
                folder.close();
            }
        }
    }


    public static void showFileStructer(File filesInDerectory, int layer) throws IOException {
        FileOutputStream folder = new FileOutputStream("d:/study/test.txt", true);

        String separator = "\n";
        String tabs = "";
        String tabPlus = "\t";

        for (int i = 0; i < layer; i++) {
            tabs = tabs + tabPlus;
        }

        for (File file : filesInDerectory.listFiles()) {
            folder.write(tabs.getBytes());
            folder.write(file.getName().getBytes());
            folder.write(separator.getBytes());
            if (file.isDirectory()) {
                showFileStructer(new File(file.getPath()), layer + 1);
            }
        }
        folder.close();
    }

    public static void readFile(File pathOfFile) throws IOException {
        FileInputStream folderInput = new FileInputStream(pathOfFile);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(folderInput, 200);
        int i;
        while ((i = bufferedInputStream.read()) != -1) {
            System.out.print((char) i);
        }
    }


    public static double getNumbersOfDirectores(File path) {
        for (File file : path.listFiles()) {
            if (file.isDirectory()) {
                dirNumbers++;
                getNumbersOfDirectores(new File(file.getPath()));
            }
        }
        return dirNumbers;
    }

    public static double getNumbersOfFiles(File path) {

        for (File file : path.listFiles()) {
            if (file.isFile()) {
                fileNumbers++;
            }
            if (file.isDirectory()) {
                getNumbersOfFiles(new File(file.getPath()));
            }
        }
        return fileNumbers;
    }

    public static double getLengthOfFiles(File path) {
        for (File file : path.listFiles()) {
            if (file.isFile()) {
                fileNameLength += file.getName().length();
            }
            if (file.isDirectory()) {
                getLengthOfFiles(new File(file.getPath()));
            }
        }
        return fileNameLength;
    }
}