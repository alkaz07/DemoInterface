public class Airplane implements IMove{
    String name;


    public void move(Site from, Site to) {
        double d = from.distanceTo(to);
        System.out.println(this+" летит из "+from+" в "+to+" почти по прямой на расстояние "+d);
    }

    public Airplane(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                '}';
    }
}
