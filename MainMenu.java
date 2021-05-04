import java.util.*;

public class MainMenu implements Kinematic_Formulas {
	
	Scanner scan = new Scanner (System.in);
	
	public void Menu () {
		System.out.println("----------------------------------------");
		System.out.println("Kinematic Calculator");
		System.out.println("----------------------------------------");
		System.out.println("1. Displacement Calculator");
		System.out.println("2. Velocity Calculator");
		System.out.println("3. Acceleration Calculator");
		System.out.println("4. Time Calculator");
		System.out.println("5. Program Exit");
		System.out.println("----------------------------------------");
		System.out.println("Please choose one of the options above.");
		System.out.print("Chosen option: ");
		int i = scan.nextInt();
		int j = 0;
		
		while (j == 0) { // allows the program to run until the user terminate 
			if (i==1) {
				displacement_calculator();
			}
			
			else if (i==2) {
				velocity_calculator();
			}
			
			else if (i ==3) {
				acceleration_calculator();
			}
			
			else if (i ==4) { 
				time_calculator();
			}
			
			else if (i ==5) {
				exit();		
			}
			
			else {
				System.out.println("----------------------------------------");
				System.out.println("Please choose one of the five options.");
				System.out.print("Chosen option: ");
				i = scan.nextInt();
			}
		}
	}
		
	
	public void displacement_calculator() { // final displacement calculator with two different formulas 
		double i_velocity;
		double f_velocity;
		double acceleration;
		double time;
		double i_displacement;
		double f_displacement;
		int j = 0;
		
		System.out.println("----------------------------------------");
		System.out.println("Welcome to Displacement Calculator");
		System.out.println("----------------------------------------");
		System.out.println("Please choose one of the options below.");
		System.out.println("1. Displacement Calculator with KNOWN time value");
		System.out.println("2. Displacement Calculator with UNKNOWN time value");
		System.out.println("----------------------------------------");
		System.out.print("Chosen option: ");
		int i = scan.nextInt();
		System.out.println("----------------------------------------");
		
		while (j == 0) { 
			if (i == 1) {
				System.out.println("Displacement Calculator with KNOWN time value");
				System.out.println("");
				System.out.print("Please enter the initial displacement value: ");
				i_displacement = scan.nextDouble();
				System.out.println("Initial displacement = " + i_displacement + " m");
				System.out.print("Please enter the initial velocity value: ");
				i_velocity = scan.nextDouble();
				System.out.println("Initial velocity = " + i_velocity + " m/s");
				System.out.print("Please enter the acceleration value: ");
				acceleration = scan.nextDouble();
				System.out.println("Acceleration = " + acceleration + " m/s^2");
				System.out.print("Please enter the time value: ");
				time = scan.nextDouble();
				System.out.println("Time = " + time + " s");
				f_displacement = (i_displacement + i_velocity * time + 0.5 * acceleration* time * time);
				System.out.println("");
				System.out.println("The final displacement value is "+ f_displacement + " m.");
				System.out.println("----------------------------------------");
				System.out.println("Would you like to solve another problem?");
				System.out.print("Answer: ");
				String answer;
				answer = scan.next();
				if (answer.equalsIgnoreCase("yes")) { // conditional for String input 
					Menu();
				}
				else if (answer.equalsIgnoreCase("no")){
					exit();
				}
				else {
					System.out.println("Please answer yes or no.");
					System.out.print("Answer: ");
					answer = scan.next();
				}
			}
				
			else if (i ==2) {
				System.out.println("Displacement Calculator with UNKNOWN time value");
				System.out.println("");
				System.out.print("Please enter the final velocity value: ");
				f_velocity = scan.nextDouble();
				System.out.println("Final velocity = " + f_velocity + " m/s");
				System.out.print("Please enter the initial velocity value: ");
				i_velocity = scan.nextDouble();
				System.out.println("Initial velocity = " + i_velocity + " m/s");
				System.out.print("Please enter the acceleration value: ");
				acceleration = scan.nextDouble();
				System.out.println("Acceleration = " + acceleration + " m/s^2");
				f_displacement = ((f_velocity * f_velocity) - (i_velocity * i_velocity)) / (2 * acceleration);
				System.out.println("");
				System.out.println("The final displacement value is " + f_displacement + " m.");
				System.out.println("----------------------------------------");
				System.out.println("Would you like to solve another problem?");
				System.out.print("Answer: ");
				String answer;
				answer = scan.next();
				if (answer.equalsIgnoreCase("yes")) {
					Menu();
				}
				else if (answer.equalsIgnoreCase("no")){
					exit();
				}
				else {
					System.out.println("Please answer yes or no.");
					System.out.print("Answer: ");
					answer = scan.next();
				}
			}
				
			else {
				System.out.println("Please choose one of the two options");
				System.out.println("1. Displacement with KNOWN time value");
				System.out.println("2. Displacement without KNOWN time value");
				System.out.println("----------------------------------------");
				System.out.print("Chosen Option: ");
				i = scan.nextInt();
			}
		}
	}
	
