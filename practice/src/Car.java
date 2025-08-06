public class Car {
    String model;
    String color;
    int HP;

    public Car(){

    }

    public Car (String model, String color, int HP){
        this.setColor(color);
        this.setModel(model);
        this.setHP(HP);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getModel() {
        return model;
    }

    public int getHP() {
        return HP;
    }

    public String getColor() {
        return color;
    }
}
