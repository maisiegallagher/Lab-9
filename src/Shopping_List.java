import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Shopping_List {
	
	private static Scanner scnr;
	private static Map<String, Double> items = new TreeMap<>();
	private static List<String> orderNames = new ArrayList<>();
	private static List<Double> orderPrice = new ArrayList<>();

	public static void main(String[] args) {
	scnr = new Scanner(System.in);
	fillItemsMap();
	printMenu();
	
		
	do {
		System.out.println("What item would you like to order? ");
	
	String itemName = scnr.nextLine();
	Double itemPrice = items.get(itemName);
	System.out.println("Adding " + itemName + " to cart at $" + itemPrice);
	System.out.println("Would you like to order anything else? (y/n)");
	}
	while(true);
	
	
	
	}

	private static void fillItemsMap() {
		items.put("apple", .99);
		items.put("banana", .59);
		items.put("cauliflower", 1.59);
		items.put("dragonfruit", 2.19);
		items.put("Elderberry", 1.79);
		items.put("figs", 2.09);
		items.put("grapefruit", 1.99);
		items.put("honeydew", 3.49);
	}
	
	private static void printMenu () {
		System.out.println("Item\tPrice");
		
		for (Map.Entry<String, Double> entry : items.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
	
	// private static int finalOrder() {
		
	}

