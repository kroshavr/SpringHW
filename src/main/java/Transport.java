abstract class Transport {
    private String model;

    public Transport(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                '}';
    }
    public void start () {
        System.out.println(getModel() + " готов к работе");
    }
}
