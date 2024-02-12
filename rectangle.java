// Rectangle Class
class rectangle {

    // Write Fields Here
    private int length;
    private int width;

    public rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public rectangle(int length, int width) {

        // Write your code here
        this.length = length;
        this.width = width;

    }

    public int getArea() {

        // Write your code here
        return this.length * this.width;
    }

}
class Demo {

    public static void main(String args[]) {

        rectangle obj = new rectangle(2, 2);
        System.out.println(obj.getArea());

    }

}