package aircompany.planes;

import aircompany.models.ClassificationLevel;
import aircompany.models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane {
    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalTypes getType() {
        return type;
    }

    public void setType(ExperimentalTypes type) {
        this.type = type;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane thatPlane = (ExperimentalPlane) o;
        return Objects.equals(type, thatPlane.type) &&
                Objects.equals(classificationLevel, thatPlane.classificationLevel);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", experimental type=" + type +
                        ", classification level=" + classificationLevel +
                        '}');
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, classificationLevel);
    }
}

