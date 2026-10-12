//TIP Чтобы <b>запустить</b> код, нажмите <shortcut actionId="Run"/> или
// нажмите на значок <icon src="AllIcons.Actions.Execute"/> в поле.
public class Main{
    public static void main(String[] args) {
            Site a = new GeoLoc(60, 30);
            Site b = new GeoLoc(62, 29);
            System.out.println(a.distanceTo(b));
        }
}
