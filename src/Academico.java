public class Academico extends Persona{
    private String paper;
    public Academico(int age, String name, String oc, String pp){
        super(age, name, oc);
        paper = pp;
    }

    public void dormir() {
        System.out.println("ZzzZzZz");
    }

    public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "Aprendo zoom";
    }

    public void publicarPpaer(){
        System.out.println(this.paper);
    }
}
