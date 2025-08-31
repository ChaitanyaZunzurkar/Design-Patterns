package Builder.Restaurant;

interface Restaurant {
    Meal getMeal();
    void buildStarter();
    void buildMainCourse();
    void buildDessert();
    void reset();
}
