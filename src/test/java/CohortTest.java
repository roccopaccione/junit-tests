import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {

    @Test
    public void testAddStudentToList(){

        Cohort bio = new Cohort();
        bio.addStudent(new Student(1l, "Rocco"));
        assertFalse(bio.getStudents().isEmpty());

    }
}
