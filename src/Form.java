public class Form {
    public enum TypeForm {
        Rectangle("Rectangle", 10, 6),
        Triangle("Triangle", 4, 6);

        public String formName;
        public double base;
        public double height;

        TypeForm(String formName, double base, double height) {
            this.formName = formName;
            this.base = base;
            this.height = height;
        }

        public String getFormName() {
            return formName;
        }

        public double getBase() {
            return base;
        }

        public double getHeight() {
            return height;
        }
    }

    public void areaCalculator(){
        System.out.println(this.getClass().getSimpleName() + "area is equal to: ");
    }
}




