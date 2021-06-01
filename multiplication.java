import java.util.Scanner;
class MultiplicationTable {

public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.print("give a number");
int num = in.nextInt();
for(int i=0;i<10;i++)
{
System.out.println(num + "*" +(i+1)+ "=" +(num*(i+1)));
}
}
}