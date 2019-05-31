package ir.maktab;

import ir.maktab.model.Address;
import ir.maktab.model.DAO.StudentDAO;
import ir.maktab.model.DAO.StudentDAOImpl;
import ir.maktab.model.DAO.TeacherDAO;
import ir.maktab.model.DAO.TeacherDAOImpl;
import ir.maktab.model.Student;
import ir.maktab.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();


        TeacherDAO teacherDAO = new TeacherDAOImpl(factory);
        StudentDAO studentDAO = new StudentDAOImpl(factory);


        //every time this command open a new connection to the database.
        Session session = factory.openSession();


        //add to database

        Teacher teacher1 = new Teacher("Mohamad","hashemi",1234L,2000.00,LocalDate.of(1995,2,10));
        Teacher teacher2 = new Teacher("Mohamad1","hashemi",1235L,2500.00,LocalDate.of(1995,3,10));
        Teacher teacher3 = new Teacher("Mohamad2","hashemi",1236L,2800.00,LocalDate.of(1995,10,10));
        Teacher teacher4 = new Teacher("Mohamad3","hashemi",1237L,1000.00,LocalDate.of(1995,5,10));
        Teacher teacher5 = new Teacher("Mohamad4","hashemi",1238L,3000.00, LocalDate.of(1992,12,10));


        Student student1 = new Student("Mehdi", "Moghadam");
        Student student2 = new Student("Mohammad", "Aghayi");
        Student student3 = new Student("Mojtaba", "Noori");
        Student student4 = new Student("Hassan", "Ghasemi");
        Student student5 = new Student("Kamran", "Ghazi");


        Address address1 = new Address("Karaj", "Alborz", 093576756, "first avenue number 3",2563454L);
        Address address2 = new Address("Rasht", "Gilan", 091234512, "first avenue number 3",2563454L);
        Address address3 = new Address("Shahriar", "Tehran", 091234512, "first avenue number 3",2563454L);
        Address address4 = new Address("Karaj", "Alborz", 093837612, "first avenue number 3",2563454L);
        Address address5 = new Address("Tehran", "Tehran", 090334512, "first avenue number 3",2563454L);


        teacher1.setAddress(address1);
        teacher2.setAddress(address2);
        teacher3.setAddress(address3);
        teacher4.setAddress(address4);
        teacher5.setAddress(address5);


        student1.setAddress(address1);
        student2.setAddress(address2);
        student3.setAddress(address3);
        student4.setAddress(address4);
        student5.setAddress(address5);

        teacherDAO.create(teacher1);
        teacherDAO.create(teacher2);
        teacherDAO.create(teacher3);
        teacherDAO.create(teacher4);
        teacherDAO.create(teacher5);

        studentDAO.create(student1);
        studentDAO.create(student2);
        studentDAO.create(student3);
        studentDAO.create(student4);
        studentDAO.create(student5);

    }
}
