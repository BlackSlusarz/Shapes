public class Main {
    public static void main (String[] args){
        Rectangle firstObject = new Rectangle(10, 20);
        System.out.println(firstObject.getName());
        System.out.println(firstObject.height);
        System.out.println(firstObject.width);
        System.out.println(firstObject.area());
        System.out.println(firstObject.countArea());


        Square secondObject = new Square();
       // Square secondObject = new Square(30, 30);
        System.out.println(secondObject.getName());
        System.out.println(secondObject.countArea());



    }
}
