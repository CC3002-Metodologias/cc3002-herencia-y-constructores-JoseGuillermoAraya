public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(int age, String name, String oc){
        nombre = name;
        edad = age;
        ocupacion = oc;
    }

    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "CUARENTENA + ";
    }
}
