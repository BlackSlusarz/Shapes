public class Rectangle extends Shape {
    int width;
    int height;
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;

    }
    int area() {return height*width;}

    @Override
    int countArea(){
        return height*width;
    }
}
