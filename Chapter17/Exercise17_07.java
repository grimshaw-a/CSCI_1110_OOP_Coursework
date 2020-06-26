import java.io.*;

public class Exercise17_07 {    
	public static void main(String[] args) throws FileNotFoundException {
		Loan loan1 = new Loan();        
		Loan loan2 = new Loan(1.8, 10, 10000);        
		try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));) {            
			output.writeObject(loan1);            
			output.writeObject(loan2);        
		} catch (IOException ex) {            
			System.out.println("File could not be opened");        
		}    		
		outputData("Exercise17_07.dat");
	}
	public static void outputData(String filename) {
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename));

			double sum = 0.0;
			Loan tempLoan;
			boolean end = false;
			
			while (end == false) try {
				tempLoan = (Loan)input.readObject();
				sum += tempLoan.getLoanAmount();
			} catch (EOFException e) {
				System.out.println(sum);
				end = true;
			}
		} catch (Exception e) {
			System.out.println("Failed on input.");
		}
	}
}