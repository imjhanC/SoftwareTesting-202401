package my.edu.utar;

import static org.mockito.Mockito.*;
import org.junit.Test;

import my.edu.utar.FileReaderClass;
import my.edu.utar.FileWriterClass;
import my.edu.utar.SampleClass;

public class SampleClassSpyTest {
	
	@Test
	public void testSampleMethod() {
		
		FileReaderClass frc = new FileReaderClass();
		FileWriterClass fwc = new FileWriterClass();
		
		//create spy based on concrete object
		FileReaderClass readSpy = spy(frc);
		FileWriterClass writeSpy = spy(fwc);
		
		// setting up a spy to return a value in place of the actual method
		when(readSpy.getNumberFromFile()).thenReturn(100);
				
		SampleClass sc = new SampleClass(readSpy, writeSpy);
		sc.sampleMethod();
		
		// verify the actual method was called 5 times with the value 100
		verify(writeSpy, times(5)).writeDataToFile(100);
	}
}
