package main.java.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class GenerateBinaryQueue {


    private static String[] generateBinaryNumbers(int number)
    {
        String[] result = new String[number];
        Queue<String> binaryQueue = new LinkedList<>();
        binaryQueue.offer("1");
        for(int i=0; i<number; i++)
        {
         result[i] = binaryQueue.poll();
         String s1= result[i] + "0";
         String s2 = result[i] + "1";
         binaryQueue.offer(s1);
         binaryQueue.offer(s2);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = generateBinaryNumbers(5);
        Stream.of(strings).map(x->x+" ").forEach(System.out::print);
    }
}
