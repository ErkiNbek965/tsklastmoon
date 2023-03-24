import enums.Gender;
import model.Group;
import model.Student;
import service.StudentServic;
import service.impl.GroupServicImpl;
import service.impl.StudentServicImpl;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        StudentServicImpl studentServicimpl = new StudentServicImpl();
        GroupServicImpl groupServicimpl = new GroupServicImpl();
        Group group = new Group();
        groupServicimpl.addNewGroup(new Group(1,"Python","Language",2023));
        groupServicimpl.addNewGroup(new Group(2,"java","usa",2022));
        groupServicimpl.addNewGroup(new Group(3,"js","russia",2023));


        groupServicimpl.getGroupById(1);
        System.out.println(groupServicimpl);

      //  studentServicimpl.addStudent(new Student("Erkinbek",18, Gender.Male)

    }
}