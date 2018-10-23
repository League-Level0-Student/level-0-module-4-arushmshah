package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String PET = JOptionPane.showInputDialog("What kind of pet do you want?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0; i<5; i++) {
			int task = JOptionPane.showOptionDialog(null, "What they want to do to make their pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go on a walk", "Give it treats", "Leave it outside in the rain" }, null);
				if(task==0) {
					Walk();
				}
				if(task==1) {
					Treats();
				}
				if(task==2) {
					Outrain();
				}
					if(happinessLevel>10) {
						JOptionPane.showMessageDialog(null, "You have 10 happiness points, you love your pet a lot"); System.exit(0);
					}
				
		}
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.

			int task = JOptionPane.showOptionDialog(null, "What they want to do to make their pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go on a walk", "Give it treats", "Leave it outside in the rain" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task==0) {
	Walk();
}
if(task==1) {
	Treats();
}
if(task==2) {
	Outrain();
}


			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel>10) {
	JOptionPane.showMessageDialog(null, "You have 10 happiness points, you love your pet a lot"); System.exit(0);
}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void Walk() {
	JOptionPane.showMessageDialog(null, "Your pet got exercise and is happy you get 2 points!");
	happinessLevel+=2;
	}
	static void Treats() {
		JOptionPane.showMessageDialog(null, "Your pet loved the treats and is happy you get 2 points!");	
		happinessLevel+=2;
		}
	
	static void Outrain() {
		JOptionPane.showMessageDialog(null, "Your pet got wet and cold, you get -2 points");	
		happinessLevel-=2;
		}
}