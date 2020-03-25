import java.io.*;
import java.util.*;
class Anagram
{
 public static void main(String args[])
 {
  String s1,s2;
  Console c=System.console();
  System.out.println("Enter first string");
  s1=c.readLine();
  System.out.println("Enter second string");
  s2=c.readLine();
  char[] c1=s1.tocharArray();
  char [] c2=s2.tocharArray();
  c1=Arrays.sort(c1);
  c2=Arrays.sort(c2);
  s1=new String(c1);
  s2=new String(c2);
  
 if(s1.equals(s2))
       System.out.println("They are Anagrams");
 else
       System.out.println("They are not anagrams");
}
}

  