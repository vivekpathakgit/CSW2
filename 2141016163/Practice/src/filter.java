import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filter {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileReader Obj = new FileReader("Attendance.csv");
		BufferedReader reader = new BufferedReader(Obj);
        
		FileWriter fileWriter = new FileWriter("convertedText.txt", true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String line = reader.readLine();
		
		while(line != null) {
			String ans[] = line.split(",+", 0);
			String result = ans[0];
			for(int i = 1; i<ans.length; i++) {
				result = result + "," + ans[i];
			}
			System.out.println(result);
			bufferedWriter.write(result + "\n");
			line = reader.readLine();
		}
		
		reader.close();
		bufferedWriter.close();
	}

}
