package ws.idroid.database.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import ws.idroid.database.R;
import ws.idroid.database.model.Student;

public class ActiveAndroidActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqllite);

        Student student = initStudent(1, "Malik", "malik@gmail.com");
        student.save();
//    new Student() = Student.load(Student.class  ,1 );
       // Student.delete(Student.class,1);

        //More at
        //https://github.com/codepath/android_guides/wiki/ActiveAndroid-Guide

    }

    private Student initStudent(int studentId, String studentName, String studentEmail) {
        return new Student(studentId, studentName, studentEmail);
    }
}
