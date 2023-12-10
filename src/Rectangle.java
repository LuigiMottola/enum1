public class Rectangle extends Form{
    private TypeForm typeForm;
    public Rectangle(){
        this.typeForm = TypeForm.Rectangle;
    }

    @Override
    public void areaCalculator() {
        super.areaCalculator();
        double areaRectangle = TypeForm.Rectangle.getBase() * TypeForm.Rectangle.getHeight();
        System.out.println(areaRectangle);
    }
}
