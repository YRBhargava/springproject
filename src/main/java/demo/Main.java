package demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        System.out.println(doctor.getQualification());
        Nurse nurse = (Nurse)context.getBean("nurse");
        nurse.assist();
        // decoupled
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
        
       // context.close();
    }
}