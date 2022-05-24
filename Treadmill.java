package HomeWorkApp8;

public class Treadmill extends Overcoming {
    private int length;

    public Treadmill(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Action actions) {
        System.out.println(super.getName() + " протяженность: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("преодолено!");

            return true;
        } else {
            System.out.println("убал без сил раньше финиша");

            return false;
        }
    }
}