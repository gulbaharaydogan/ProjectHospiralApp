package cse;

import java.util.Scanner;
public class lesson {
 
     public static void main(String[] args) {

System.out.println("Welcome to Marmara Hospital Emergency Service Request Program!");

 Scanner input = new Scanner(System.in);

System.out.println("Do you have any of the below symptoms ?");

     redzone();

System.out.println("if you have enter y (yes), otherwise enter n (no).");

char ch= input.next().charAt(0);
char answer = 'y';
char answer2 = 'n';

while(ch != answer) {
	if(ch == answer2)
		break;
	System.out.println("You entered invalid value. Please enter again");
	ch = input.next().charAt(0);
}

  switch(ch) {
    case 'y' : System.out.println("Dial the Emergency service extension number 112. \n Please stay calm after speaking to the authorized person. \n The authorities will be with you as soon as possible");
       return;
    case 'n' : System.out.println("Please answer the questions");
       break;   
       }

System.out.println("Please choose which user you are! \n If you are patient, enter 1, \n if you are a relative of the patient, enter 2.");

   short user= input.nextShort();
   short answer1 = 1;
   short answer3 = 2;

 while(user != answer1) {
	if(user == answer3)
		break;
System.out.println("You entered invalid value. Please enter again");
   user = input.nextShort();
}

 if(user == 1) {
	
System.out.println("WARNING: \n Please take care not to occupy the application for your own and your loved ones' health. \n  Make sure to answer the questions correctly and effectively. \n In case of abusing the program and making it busy, a fine of 365 TL will be imposed.");
System.out.println("Enter 0 if you approve the given text, enter 1 if you don't");
	
   short approve = input.nextShort();

 while(approve != 0) {
System.out.println("To continue you should approve the text. Please approve it");
   approve = input.nextShort();
	}
    if (approve==0) {
	
     patientInformation();
		}}
 else if(user == 2){
	
System.out.println("WARNING: Please take care not to occupy the application for your own and your loved ones' health.\n Make sure to answer the questions correctly and effectively.\n In case of abusing the program and making it busy, a fine of 365 TL will be imposed.");
System.out.println("Enter 0 if you approve the given text, enter 1 if you don't");
    
   short approve = input.nextShort();

 while(approve != 0) {
System.out.println("To continue you should approve the text. Please approve it");
   approve = input.nextShort();
	}
	if (approve==0) {
		
     relativeVersion();
		}}

 input.close();

}

     public static void patientInformation() {
		
 Scanner input = new Scanner(System.in);
 
        System.out.println("Please, enter your name ");
		
		String name = input.next();
		
	    System.out.println("Please, enter your surname ");
		
		String surname = input.next();
		
		System.out.println("Please, enter your TR ID number");
		long IDnumber = input.nextLong();
		System.out.println("Please, if you are female, enter 0 or you are male, press 1");
		short gender = input.nextShort();
		
		short answer4 = 0;
		short answer5 = 1;

		while(gender != answer4) {
			if(gender == answer5)
				break;
			System.out.println("You entered invalid value. Please enter again");
			gender = input.nextShort();
		}
		
		System.out.println("please enter your age");
		byte age = input.nextByte();
		
        yellowZone();
		patientLabel(name, surname, IDnumber, gender, age);
		
 input.close();
}

     public static void patientLabel(String name, String surname, Long IDnumber, Short gender, byte age) {
		
		System.out.println("patient name is " + name + "  " + surname );
		System.out.println("ID number is " + IDnumber);
		if(gender == 0)
			System.out.println("gender is female");
		else {
			System.out.println("gender is male"); }
		System.out.println("age is " + age);
	}

     public static void relativeVersion() {
		
 Scanner input = new Scanner(System.in);
 
		System.out.println("Please enter patient's name ");
	    String nameofpatient = input.next();
	    
	    System.out.println("Please enter patient's surname ");
	    String surnameofpatient = input.next();
	    
	    System.out.println("Please, enter patient's TR ID number");
		long IDnumber = input.nextLong();
		
	    System.out.println("if patient is female, enter 0 or patient is male, enter 1");
		short gender = input.nextShort();
		
		short answer6 = 0;
		short answer7 = 1;

		while(gender != answer6) {
			if(gender == answer7)
				break;
			System.out.println("You entered invalid value. Please enter again");
			gender = input.nextShort();
		}
		
	    System.out.println("Please enter patient's age ");
		int age = input.nextInt();
		
		yellowZone();
		patientLabelRelative(nameofpatient, surnameofpatient, IDnumber, gender, age);
	
 input.close();
	}

     public static void patientLabelRelative(String nameofpatient, String surnameofpatient, Long IDnumber, Short gender, Integer age) {
		
		System.out.println("patient name is " + nameofpatient + "  " + surnameofpatient );
		System.out.println("ID number is " + IDnumber);
		if(gender == 0)
			System.out.println("gender is female");
		else {
			System.out.println("gender is male"); }
		System.out.println("age is " + age);
		
	}

     public static void redzone() {
	
		 System.out.println("� Terror, sabotage, shooting, stabbing, fighting,"
					+ "\n� Attempted suicide"
					+ "\n� Traffic accident"
					+ "\n� Serious burns"
					+ "\n� Loss of consciousness"
					+ "\n� Sudden paralysis"
					+ "\n� Serious work accidents, limb amputation"
					+ "\n� poisoning");
}

     public static void yellowZone() {

		System.out.println("Press 0 if at least one of them is true, press 1 if not. ");
		String set = 
			"� Have you had surgery before? "
			+ "\n� Do you have any chronic diseases? "
			+ "\n� Do your parents or siblings have chronic diseases? "
			+ "\n� Stomach ache"  
			+ "\n� throat ache"  
			+ "\n� moderate burns"  
			+ "\n� Long bone or hip fractures"  
			+ "\n� Severe headache without fever";
		System.out.println(set);
		
 Scanner scan = new Scanner(System.in);
		
		int ans = scan.nextInt();
		int answer7 = 0;
		int answer8 = 1;
   while(ans != answer7) {
			if(ans == answer8)
				break;
			System.out.println("You entered invalid value. Please enter again");
			ans = scan.nextInt();
		}
 scan.close();
		
        if(ans == 0) {
			System.out.println("You are in the yellow zone ");
		 int patient = 0;
			countPatient(patient);
		}
		else if(ans == 1) {
			System.out.println("You are in green zone");
		int patient = 0;
				
     countPatient(patient);
		}}
				
     public static int countPatient(int b) {
		
		int service = (int)(Math.random()* 10);
		System.out.println("There is " + service + " patient(s) with you");
		int queue = --service;
		System.out.println("There is " + queue + " patients(s) in queue");
        int time = 15;
		
	 waitingTime(queue, time);
		
	 return service;
		
	}
	
     public static int waitingTime(int ptnt, int tm) {
		
		int waitTime = ptnt* tm;
		
		int remindingTime = waitTime % 60;
		int hour = waitTime / 60;
		
		System.out.println("Wating time is "+ hour + " hour(s) " + remindingTime + " minute(s)");
		System.out.println();
		int result = waitTime;
	
     return result;
     
	}}
			
		
	
	
		

		
		
		
 