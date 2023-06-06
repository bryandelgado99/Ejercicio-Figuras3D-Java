public class figuras3D {

    //Atributos--------------------------------------------
    private float lado, area_base, altura, radio;
    private double pi=3.1416;

    //Constructor------------------------------------------
    //Constructor General
    /*public figuras3D(float lado, float area_base, float altura, float radio, double pi) {
        this.lado = lado;
        this.area_base = area_base;
        this.altura = altura;
        this.radio = radio;
        this.pi = pi;
    }*/

    //Esfera
    public figuras3D(float radio, double pi){
        this.radio = radio;
        this.pi = pi;
    }

    //Cilindro
    public figuras3D(float radio, float altura, double pi){
        this.radio = radio;
        this.pi = pi;
        this.altura = altura;
    }

    //Cubo
    public figuras3D(float lado){
        this.lado = lado;
    }

    //Piramide
    public figuras3D(float lado, float altura){
        this.altura = altura;
        this.lado = lado;
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

    public float volumenCubo(){
        return (this.lado*this.lado*this.lado);
    }

    public double volumenEsfera(){
        return ((1.3)*this.pi*(this.radio*this.radio*this.radio));
    }

    public float volumenPiramide(){
        return ((1/3)*(this.lado*this.lado)*altura);
    }

    public double volumenCilindro(){
        return (pi*(this.radio*this.radio)*this.altura);
    }
}
