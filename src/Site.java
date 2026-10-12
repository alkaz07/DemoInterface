public abstract class Site {
    protected String alias;

    public Site(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public abstract double distanceTo(Site to);

}
