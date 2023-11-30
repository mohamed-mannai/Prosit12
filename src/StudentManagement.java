import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentManagement implements Management<Etudiant>{
    public void displayStudents(List<Etudiant> students,
                         Consumer<Etudiant> con){
        students.forEach(student -> con.accept(student));

    }
    public void displayStudentsByFilter(List<Etudiant> students,
                                 Predicate<Etudiant> pre, Consumer<Etudiant> con){
        students.stream().filter(pre).forEach(con);

    }
    public String returnStudentsNames(List<Etudiant> students,
                               Function<Etudiant, String> fun){
        StringBuilder names = new StringBuilder();
        students.forEach(student -> names.append(fun.apply(student)).append(", "));
        return names.toString();

    }
    public Etudiant createStudent(Supplier<Etudiant> sup){
        return sup.get();

    }
    public List<Etudiant> sortStudentsById(List<Etudiant> students,
                                           Comparator<Etudiant> com){
        students.sort(com);
        return students;

    }
}
