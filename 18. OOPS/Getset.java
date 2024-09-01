public class Getset {

    public static class Pen {
        String color;
        int tip;

        void setColor(String col) {
            color = col;
        }

        void setTip(int tp) {
            tip = tp;
        }

        String getColor() {
            return this.color;
        }

        int getTip() {
            return this.tip;
        }
    }

    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("black");
        System.out.println(p1.getColor());
    }
}
