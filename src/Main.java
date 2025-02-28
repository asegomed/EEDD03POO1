public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Alumno a1= new Alumno();
        Alumno a2= new Alumno("11345687A", 123, "Asdas asdasd aadad");

        System.out.println("a1: " + a1.toString()); //"00...  0 "nombre   "
        System.out.println("a2: " + a2.toString());//"11 123 Asdas asdasd aadad"

        Alumno a3 = a2;
        System.out.println("a3: " + a3.toString());//"11 123 Asdas asdasd aadad"

        Alumno a4= new Alumno("11345687A", 123, "Asdas asdasd aadad");
        System.out.println("a4: " + a4.toString());//"11 123 Asdas asdasd aadad"

        //a4.setDNI("A11345687A"); //No es posible poner un DNI que empieze por una letra
        //a4.setNP(-3); //No es posible poner un NP negativo

        int a = 19;
        int b = a;
        if (a==b){
            System.out.println("a y b tienen el mismo valor " + a + " " + b);
        }

        if (a1 == a2){
            System.out.println("a1 y a2 tienen el mismo valor");
        } else {
            System.out.println("a1 y a2 NO tienen el mismo valor");
        }
    }
}