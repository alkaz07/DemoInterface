//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Main{
    public static void main(String[] args) {
//        exemple0();
//        exemple1();
            exemple2();
    }

    private static void exemple2() {
        Site piter = new City("Питер");
        Site moscow = new City("Москва");
        ITravel t1 = new AirTravel();
        t1.travel(moscow, piter);
    }

    private static void exemple1() {
        Site a = new GeoLoc("А",60, 30);
        Site b = new GeoLoc("Б",62, 29);
        //Объекты конкретных именованных классов, реализующие интерфейс IMove:
        Airplane plane = new Airplane("Ту-104");
        plane.move(a, b);
        Hiker hiker = new Hiker();
        hiker.move(b, a);

        //Объект анонимного класса
        IMove something = new IMove() {
            @Override
            public void move(Site from, Site to) {
                System.out.println("Таинственное перемещение из "+from+" в "+to);
            }
        };
        something.move(a, b);
        //Лямбда выражение - сокращенная запись объекта анонимного вложенного класса, реализующего интерфейс
        IMove teleport = (x,y)-> System.out.println("Телепортация из "+x+" в "+y+" мгновенно преодалевает "+x.distanceTo(y));
        teleport.move(b, a);

        teleport.move(a, new Address("Можайская",2, 1));
    }

    private static void exemple0() {
        Site a = new GeoLoc("А",60, 30);
        Site b = new GeoLoc("Б",62, 29);
        System.out.println("Расстояние от " +a +" до "+b+" равно " + a.distanceTo(b));
        Site c = new City("Питер");
        Site d = new City("Москва");
        System.out.println("Расстояние от " +c +" до "+d+" равно " + c.distanceTo(d));
        System.out.println("Расстояние от " +a +" до "+d+" равно " + a.distanceTo(d));

    }
}
