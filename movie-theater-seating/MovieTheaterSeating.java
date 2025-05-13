import java.util.Scanner;

public class MovieTheaterSeating {
    int[][] seats;

    // Constructor - sets up the theater with empty seats (0 = available)
    public MovieTheaterSeating(int rows, int cols) {
        seats = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 0; 
            }
        }
    }

    // Reserve a seat
    public void reserveSeat(int row, int col) {
        if (seats[row][col] == 0) {
            seats[row][col] = 1;
            System.out.println("Seat at Row " + row + " Col " + col + " is now reserved.");
        } else {
            System.out.println("Seat is already taken. Searching for available seat...");
            suggestSeat();
        }
    }

    // Suggest the first available seat
    public void suggestSeat() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (seats[i][j] == 0) {
                    System.out.println("Suggested available seat: Row " + i + " Col " + j);
                    return;
                }
            }
        }
        System.out.println("No seats available.");
    }

    // Cancel a reservation
    public void cancelSeat(int row, int col) {
        if (seats[row][col] == 1) {
            seats[row][col] = 0;
            System.out.println("Reservation at Row " + row + " Col " + col + " has been canceled.");
        } else {
            System.out.println("That seat is already available.");
        }
    }

    // Print the full seating chart
    public void printSeatingChart() {
        System.out.println("Current Seating Chart:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MovieTheaterSeating theater = new MovieTheaterSeating(5, 5); 

        while (true) {
            System.out.println("\n1. Reserve Seat");
            System.out.println("2. Cancel Seat");
            System.out.println("3. View Seating Chart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter row: ");
                int row = input.nextInt();
                System.out.print("Enter column: ");
                int col = input.nextInt();
                theater.reserveSeat(row, col);
            } else if (choice == 2) {
                System.out.print("Enter row: ");
                int row = input.nextInt();
                System.out.print("Enter column: ");
                int col = input.nextInt();
                theater.cancelSeat(row, col);
            } else if (choice == 3) {
                theater.printSeatingChart();
            } else {
                System.out.println("Exiting...");
                break;
            }
        }

        input.close();
    }
}