	public void velocity_calculator() { // initial and final velocity calculator with two different formulas each 
		double i_velocity;
		double f_velocity;
		double acceleration;
		double time;
		double t_displacement;
		double determinant;
		int j = 0;
		int k = 0;
		
		System.out.println("----------------------------------------");
		System.out.println("Welcome to Velocity Calculator");
		System.out.println("----------------------------------------");
		System.out.println("Please choose one of the options below.");
		System.out.println("1. Initial Velocity Calculator");
		System.out.println("2. Final Velocity Calculator");
		System.out.println("----------------------------------------");
		System.out.print("Chosen option: ");
		int i = scan.nextInt();
		System.out.println("----------------------------------------");
		
		while (j == 0) {
			if (i == 1) {
				System.out.println("Initial Velocity Calculator");
				System.out.println("----------------------------------------");
				System.out.println("Please choose one of the options below.");
				System.out.println("1. Velocity Calculator with KNOWN time value");
				System.out.println("2. Velocity Calculator with UNKNOWN time value");
				System.out.println("----------------------------------------");
				System.out.print("Chosen Option: ");
				i = scan.nextInt();
				System.out.println("----------------------------------------");
				
				while (k == 0) { 
					if (i == 1) {
						System.out.println("Velocity Calculator with KNOWN time value");
						System.out.println("");
						System.out.print("Please enter the final velocity value: ");
						f_velocity = scan.nextDouble();
						System.out.println("Final velocity = " + f_velocity+ " m/s");
						System.out.print("Please enter the acceleration value: ");
						acceleration = scan.nextDouble();
						System.out.println("Acceleration = " + acceleration + " m/s^2");
						System.out.print("Please enter the time value: ");
						time = scan.nextDouble();
						System.out.println("Time = " + time + "s");
						i_velocity = f_velocity - (acceleration * time);
						System.out.println("");
						System.out.println("The initial velocity value is "+ i_velocity + " m/s.");
						System.out.println("----------------------------------------");
						System.out.println("Would you like to solve another problem?");
						System.out.print("Answer: ");
						String answer;
						answer = scan.next();
						if (answer.equalsIgnoreCase("yes")) {
							Menu();
						}
						else if (answer.equalsIgnoreCase("no")){
							exit();
						}
						else {
							System.out.println("Please answer yes or no.");
							System.out.print("Answer: ");
							answer = scan.next();
						}
					}
					
					else if (i == 2) {
						System.out.println("Velocity Calculator with UNKNOWN time value");
						System.out.println("");
						System.out.print("Please enter the final velocity value: ");
						f_velocity = scan.nextDouble();
						System.out.println("Final velocity = " + f_velocity + " m/s");
						System.out.print("Please enter the acceleration value: ");
						acceleration = scan.nextDouble();
						System.out.println("Acceleration = " + acceleration + " m/s^2");
						System.out.print("Please enter the total displacement value: ");
						t_displacement = scan.nextDouble();
						System.out.println("Total displacement = " + t_displacement + " m");
						i_velocity = Math.sqrt((f_velocity * f_velocity) - (2 * acceleration * t_displacement));
						System.out.println("");
						if (i_velocity >= 0) {
							System.out.println("The initial velocity value is " + i_velocity + " m/s.");
						}
						else {
							System.out.println("There is no real value for initial velocity.");
						}
						System.out.println("----------------------------------------");
						System.out.println("Would you like to solve another problem?");
						System.out.print("Answer: ");
						String answer;
						answer = scan.next();
						if (answer.equalsIgnoreCase("yes")) {
							Menu();
						}
						else if (answer.equalsIgnoreCase("no")){
							exit();
						}
						else {
							System.out.println("Please answer yes or no.");
							System.out.print("Answer: ");
							answer = scan.next();
						}
					}
					
					else {
						System.out.println("Please choose one of the two options");
						System.out.println("1. Velocity Calculator with KNOWN time value");
						System.out.println("2. Velocity Calculator with UNKNOWN time value");
						System.out.println("----------------------------------------");
						System.out.print("Chosen Option: ");
						i = scan.nextInt();
					}
				}
			}
			while (k ==0) {
				if (i == 2) {
					System.out.println("Final Velocity Calculator");
					System.out.println("----------------------------------------");
					System.out.println("Please choose one of the options below.");
					System.out.println("1. Velocity Calculator with KNOWN time value");
					System.out.println("2. Velocity Calculator with UNKNOWN time value");
					System.out.println("----------------------------------------");
					System.out.print("Chosen Option: ");
					i = scan.nextInt();
					System.out.println("----------------------------------------");
					
					if (i == 1) {
						System.out.println("Velocity Calculator with KNOWN time value");
						System.out.println("");
						System.out.print("Please enter the initial velocity value: ");
						i_velocity = scan.nextDouble();
						System.out.println("Initial velocity = " + i_velocity + " m/s");
						System.out.print("Please enter the acceleration value: ");
						acceleration = scan.nextDouble();
						System.out.println("Acceleration = " + acceleration + " m/s^2");
						System.out.print("Please enter the time value: ");
						time = scan.nextDouble();
						System.out.println("Time = " + time + " s");
						f_velocity = i_velocity + (acceleration * time);
						System.out.println("");
						System.out.println("The final velocity value is " + f_velocity + " m/s.");
						System.out.println("----------------------------------------");
						System.out.println("Would you like to solve another problem?");
						System.out.print("Answer: ");
						String answer;
						answer = scan.next();
						if (answer.equalsIgnoreCase("yes")) {
							Menu();
						}
						else if (answer.equalsIgnoreCase("no")){
							exit();
						}
						else {
							System.out.println("Please answer yes or no.");
							System.out.print("Answer: ");
							answer = scan.next();
						}
					}
					
					if (i == 2) {
						System.out.println("Velocity Calculator with UNKNOWN time value");
						System.out.println("");
						System.out.print("Please enter the inital velocity value: ");
						i_velocity = scan.nextDouble();
						System.out.println("Initial velocity = " + i_velocity + " m/s");
						System.out.print("Please enter the acceleration value: ");
						acceleration = scan.nextDouble();
						System.out.println("Acceleration = " + acceleration + " m/s^2");
						System.out.print("Please enter the total displacement value: ");
						t_displacement = scan.nextDouble();
						System.out.println("Total displacement = "+ t_displacement + " m");
						determinant = Math.pow(i_velocity, i_velocity) + (2 * acceleration * t_displacement); // finding square root of a number
						if (determinant >= 0) {
							f_velocity = Math.sqrt(determinant);
							System.out.println("The final velocity value is "+ f_velocity + " m/s.");
						}
						else {
							System.out.println("There is no real value of final velocity.");
						}
						System.out.println("");
						System.out.println("----------------------------------------");
						System.out.println("Would you like to solve another problem?");
						System.out.print("Answer: ");
						String answer;
						answer = scan.next();
						if (answer.equalsIgnoreCase("yes")) { 
							Menu();
						}
						else if (answer.equalsIgnoreCase("no")){
							exit();
						}
						else {
							System.out.println("Please answer yes or no.");
							System.out.print("Answer: ");
							answer = scan.next();
						}
					}
					
					else {
						System.out.println("Please choose one of the two options");
						System.out.println("1. Velocity Calculator with KNOWN time value");
						System.out.println("2. Velocity Calculator with UNKNOWN time value");
						System.out.println("----------------------------------------");
						System.out.print("Chosen Option: ");
						i = scan.nextInt();
					}
				}
				
				else {
					System.out.println("Please choose one of the two options");
					System.out.println("1. Initial Velocity Calculator");
					System.out.println("2. Final Velocity Calculator");
					System.out.println("----------------------------------------");
					System.out.print("Chosen option: ");
					i = scan.nextInt();
					System.out.println("----------------------------------------");
				}	
			}
		}
	}
	
