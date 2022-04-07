import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {

	String make;
	String model;
	String year;

	public Car(Scanner s) {
		System.out.println("Typ in model ");
		model = s.nextLine();
		System.out.println("Type in year");
		year = s.nextLine();
	}

}

class CarList {

	private List<Car> list = new ArrayList<Car>();

	public void addCar(Scanner s) {
		list.add(new Car(s));
	}

}

class AddEntry {
	public static void main(String[] args) {
		CarList carlist = new CarList();
		Scanner s = new Scanner(System.in);
		int choice;

		System.out.println("\t Welcome  ");

		do {
			System.out.println("Make a Choice ");
			System.out.println("1. Add a car ");
			System.out.println("2. Show carlist");
			System.out.println("3. Delete car ");
			System.out.println("4. Exit ");
			System.out.print("Type in your choise : ");
			choice = s.nextInt();
			s.nextLine();
			if (choice == 1) {
				carlist.addCar(s);
			}
		} while (choice != 4);

	}
}