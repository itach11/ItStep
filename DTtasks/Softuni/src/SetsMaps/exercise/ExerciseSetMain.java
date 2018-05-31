package SetsMaps.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExerciseSetMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int n = sc.nextInt();
        int hops =sc.nextInt() + n ;
        String result = "";


        for (int i = 0; i < hops; i++) {
            int tmp = sc.nextInt();
            if (!set.contains(tmp)){
                set.add(tmp);
            }
            else
                result+=tmp+" ";
        }

        System.out.println(result);

    }
}
