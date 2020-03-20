public class Estudiante extends Persona {
    public Estudiante(int age, String name, String oc){
        super(age, name, oc);
    }

    public void comer() {
        System.out.println("Ñom Ñom completos");
    }

    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "Netflix y animé";
    }
}
