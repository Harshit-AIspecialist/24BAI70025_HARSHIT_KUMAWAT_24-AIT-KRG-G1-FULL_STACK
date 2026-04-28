import jakarta.persistence.*;

@Entity
@Table(name = "students") 
public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;

    @Column(name = "full_name", nullable = false, length = 100)
    private String name;

    @Column(unique = true, nullable = false) 
    private String email;

    private String course;
    public Student() {}

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

}
