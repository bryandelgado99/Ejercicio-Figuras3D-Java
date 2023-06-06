public class Main {
    public static void main(String args[]){

        //Instancias
        figuras3D esfera = new figuras3D(6.3f,3.14);
        figuras3D cilindro = new figuras3D(9.3f, 8.3f, 3.14);
        figuras3D cubo = new figuras3D(7.3f);
        figuras3D piramide = new figuras3D(4.2f, 7.4f);


        double pi= esfera.getPi();
        esfera.setPi(pi);
        cilindro.setPi(pi);

        System.out.println(esfera.volumenEsfera());
        System.out.println(cubo.volumenCubo());
        System.out.println(cilindro.volumenCilindro());
        System.out.println(piramide.volumenPiramide());

    }

}
