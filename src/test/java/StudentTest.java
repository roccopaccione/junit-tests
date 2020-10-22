import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreateStudent(){
        Student rocco = new Student(1L, "Rocco");
        Student leonardo = new Student(2L, "Leonardo");
        assertNotNull(rocco);
        assertNotNull(leonardo);
    }

    @Test
    public void testStudentFields(){
        Student rocco = new Student(1L, "Rocco");
        assertEquals("Rocco", rocco.getName());
        assertEquals(1L, rocco.getId());
    }

    @Test
    public void testAddGrade(){
        Student rocco = new Student(1L, "Rocco");
        rocco.addGrade(95);
        assertEquals(95, (int)rocco.getGrades().get(0));
    }

    @Test
    public void testAverageGrade(){
        Student rocco = new Student(1L, "Rocco");
        rocco.addGrade(95);
        rocco.addGrade(85);
        assertEquals(90.0, rocco.getGradeAverage(), 0);
    }
}
