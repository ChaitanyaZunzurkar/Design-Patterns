package Builder.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                        .setWalls("walls")
                        .setFloor("floor")
                        .setRoof("roof")
                        .build();

        System.out.println(house);
    }
}