	public void acceleration_calculator() { // acceleration calculator with three different formulas 
		double i_velocity;
		double f_velocity;
		double acceleration;
		double time;
		double i_displacement;
		double f_displacement;
		double t_displacement;
		int j = 0;

		System.out.println("----------------------------------------");
		System.out.println("Welcome to Acceleration Calculator");
		System.out.println("----------------------------------------");
		System.out.println("Please choose one of the options below.");
		System.out.println("1. Acceleration Calculator with KNOWN time value");
		System.out.println("2. Acceleration Calculator with UNKNOWN time value");
		System.out.println("3. Acceleration Calculator with AVERAGE velocity using TIME value");
		System.out.println("----------------------------------------");
		System.out.print("Chosen option: ");
		int i = scan.nextInt();
		System.out.println("----------------------------------------");
		
		while (j == 0) {
			if (i == 1) {
				System.out.println("Acceleration Calculator with KNOWN time value");
				System.out.println("");
				System.out.print("Please enter the final displacement value: ");
				f_displacement = scan.nextDouble();
				System.out.println("Final displacement = "+ f_displacement + " m");
				System.out.print("Please enter the initial displacement value: ");
				i_displacement = scan.nextDouble();
				System.out.println("Initial displacement = "+ i_displacement + " m");
				System.out.print("Please enter the initial velocity value: ");
				i_velocity = scan.nextDouble();
				System.out.println("Initial velocity = "+ i_velocity + " m/s");
				System.out.print("Please enter the time value: ");
				time = scan.nextDouble();
				System.out.println("Time = "+ time + " s");
				acceleration = 2 * (f_displacement - i_displacement - i_velocity * time) / Math.pow(time,time); // squaring number 
				System.out.println("");
				System.out.println("The acceleration value is "+ acceleration + " m/s^2.");
				System.out.println("----------------------------------------");
				System.out.println("Would you like to solve another problem?");
				System.out.print("Answer: ");
				String answer;
				answer = scan.next();
				if (answer.equalsIgnoreCase("yes")) {
					Menu();
				}
				else if (answer.equalsIgnoreCase("no")){
					exit();
				}
				else {
					System.out.println("Please answer yes or no.");
					System.out.print("Answer: ");
					answer = scan.next();
				}
			}
			
			else if (i == 2) {
				System.out.println("Acceleration Calculator with UNKNOWN time value");
				System.out.println("");
				System.out.print("Please enter the final velocity value: ");
				f_velocity = scan.nextDouble();
				System.out.println("Final velocity = " + f_velocity + " m/s");
				System.out.print("Please enter the initial velocity value: ");
				i_velocity = scan.nextDouble();
				System.out.println("Initial velocity = " + i_velocity + " m/s");
				System.out.print("Please enter the total displacement value: ");
				t_displacement = scan.nextDouble();
				System.out.println("Total displacement = " + t_displacement + " m");
				acceleration = (Math.pow(f_velocity, f_velocity) - Math.pow(i_velocity, i_velocity)) / (2 * t_displacement);
				System.out.println("");
				System.out.println("The acceleration value is "+ acceleration + " m/s^2.");
				System.out.println("----------------------------------------");
				System.out.println("Would you like to solve another problem?");
				System.out.print("Answer: ");
				String answer;
				answer = scan.next();
				if (answer.equalsIgnoreCase("yes")) {
					Menu();
				}
				else if (answer.equalsIgnoreCase("no")){
					exit();
				}
				else {
					System.out.println("Please answer yes or no.");
					System.out.print("Answer: ");
					answer = scan.next();
				}
			}
			
			else if (i == 3) {
				System.out.println("Acceleration Calculator with AVERAGE velocity using TIME value");
				System.out.println("");
				System.out.print("Please enter the final velocity value: ");
				f_velocity = scan.nextDouble();
				System.out.println("Final velocity = "+ f_velocity + " m/s");
				System.out.print("Please enter the initial velocity value: ");
				i_velocity = scan.nextDouble();
				System.out.println("Initial velocity = "+ i_velocity + " m/s");
				System.out.print("Please enter the time value: ");
				time = scan.nextDouble();
				System.out.println("Time = "+ time + " s");
				acceleration = f_velocity - i_velocity / time;
				System.out.println("");
				System.out.println("The acceleration value is "+ acceleration + " m/s^2.");
				System.out.println("----------------------------------------");
				System.out.println("Would you like to solve another problem?");
				System.out.print("Answer: ");
				String answer;
				answer = scan.next();
				if (answer.equalsIgnoreCase("yes")) {
					Menu();
				}
				else if (answer.equalsIgnoreCase("no")){
					exit();
				}
				else {
					System.out.println("Please answer yes or no.");
					System.out.print("Answer: ");
					answer = scan.next();
				}
			}
			
			else {
				System.out.println("Please choose one of the three options");
				System.out.println("1. Acceleration Calculator with KNOWN time value");
				System.out.println("2. Acceleration Calculator with UNKNOWN time value");
				System.out.println("3. Acceleration Calculator with AVERAGE velocity using TIME value");
				System.out.println("----------------------------------------");
				System.out.print("Chosen option: ");
				i = scan.nextInt();
				System.out.println("----------------------------------------");
			}
		}
	}
	
