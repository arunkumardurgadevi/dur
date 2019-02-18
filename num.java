import java.io.*;
public class Num
{
static boolean isNumber(String s)
{
for (int i=0;i<s.length();i++)
if(Character.isDigit(s.charAt(i))==false)
  return false;
return true;
}
static public void main(String[] args)
{
String str="1a";
if(isNumber(str))
System.out.println("yes");
else
System.out.println("no");
}
}
