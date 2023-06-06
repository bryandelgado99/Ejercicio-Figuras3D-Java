public class figuras3D {

    //Atributos--------------------------------------------
    private float lado, area_base, altura, radio;
    private double pi=3.1416;

    //Constructor------------------------------------------

    public figuras3D(float lado, float area_base, float altura, float radio, double pi) {
        this.lado = lado;
        this.area_base = area_base;
        this.altura = altura;
        this.radio = radio;
        this.pi = pi;
    }

    //Setter and Getter------------------------------------
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getArea_base() {
        return area_base;
    }

    public void setArea_base(float area_base) {
        this.area_base = area_base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    //Métodos----------------------------------------------
        //Métodos públicos

        //Métodos privado


}
