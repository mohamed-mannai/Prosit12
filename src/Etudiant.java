public class Etudiant {

    private int id,age;
    private String nom;

    public Etudiant(){}
    public Etudiant(int id,String nom,int age){
        this.id=id;
        this.nom=nom;
        this.age=age;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", age=" + age +
                ", nom='" + nom + '\'' +
                '}';
    }
}
