package food;

public enum AllFood {
    PORK("PORK"),
    BEEF("BEEF"),
    VEGETABLES("VEGETABLES"),
    GRASS("GRASS");

    private String foodName;

    AllFood(String food) {
        this.foodName = food;
    }

    public String getFoodName(){
        return foodName;
    }
}
