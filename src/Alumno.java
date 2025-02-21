
public class Alumno {

    //Atributos
    private String DNI;
    private int NP;
    private String nombreCompleto;

    public Alumno() {//metodo constructor por defecto
                     //Si no se indica nada se asignan valores por defecto
        DNI = "00000000A";
        NP = 0;
        nombreCompleto = "Nombre Apellido1 Apellido2";
    }


    public Alumno(String DNIp, int NPp, String nombreCompletop) throws IllegalAccessException {

        char primerDigito = DNI.charAt(0);
        if (Character.isDigit(primerDigito)){
            throw new IllegalAccessException("DNI incorrecto");
        }
        if (NPp <= 0){
            throw new IllegalAccessException("NP incorrecto");
        }
        DNI = DNIp;
        NP = NPp;
        nombreCompleto = nombreCompletop;
    }


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI)  throws IllegalAccessException {
        this.DNI = DNI;
        char primerDigito = DNI.charAt(0);
        if (Character.isDigit(primerDigito)){
            throw new IllegalAccessException("DNI incorrecto");
        }
    }

    public int getNP() {
        return NP;
    }

    public void setNP(int NP) throws IllegalAccessException {
        this.NP = NP;
        if (NPp <= 0){
            throw new IllegalAccessException("NP incorrecto");
        }
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void mostrarDatos(){
        System.out.println("DNI: " + DNI);
        System.out.println("NP: " + NP);
        System.out.println("Nombre Completo: " + nombreCompleto);
    }
}
