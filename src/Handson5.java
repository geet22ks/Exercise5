//for pull
public class Handson5 extends Handson1 {
	
public int multiply(int a,int b){
	int sum;
	sum=a+b;
	return(sum);
	
}
public double multiply(double a,double b){
	double sum;
	sum=a+b;
	return(sum);
	}

public static void main(String[] args) {
Handson1 hand1=new Handson1();
int overes=hand1.multiply(4,5);
double overes1=hand1.multiply(4.5,5.6);
Handson5 hand5=new Handson5();
int res=hand5.multiply(4,5);
double res1=hand5.multiply(4.5,5.6);
System.out.println("Overridden method values"+overes+"  "+overes1);
System.out.println("\n Normal method values"+res+"  "+res1);

// TODO Auto-generated method stub

	}

}
