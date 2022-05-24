package HomeWorkApp8;

public class Wall extends Overcoming {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Action actions) {
        System.out.println(super.getName() + " высота: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("перепрыгнул!1!");

            return true;
        } else {
            System.out.println("упал ничтожно в грязь");

            return false;
        }
    }
}