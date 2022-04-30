import java.util.concurrent.locks.Condition;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = "Your order will be ready shortly ";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 7.54;
        double latte = 7.52;
        double lattex2 = 15.04;
        double cappucino = 5.63;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // Cindy
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

    	// ** Your customer interaction print statements will go here ** //
        System.out.println(pendingMessage);
        System.out.println(customer1 + readyMessage);
        System.out.println(displayTotalMessage + dripCoffee);

        System.out.println("-----------");

        // Noah
        System.out.println(generalGreeting + customer4);

        if (isReadyOrder4);
        System.out.println(customer4 + readyMessage);
        System.out.println(displayTotalMessage + cappucino);

        System.out.println("-----------");

        // Sam
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + lattex2);

        if (isReadyOrder2) {
            System.out.println(readyMessage);   
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.println("-----------");
        
        // Jimmy
        System.out.println(displayTotalMessage + (dripCoffee - latte));
    }
}