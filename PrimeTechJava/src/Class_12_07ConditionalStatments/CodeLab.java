package Class_12_07ConditionalStatments;

public class CodeLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 3;
int j = 2;
int iTemp;
int jTemp;
iTemp = i;// iTemp= 3;
jTemp = j;// jTemp =2;
i = jTemp;
 j = iTemp;
// output: j=3; i=2
System.out.println(i);
System.out.println(j);

int x= 10;
int y= 5;
int temp;
temp = x;
x = y;
y = temp;
System.out.println(x);
System.out.println(y);

int q = 15; 
int o = 20;
int bucket;
bucket =q; // bucket = 15;
q = o; // q =o = 20
o = bucket;
System.out.println(q);
System.out.println(o);

int firstPlaceWinner = 100;
int secondPlaceWinner = 200;
int temp1;
temp1 = firstPlaceWinner;
firstPlaceWinner = secondPlaceWinner;
secondPlaceWinner = temp1;
System.out.println(firstPlaceWinner);
System.out.println(secondPlaceWinner);



int v = 5;
int u = 10;
v = v + u;
u = v - u;
v = v - u ;
System.out.println(v);

System.out.println(u);
boolean onOfSwitch = false;
  onOfSwitch=!onOfSwitch;
  System.out.println(onOfSwitch);
  onOfSwitch=!onOfSwitch;
  System.out.println(onOfSwitch);





	}

}
