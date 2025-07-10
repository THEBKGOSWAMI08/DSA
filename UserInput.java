import java.util.Scanner;

public UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("Enter something (type 'exit' to quit): ");
            input = sc.nextLine();
        }

        System.out.println("Exited!");
    }
}
