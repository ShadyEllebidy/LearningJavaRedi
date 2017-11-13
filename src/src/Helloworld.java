package src;

import java.util.ArrayList;

public class Helloworld {

    public void printHello() {
        System.out.println("Hello World!");
    }
public static void printArray () {
    int n = 5, b =0;
    int a[] = new int[n];
    for (int i = 0; i < a.length; i++) {
        a[i] = i + 1;
        System.out.println("Element number " +i + " is equal to " + a[i]);
    }}
    public static void ExersizeArrayList(){
        char C;
        char[] arrayChar = "abcdefghijklmn".toCharArray();
        ArrayList charList = new ArrayList();
        for (int i=0 ; i<arrayChar.length ; i++){
            charList.add(arrayChar[i]);

        }
        System.out.println("This is your list of charcters " +charList);

        /**ArrayList list = new ArrayList();
        *for (int i = 0; i < 5 ; i ++){
        *    list.add(i);
        *}
        *System.out.println("This is your list b4 remove " + list);
*
        *list.remove(3);

       * System.out.println("This is your list after remove " +list);
    */
         }


}
