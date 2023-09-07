// Program to enter roll no and get marks.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StudentInfo
 	{
	int rollno;
	float marks;
	
	void setData(int rollno, float marks)
	{
		this.rollno= rollno;
		this.marks=marks;
	}
	
	void getData()
	{
		System.out.println("My Roll No : "+rollno);
		System.out.println("My Marks : "+marks);
	}
 }	
	public class Student 
	{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Roll no");
		String str=br.readLine();
		int rn = Integer.parseInt(str);
		StudentInfo s1 = new StudentInfo();
		
		s1.setData(rn,70.5f);
		s1.getData();
	}

	}

