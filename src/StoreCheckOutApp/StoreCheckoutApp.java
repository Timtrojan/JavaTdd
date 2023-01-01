package StoreCheckOutApp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreCheckoutApp {


    private String storeName;
    private String location;
    private String phoneNumber;

    private String branch;

    public String customerName;
    public String cashiersName;

    private int discount;
    private final double VAT = 7.5;
    private ArrayList<String> item;
    private ArrayList<Integer> quantity;
    private ArrayList<Double> price;


    public StoreCheckoutApp(String storeName, String location, String phoneNumber, String branch) {
        this.storeName = storeName;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.branch = branch;

    }

    public void runCheckOutAppToMain(){
        enterPurchaseDetails();
        initialSummaryDisplay();
        receiptDisplay();
    }



    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ArrayList<String> getItem() {
        return item;
    }

    public ArrayList<Integer> getQuantity() {
        return quantity;
    }

    public ArrayList<Double> getPrice() {
        return price;
    }


    public ArrayList<Double> totalList() {

        ArrayList<Integer> quantityArray = getQuantity();
        ArrayList<Double> priceArray = getPrice();
        ArrayList<Double> total = new ArrayList<>();

        ;
        for (int i = 0; i < quantityArray.size(); i++) {

            total.add(quantityArray.get(i) * priceArray.get(i));

        }
        return total;

    }

    public double subTotal() {
        totalList();
        double subTotal = 0;
        for (double totals : totalList()) {
            subTotal += totals;
        }
        return subTotal;
    }

    public double discountGotten() {

        double discount = ((double) this.discount / 100);
        return discount * subTotal();

    }

    public double VATvalue() {
        return (VAT / 100) * subTotal();

    }

    public double billTotal() {
        return subTotal() - discountGotten() + VATvalue();
    }


    public void enterPurchaseDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the Customer's Name: ");
        customerName = scanner.nextLine();


        item = new ArrayList<>();
        quantity = new ArrayList<>();
        price = new ArrayList<>();

        String moreItems;
        do {
            System.out.print("What did the user buy: ");
            item.add(scanner.nextLine());

            System.out.print("How many pieces: ");
            quantity.add(Integer.parseInt(scanner.nextLine()));

            System.out.print("How much per unit: ");
            price.add(Double.parseDouble(scanner.nextLine()));

            System.out.println("Add more items?");
            moreItems = scanner.nextLine();

        }
        while (moreItems.equals("yes"));

        System.out.println("What is your name");
        cashiersName = scanner.nextLine();

        System.out.println("How much discount  is available: ");
        discount = Integer.parseInt(scanner.nextLine());


    }

    public void initialSummaryDisplay() {


        System.out.println(getStoreName());
        System.out.println(getBranch());
        System.out.println("Location: " + getLocation());
        System.out.println("Tel: " + getPhoneNumber());
        printDateTime();
        System.out.println("Cashier: " + getCashiersName());
        System.out.println("Customer Name: " + getCustomerName());

        System.out.println();

        System.out.println("========================================================");
        System.out.printf("%-10s%-8s%-12s%-12s%n", "ITEM ", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("--------------------------------------------------------");

        displayPurchaseSummary();

        System.out.println("--------------------------------------------------------");
        System.out.printf("%28s%8.2f%n", "Sub Total:", subTotal());
        System.out.printf("%28s%8.2f%n", "Discount:", discountGotten());
        System.out.printf("%28s%8.2f%n", "VAT @7.5%:", VATvalue());
        System.out.println("========================================================");
        System.out.printf("%28s%8.2f%n", "Bill Total:", billTotal());
        System.out.println("========================================================");
        System.out.printf("%s%.2f%n", "THIS IS NOT A RECEIPT KINDLY PAY ", billTotal());
        System.out.println("========================================================");


    }

    public void receiptDisplay() {
        System.out.println();
        subTotal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much did the customer give you: ");
        int pay = Integer.parseInt(scanner.nextLine());

        while(pay<subTotal()){
            System.out.println("NOT VALID, PAY SHOULD BE GREATER THAN OR EQUAL TO SUBTOTAL OF PURCHASES");
            System.out.println("How much did the customer give you: ");
            pay = Integer.parseInt(scanner.nextLine());

        }

        System.out.println(getStoreName());
        System.out.println(getBranch());
        System.out.println("Location: " + getLocation());
        System.out.println("Tel: " + getPhoneNumber());
        printDateTime();
        System.out.println("Cashier: " + getCashiersName());
        System.out.println("Customer Name: " + getCustomerName());

        System.out.println();

        System.out.println("========================================================");
        System.out.printf("%-10s%-8s%-12s%-12s%n", "ITEM ", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("--------------------------------------------------------");

        displayPurchaseSummary();

        System.out.println("--------------------------------------------------------");
        System.out.printf("%28s%8.2f%n", "Sub Total:", subTotal());
        System.out.printf("%28s%8.2f%n", "Discount:", discountGotten());
        System.out.printf("%28s%8.2f%n", "VAT @7.5%:", VATvalue());
        System.out.println("========================================================");
        System.out.printf("%28s%8.2f%n", "Bill Total:", billTotal());
        System.out.printf("%28s%8d%n", "Amount Paid:", pay);
        System.out.printf("%28s%8.2f%n", "Balance:", pay - billTotal());
        System.out.println("========================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("========================================================");


    }

    public void displayPurchaseSummary() {

        totalList();

        for (int i = 0; i < item.size(); i++) {
            System.out.printf("%-10s%-8d%-12.2f%-12.2f%n", getItem().get(i), getQuantity().get(i), getPrice().get(i), totalList().get(i));
        }

    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getCashiersName() {
        return cashiersName;
    }

    public static void printDateTime() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String dateTimeString = now.format(formatter);	//2019-03-28 14:47:33 PM
        System.out.println("Date: "+dateTimeString);
    }





}


