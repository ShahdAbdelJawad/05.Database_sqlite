package ws.idroid.database.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.*;

import java.util.List;

@Table(name = "students")
public class Student extends Model {
    @Column(name = "student_id", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public Integer studentId;
    @Column(name = "Name")
    public String name;
    @Column(name = "Email")
    public String email;

    private List<Contact> contact;

    // Make sure to have a default constructor for every ActiveAndroid model
    public Student() {
        super();
    }

    public Student(int studentId, String studentName, String studentEmail) {
        super();
        this.studentId = studentId;
        this.name = studentName;
        this.email = studentEmail;
    }

    @Override
    public String toString() {
        return name;
    }
}
