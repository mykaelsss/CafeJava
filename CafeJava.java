public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.65;
        double dripCoffeePrice = 2.39;
        double lattePrice = 3.39;
        double cappuccinoPrice = 2.89;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println( !isReadyOrder1 ? customer1 + pendingMessage : customer1 + readyMessage);
        System.out.println(generalGreeting + customer4);
        System.out.println(!isReadyOrder4 ? customer4 + pendingMessage: displayTotalMessage + cappuccinoPrice);

        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + lattePrice * 2);
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : customer2 + pendingMessage);

        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}
