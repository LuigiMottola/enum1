public class Triangle extends Form{

    private TypeForm typeForm;
    public Triangle() {
        this.typeForm = TypeForm.Triangle;
    }

    @Override
    public void areaCalculator() {
        super.areaCalculator();
        double areaTriangle = (TypeForm.Triangle.getBase() * TypeForm.Rectangle.getHeight()) / 2;
        System.out.println(areaTriangle);
    }
}
