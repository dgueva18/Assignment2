package assignment3;
import java.util.Random;
import javax.swing.JOptionPane;
import _solution.Toy;
public class Birthday {

	public static void main(String[] args) {
		String name, toychoice, cardchoice, balloonchoice, another;
		int another1=1;
		int age;
		double cost=0;
		double total=0;
		int i=0;
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children");
		do {
		
		name = JOptionPane.showInputDialog(null, "Enter the name of the child");

		age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is the child?"));
		
		toychoice = JOptionPane.showInputDialog(null, "Choose a toy: plushie, blocks, or a book");

			Toy toy = new Toy(toychoice, age);
			toy.setToy(toychoice);

		while(!toy.ageOK()) {
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose a different age"));
			toy.setAge(age);
		}
		toy.setCost(toychoice);
		
		cardchoice = JOptionPane.showInputDialog(null, "Do you want a card with the gift? Yes or No");
		if(cardchoice.contentEquals("yes")||cardchoice.contentEquals("Yes")) {

		toy.addCard(cardchoice);}
		
		balloonchoice = JOptionPane.showInputDialog(null, "Do you want a balloon with the gift? Yes or No");
		if(balloonchoice.contentEquals("yes")||balloonchoice.contentEquals("Yes")) {
            toy.addBalloon(balloonchoice);
		}
	     total+=toy.getCost();
	     i++;
		another = JOptionPane.showInputDialog(null, "Do you want to make another purchase? Yes or No");
		if(another.contentEquals("yes")||another.contentEquals("Yes")) {
			another1=1;
		} else if(another.contentEquals("no")||another.contentEquals("No")){
			another1=0;
		}

	     }
		while(another1==1);
		Toy toy = new Toy();
			int ordernumber;
			ordernumber = 100000+ new Random().nextInt(999999);
			 System.out.println("Birthday Gifts");
			 
			System.out.println(toy.toString());
		        System.out.println("The total cost for this order is $" + total);
		        System.out.println("The Order number is " + ordernumber);
			
		
	} 
}

	

		
		
		// TODO Auto-generated method stub

