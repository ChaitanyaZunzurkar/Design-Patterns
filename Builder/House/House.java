package Builder.House;

public class House {
    private String walls;
    private String roof;
    private String floor;
    private Boolean hasGarden;
    private Boolean hasGarage;

    private House(HouseBuilder house) {
        this.walls = house.walls;
        this.roof = house.roof;
        this.floor = house.floor;
        this.hasGarden = house.hasGarden;
        this.hasGarage = house.hasGarage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("House [");
        sb.append("walls=").append(walls);
        sb.append(", roof=").append(roof);

        if (floor != null) {
            sb.append(", floor=").append(floor);
        }
        if (Boolean.TRUE.equals(hasGarage)) {
            sb.append(", garage=").append(true);
        }
        if (Boolean.TRUE.equals(hasGarden)) {
            sb.append(", garden=").append(true);
        }

        sb.append("]");
        return sb.toString();
    }

    public static class HouseBuilder {
        private String walls;
        private String roof;
        private String floor;
        private Boolean hasGarden;
        private Boolean hasGarage;
        
        public HouseBuilder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setFloor(String floor) {
            this.floor = floor;
            return this;
        }

        public HouseBuilder setGarden(Boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder hasGarage(Boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
