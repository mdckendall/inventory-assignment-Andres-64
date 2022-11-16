import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  public String name, serialNum;
  String value;      
  public Inventory(String name, String serialNum, String value){
    this.name = name;
    this.serialNum = serialNum;
    this.value = value;
  }
  public String toString() {
    return name + "," + serialNum + "," + value;
  }
}

class Main {
	public static void main(String[] args) {
  ArrayList<Inventory> arrayList = new ArrayList<>();
  Scanner scanner = new Scanner(System.in);
  while (true){
    System.out.println("Press 1 to add an item");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");
    int input = scanner.nextInt();
    scanner.nextLine();
    switch (input){
      case 1:
        System.out.println("Enter the name:");
        String n = scanner.nextLine();
        System.out.println("Enter the serial number:");
       
        String s = scanner.next();
        System.out.println("Enter the value in dollars (whole number):");
       
        String p = scanner.next();
        arrayList.add(new Inventory(n, s ,p));
        break;
      case 2:
        System.out.println("Enter the serial number of the item to delete:");
        String its = scanner.next();
        for (int i = 0; i < arrayList.size(); i++){
          if (arrayList.get(i).serialNum.equals(its)){
            arrayList.remove(i);
          }
        }
        break;
      case 3:
        System.out.println("Enter the serial number of the item to change:");
        String st = scanner.next();
        scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++){
          if (arrayList.get(i).serialNum.equals(st)){
            System.out.println("Enter the new name:");
            String newn = scanner.nextLine();
            System.out.println("Enter the new value in dollars (whole number)");
            String newv = scanner.next();
            arrayList.get(i).name = newn;
            arrayList.get(i).value = newv;
          }
        }
        break;
        case 4:
          for(Inventory i : arrayList){
            System.out.println(i);
          }
          break;
      case 5:
        System.exit(0);
    }
  }
	}
}