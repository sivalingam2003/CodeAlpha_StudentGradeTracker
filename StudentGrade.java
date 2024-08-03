package codealpha;
import java.util.*;
public class StudentGrade {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		List<Double> cgpa = new ArrayList<>();
		Map<Integer,List<String>> result = new HashMap<>();
		double HighMark=0,LowMark=10;
		System.out.printf("Enter Number of Students:");
		int tostalStudent=sc.nextInt(); 
		System.out.printf("No of subjects :");
		int numSubject=sc.nextInt();
		for(int i=0;i<tostalStudent;i++)
		{
			System.out.printf("Enter Roll number: ");
			int rollnum=sc.nextInt();
			List<String> grade = new ArrayList<>();
			int sum=0;
			for(int j=0;j<numSubject;j++)
			{
				System.out.printf("Enter mark of %d: ",j+1);
				int mark= sc.nextInt();
				String gradeChar;
				if(mark==100)
					gradeChar="O";
				else if(mark>=90)
					gradeChar="A+";
				else if(mark>=80)
					gradeChar="A";
				else if(mark>=70)
					gradeChar="B+";
				else if(mark>=60)
					gradeChar="B";
				else if(mark>=50)
					gradeChar="C";
				else
					gradeChar="F";
				grade.add(gradeChar);
				sum+=mark;
			}
			double avg=sum/(numSubject*10.000);
			cgpa.add(avg);
			result.put(rollnum, grade);
			if(HighMark<avg)
				HighMark=avg;
			if(LowMark>avg)
				LowMark=avg;
			}
			sc.close();
			List<Integer> rollno= new ArrayList<>(result.keySet());
				for(Integer num: rollno) 
				{
					System.out.println("Roll Number: "+num);
					System.out.println("Grades: " + result.get(num));
					System.out.printf("CGPA: %.2f\n",cgpa.get(rollno.indexOf(num)));
				}
			System.out.println("Highest Score:"+HighMark*10);
			System.out.println("Lowest Score:"+LowMark*10);
		}

}
