package lab_3;
import java.util.*;

abstract class CarService {
    private String numPlate;

    CarService(String numPlate) {
        System.out.println("Welcome to Car Service Center");
        this.numPlate = numPlate;
    }

    void setNumPlate(String numPlate) {
        this.numPlate = numPlate;
    }

    String getNumPlate() {
        return numPlate;
    }

    abstract void services();
}

class ServiceCenter extends CarService {
    private Scanner sc = new Scanner(System.in);
    private int choice, bill = 0;
    private String oldNumPlate, newNumPlate, numPlate;
    private String operation = "";

    ServiceCenter(String numPlate) {
        super(numPlate);
    }

    void services() {
        char ch = 'y';
        do {
            System.out.println("**********Service Menu**************");
            System.out.println("1.Oil Change 200Rs\n2.Washing 70Rs\n3.Air Filter Replacement 200Rs\n4.Changing Number plate 500Rs\n5.Display Bill");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Oil Washing Successfully...");
                    bill += 200;
                    operation += "Oil Change 200Rs\n";
                    break;
                case 2:
                    System.out.println("Car Washing Successfully..");
                    bill += 70;
                    operation += "Washing 70Rs\n";
                    break;
                case 3:
                    System.out.println("Air Filter Replaced Successfully...");
                    bill += 200;
                    operation += "Air Filter Replacement 200Rs\n";
                    break;
                case 4:
                    System.out.println("Enter Old Number plate");
                    oldNumPlate = sc.next();
                    numPlate = getNumPlate();
                    if (oldNumPlate.equals(numPlate)) {
                        System.out.println("Enter New Number plate");
                        newNumPlate = sc.next();
                        setNumPlate(newNumPlate);
                        bill += 500;
                        operation += "Changing Number plate 500Rs\n";
                    } else {
                        System.out.println("Incorrect Number plate, so we can't change it");
                    }
                    break;
                case 5:
                    System.out.println("Total Bill:" + bill);
                    break;
                default:
                    System.out.println("Invalid choice....");
            }
            System.out.println("Do you want to continue(Y/N)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        System.out.println("Thank you for visiting..");
        System.out.println(operation);
        System.out.println("Total Bill=" + bill);
    }
}

public class CarServiceCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numPlate;
        System.out.println("Enter your car Number Plate");
        numPlate = sc.next();
        ServiceCenter obj = new ServiceCenter(numPlate);
        obj.services();
    }
}