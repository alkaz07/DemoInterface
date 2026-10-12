public class GeoLoc extends Site{
    double latitude;
    double longitude;

    public GeoLoc(String alias, double latitude, double longitude) {
        super(alias);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "GeoLoc{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", alias='" + alias + '\'' +
                '}';
    }



    @Override
    public double distanceTo(Site to) {
        if (to instanceof GeoLoc){
            System.out.println("Расстояние между парами координат буду считать, как будто Земля плоская!");
            GeoLoc b = (GeoLoc) to;
            return Math.sqrt((b.latitude - this.latitude)*(b.latitude - this.latitude) + (b.longitude - this.longitude)*(b.longitude - this.longitude));
        }
        else {
            System.out.println("Пока не научились считать расстояние");
            return -1;
        }

    }
}
