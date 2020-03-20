public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona(12,"JuAn", "persona");
        Estudiante e1 = new Estudiante(12,"JuAn", "persona");
        Academico a1 = new Academico(12,"JuAn", "persona", "tremendo paper");

        p1.comer();
        e1.comer();
        a1.comer();

        p1.dormir();
        e1.dormir();
        a1.dormir();

        System.out.println(p1.hacerLoSuyo());
        System.out.println(e1.hacerLoSuyo());
        System.out.println(a1.hacerLoSuyo());

        a1.publicarPpaer();


    }
}
