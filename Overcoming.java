package HomeWorkApp8;

public abstract class Overcoming {
    private String name;

    public Overcoming (String name) {
        this.name = name;
    }

    protected abstract boolean moving(Action actions);

    public String getName() {
        return name;
    }
}