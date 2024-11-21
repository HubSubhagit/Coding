//Write a java program to reverse a String "Hello World".
package com.mycompany.stringrev;


public class StringRev {

    public static void main(String[] args) {
        String sr="Hello World";
        String tu="";               //tu is a empty String
        for(int i=sr.length()-1;i>=0;i--)   //its traversing sr length-1 to 0.
        {
            tu+=sr.charAt(i);           //concatenate sr every character with tu and store in again tu.
            
        }
        System.out.println("Reverse String is:"+tu);
    }
}
