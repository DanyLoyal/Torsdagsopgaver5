package task_2;
/*
This task is an exercise in accessing fields in objects within objects.
You will create a building with some rooms. Each room will have some attributes
which you will access (read the value of) in order to draw conclusions about the building
in which the room is placed.

2.a Create a Room.java class with the following fields (use appropriate types and make them private):

numberOfDoors
numberOfLamps
numberOfWindows
2.b Create a constructor that populates all the fields above.

2.c As the fields of the Room class are private, create getters() for each of them,

2.d Create a Building.java class with the following fields (use appropriate types):

rooms (make sure to use the 'final' keyword here as this variable should never change once
it has been assigned a value)

Hint
never heard about final?
numberOfBathrooms

numberOfFloors

isOfficeBuilding

2.e Create a constructor that populates all the fields above.

2.f As the fields of the Building class are private, create getters() for each of them.

2.g In your main method, instantiate at least three different rooms.

2.h Add the three rooms to a collection (preferably of the same data type used for the "Rooms"
field in your Building.java class).

2.i In your main method, instantiate a new building.

2.j create a static method in Main, countLampsInBuilding(), that takes an object of type Building,
and returns the total number of lamps in the entire building.

Hint
You will need to have a loop in the body of the method that looks at each room in the building to
add the number of laps in each room.
2.k Create another static method in Main, isNormal(), that takes an object of type Building.
The method should return true if the Building's numberOfFloors is greater than its number of Rooms.
If not it should print "This is an odd building" and return false.

 */
import java.util.ArrayList;
public class Main {

    public static Room room;
    public static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {

        Room room1 = new Room(4,10,20);
        Room room2 = new Room(3,5,49);
        Room room3 = new Room(2,259,87);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms,3,2,true);
        countLampsInBuilding(building);
        isNormal(building);

        //TESTER
        /* *********************************
        System.out.println(room1.toString());
        System.out.println(room2.toString());
        System.out.println(room3.toString());
        System.out.println(building.toString());
        System.out.println(countLampsInBuilding(building)); //lamps total
        ************************************/
    }

    public static int countLampsInBuilding (Building building) {
        int numLamps = 0;

        for (int i = 0; i < rooms.size(); i++) {
            numLamps += rooms.get(i).getNumberOfLamps();
        }
        return numLamps;
    }

    public static boolean isNormal (Building building) {
        if (building.getNumberOfFloors() > rooms.size()) {
            System.out.println("This seems like a normal building");
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}