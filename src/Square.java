public class Square extends Shape {
    int width;
    int height;
    public Square(int width, int height){
        this.height = height;
        this.width = width;

    }
    Square(){
        super(); // odwolywanie sie do metod klasy bazowej
        System.out.println("Hey it's Square");
    }
    // Uzywanie metod z super klasy
    @Override
    int countArea(){
        return height*width;
    }
}
