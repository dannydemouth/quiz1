package quiz1;

import java.util.Scanner;

public class quiz1 {
static Scanner keyboard = new Scanner(System.in);
public static void main(String[] args){
System.out.print("Enter Number of passing attempts: ");
int att = keyboard.nextInt();
System.out.print("Enter Number of completions: ");
int comp = keyboard.nextInt();
System.out.print("Enter Number of passing yards: ");
int yds = keyboard.nextInt();
System.out.print("Enter Number of touchdown passes: ");
int td = keyboard.nextInt();
System.out.print("Enter Number of interceptions: ");
int it = keyboard.nextInt();

double a = ((comp/att)-.3)*5;
if (a > 2.375){
	a = 2.375;
}
else if (a < 0){
	a = 0;
}
double b = ((yds/att)-3)*.25;
if (b > 2.375){
	b = 2.375;
}
else if (b < 0){
	b = 0;
}
double c = (td/att)*20;
if (c > 2.375){
	c = 2.375;
}
else if (c < 0){
	c = 0;
}
double d = 2.375- ((it/att)*25);
if (d > 2.375){
	d = 2.375;
}
else if (d < 0){
	d = 0;
}
double pr = ((a + b + c + d)/6)*100;

System.out.print(pr);
}
}
