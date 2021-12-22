import java.util.*;
public class TestDate{
public static void main(String args[]){
String month;
Date d=new Date();
month=d.toString();
month=month.substring(4,7);
System.out.println(d);
System.out.println(month);
}
}