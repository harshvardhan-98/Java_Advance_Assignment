package Question1;

import java.time.*;

public class Dish {
    int dishID;
    String dishName;
    LocalTime creationTime;
    Dish(int dishID, String dishName, LocalTime creationTime){
        this.dishID = dishID;
        this.dishName = dishName;
        this.creationTime = creationTime;
    }

    //    Overriding toString method to print the direct values from created objects
    @Override
    public String toString() {
        return "Dish {" +
                "ID = " + dishID +
                ", Name = '" + dishName + '\'' +
                ", Time = " + creationTime +
                " }\n";
    }
}
