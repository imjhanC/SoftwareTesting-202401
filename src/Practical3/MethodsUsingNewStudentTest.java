package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodsUsingNewStudentTest {

	@Test
	public void testFindStudentWithName() {
		MethodsUsingNewStudent MUNS = new MethodsUsingNewStudent();
		
		// Test case 1: Student with the specified name prefix is found
		NewStudent[] stuArray1 = {new NewStudent("John",25),new NewStudent("Jane",21),new NewStudent("John",25),new NewStudent("Jimmy",35)};
		String startStr1 ="Ja";
		NewStudent expectedtStudent1= stuArray1[1];
		
		// Test case 2: No student with the specified name prefix is found
        NewStudent[] stuArray2 = { new NewStudent("Alice", 28), new NewStudent("Bob", 26), new NewStudent("Charlie", 24) };
        String startStr2 = "Z";
        
        //assertEquals(expectedStudent1,MUNS.findStudentWithName(stuArray1, startStr1));
        
        // For the second test case, expect null as no student has the specified name prefix
        assertNull(MUNS.findStudentWithName(stuArray2, startStr2));
    

	
        
        
        @Test
        public void testFindOverAgedStudents() {
            // Arrange
            MethodsUsingNewStudent methodsInstance = new MethodsUsingNewStudent();

            // Test case 1: Students over the age limit are found
            NewStudent[] stuArray1 = { new NewStudent("John", 25), new NewStudent("Jane", 22), new NewStudent("Jim", 30) };
            int ageLimit1 = 25;
            NewStudent[] expectedStudents1 = { stuArray1[0], stuArray1[2] };

            // Test case 2: No students over the age limit are found
            NewStudent[] stuArray2 = { new NewStudent("Alice", 22), new NewStudent("Bob", 24), new NewStudent("Charlie", 23) };
            int ageLimit2 = 25;

            // Act and Assert
            assertArrayEquals(expectedStudents1, methodsInstance.findOverAgedStudents(stuArray1, ageLimit1));

            // For the second test case, expect an empty array as no students are over the age limit
            assertArrayEquals(new NewStudent[0], methodsInstance.findOverAgedStudents(stuArray2, ageLimit2));
        }
	}

}