	public void time_calculator() { // time calculator with two different formulas 
		double i_velocity;
		double f_velocity;
		double acceleration;
		double time = 0;
		double i_displacement;
		double f_displacement;
		double time_2 = 0;
		double first_root;
		double second_root;
		int j = 0;
		
		System.out.println("----------------------------------------");
		System.out.println("Welcome to Time Calculator");
		System.out.println("----------------------------------------");
		System.out.println("Please choose one of the options below.");
		System.out.println("1. Time Calculator with KNOWN displacement value");
		System.out.println("2. Time Calculator with UNKNOWN displacement value");
		System.out.println("----------------------------------------");
		System.out.print("Chosen option: ");
		int i = scan.nextInt();
		System.out.println("----------------------------------------");
		
		while (j == 0) {
			if (i == 1) {
				System.out.println("Time Calculator with KNOWN displacement value");
				System.out.println("");
				System.out.print("Please enter the final displacement value: ");
				f_displacement = scan.nextDouble();
				System.out.println("Final displacement = "+ f_displacement + " m");
				System.out.print("Please enter the initial displacement value: ");
				i_displacement = scan.nextDouble();
				System.out.println("Initial displacement = "+ i_displacement + " m");
				System.out.print("Please enter the initial velocity value: ");
				i_velocity = scan.nextDouble();
				System.out.println("Initial velocity = "+ i_velocity + " m/s");
				System.out.print("Please enter the acceleration value: ");
				acceleration = scan.nextDouble();
				System.out.println("Acceleration = "+ acceleration + " m/s^2");
				double determinant = Math.pow(i_velocity, i_velocity) - (2 * acceleration * (i_displacement - f_displacement));
				double sqrt = Math.sqrt(determinant); // quadratic equation 
				if (sqrt> 0) {
					first_root = (-i_velocity + sqrt) / acceleration;
					second_root = (-i_velocity - sqrt) / acceleration;
					if (first_root > 0) {
						time = first_root;
					}
					else if (second_root > 0) {
						time = second_root;
					}
					else if (first_root > 0 && second_root > 0) {
						time = first_root;
						time_2 = second_root;
					}
					else if (first_root == 0 && second_root == 0) {
						time = 0;
						time_2 = 0;
					}
				}
				System.out.println("");
				if (time > 0) {
					System.out.println("The time value is "+ time + " s.");
				}
				else if (time_2 > 0) {
					System.out.println("The time value is "+ time_2 + " s.");
				}
				else if (time > 0 && time_2 > 0) {
					System.out.println("The time value is "+ time + " s.");
					System.out.println("The time value is "+ time_2 + " s.");
				}
				else if (time <= 0 && time_2 <=0) {
					System.out.println("There is no real answer.");
				}
				System.out.println("----------------------------------------");
				System.out.println("Would you like to solve another problem?");
				System.out.print("Answer: ");
				String answer;
				answer = scan.next();
				if (answer.equalsIgnoreCase("yes")) {
					Menu();
				}
				else if (answer.equalsIgnoreCase("no")){
					exit();
				}
				else {
					System.out.println("Please answer yes or no.");
					System.out.print("Answer: ");
					answer = scan.next();
				}
			}
			
			else if (i == 2) {
				System.out.println("Time Calculator with UNKNOWN displacement value");
				System.out.println("");
				System.out.print("Please enter the final velocity value: ");
				f_velocity = scan.nextDouble();
				System.out.println("Final velocity = " + f_velocity + " m/s");
				System.out.print("Please enter the initial velocity value: ");
				i_velocity = scan.nextDouble();
				System.out.println("Initial velocity = " + i_velocity + " m/s");
				System.out.print("Please enter the acceleration value: ");
				acceleration = scan.nextDouble();
				System.out.println("Acceleration = " + acceleration + " m/s^2");
				time = f_velocity - i_velocity / acceleration;
				System.out.println("");
				System.out.println("The time value is "+ time + " s.");
				System.out.println("----------------------------------------");
				System.out.println("Would you like to solve another problem?");
				System.out.print("Answer: ");
				String answer;
				answer = scan.next();
				if (answer.equalsIgnoreCase("yes")) {
					Menu();
				}
				else if (answer.equalsIgnoreCase("no")){
					exit();
				}
				else {
					System.out.println("Please answer yes or no.");
					System.out.print("Answer: ");
					answer = scan.next();
				}
			}
			
			else {
				System.out.println("Please choose one of the two options");
				System.out.println("1. Time Calculator with KNOWN displacement value");
				System.out.println("2. Time Calculator with UNKNOWN displacement value");
				System.out.println("----------------------------------------");
				System.out.print("Chosen option: ");
				i = scan.nextInt();
				System.out.println("----------------------------------------");
			}
		}
	}
	
	public void exit() {
		System.out.println("----------------------------------------");
		System.out.println("We hope we solved your problem. Goodbye!");
		System.out.println("----------------------------------------");
		System.exit(0);
	}
	
	public static void main (String [] args) {
		MainMenu test = new MainMenu();
		test.Menu();
	}
}

