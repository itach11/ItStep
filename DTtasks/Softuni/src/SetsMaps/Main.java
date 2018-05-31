package SetsMaps;


import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;

        /* Plate task where we print the cars plates that are  left in the parking lot
        Parking Lot
Write program that:
 Record car number for every car that enter in parking lot
 Remove car number when the car go out
 Input will be string in format [direction, carNumber]
 input end with string &quot;END&quot;
Print the output with all car numbers which are in parking lot

        */
//        Set<String> cars = firstTaskLogic(sc);
        //  print(cars);


        /* SoftUni Party
There is a party in SoftUni. Many guests are invited and they are two type: VIP and regular. When guest
come check if he/she exist in any of two reservation lists
All reservation numbers will be with 8 chars
All VIP numbers start with digit
There will be 2 command lines. First is &quot;PARTY&quot; - party is on and guests start coming. Second is &quot;END&quot; – then
party is over and no more guest will come
Output have to all guest, who didn&#39;t come to the party (VIP must be first)
*/

        //  Set<String> invitations = getStrings(sc);
        // print(invitations);

        //VIP party end
   /*
   *&quot;Voina&quot; - Number game
Write program that:
 Read 20 numbers for both players
 Numbers will be Integer, separated with &quot; &quot; (single space).
 Every player can hold only unique numbers
 Each Round both players get top number from their own. Player with bigger number get both
numbers and add it on the bottom of his own numbers
 Game end after 50 rounds or if any player lose all of his numbers
 Output must be &quot;First Player Win!&quot;, &quot;Second Player Win!&quot; or &quot;Draw!&quot;
   *
   *
   *
   *
   * */

        //pylnim setovete
        Set<Integer> firstPlayernums = voinaInput(sc);
        Set<Integer> secondPlayernums = voinaInput(sc);

        for (int i = 0; i < 50; i++) {
            if (firstPlayernums.isEmpty() || secondPlayernums.isEmpty()) {
                System.out.println(secondPlayernums.isEmpty()
                        ? "First player win!" : "Second player win!");
            return;
            }

            int firstNum = firstPlayernums.iterator().next();
            firstPlayernums.remove(firstNum);
            int secondNum = secondPlayernums.iterator().next();
            secondPlayernums.remove(secondNum);

            int comparator = compare(firstNum, secondNum);
            if (comparator == 1) {
                firstPlayernums.add(firstNum);
                firstPlayernums.add(secondNum);
            }

            if (comparator == -1) {
                secondPlayernums.add(firstNum);
                secondPlayernums.add(firstNum);
            }

        }

        printVoina(firstPlayernums ,secondPlayernums);

    }

    private static int compare(int x, int y) {

        if (x > y) {
            return 1;
        } else if (y > x)
            return -1;


        return 0;
    }

    private static void printVoina(Set<Integer> set1, Set<Integer> set2) {
        int result = compare(set1.size(), set2.size());
        if (result == 1) {
            System.out.println("First player win!" );
        }
        else if (result==-1){
            System.out.println("Second player win!");
        }
        else
            System.out.println("Draw!");
    }

    private static Set<Integer> voinaInput(Scanner sc) {
        Set<Integer> set = new LinkedHashSet<>();
        String[] nums = sc.nextLine().split(" ");
        for (String num : nums) {
            set.add(Integer.parseInt(num));
        }


        return set;
    }


    private static Set<String> firstTaskLogic(Scanner sc) {
        String line;
        Set<String> cars = new HashSet<>();


        while (!"END".equals(line = sc.nextLine())) {
            String arr[] = line.split(", ");
            String destination = arr[0];
            String carPlate = arr[1];

            if ("IN".equals(destination)) {
                cars.add(carPlate);
            } else
                cars.remove(carPlate);

        }

        for (String car : cars) {
            if (!cars.isEmpty())
                System.out.println(car);

            else
                System.out.println("Parking Lot is Empty");
        }
        return cars;
    }

    //input lines and put them in set with conditions for break
    private static Set<String> getStrings(Scanner sc) {
        String line;
        Set<String> invitations = new TreeSet<>();
        while (true) {
            line = sc.nextLine();
            if ("PARTY".equals(line)) {
                while (!"END".equals(line = sc.nextLine())) {
                    if (invitations.contains(line))
                        invitations.remove(line);
                }
                break;
            }
            invitations.add(line);
        }
        return invitations;
    }


    private static void print(Set<String> set) {
        //output
        System.out.print(set.size());
        for (String element : set) {
            System.out.println(element);
        }
    }

}
