public class Animal {
    public static String DefaultAnimal() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        String firstArguments = args[0];
        String output = "";

        if (firstArguments.equalsIgnoreCase("bird")) {
            output = getCatGreeting();
        } else {
            System.out.println(DefaultAnimal);
        }
    }
}