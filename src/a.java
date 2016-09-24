
public class a{
	static double a= Math.random();
	static double X0=20,Y0=20,X1,Y1,X2,Y2,X3,Y3,X4,Y4,X5,Y5,X6,Y6;
	static double eX0=20,eY0=20,eX1,eY1,eX2,eY2,eX3,eY3,eX4,eY4,eX5,eY5,eX6,eY6;
	public void getXiYi(){
		System.out.println("(X0,Y0)="+"("+X0+"),("+Y0+")");
		
		X1=X0+10*Math.cos(Math.PI*45/180);
		Y1=Y0+10*Math.sin(Math.PI*45/180);
		System.out.println("(X1,Y1)="+"("+X1+"),("+Y1+")");
		
		X2=X1+11*Math.cos(Math.PI*50/180);
		Y2=Y1+11*Math.sin(Math.PI*50/180);
		System.out.println("(X2,Y2)="+"("+X2+"),("+Y2+")");
		
		X3=X2+9*Math.cos(Math.PI*55/180);
		Y3=Y2+9*Math.sin(Math.PI*55/180);
		System.out.println("(X3,Y3)="+"("+X3+"),("+Y3+")");
		
		X4=X3+12*Math.cos(Math.PI*50/180);
		Y4=Y3+12*Math.sin(Math.PI*50/180);
		System.out.println("(X4,Y4)="+"("+X4+"),("+Y4+")");

		X5=X4+11*Math.cos(Math.PI*45/180);
		Y5=Y4+11*Math.sin(Math.PI*45/180);
		System.out.println("(X5,Y5)="+"("+X5+"),("+Y5+")");

		X6=X5+10*Math.cos(Math.PI*40/180);
		Y6=Y5+10*Math.sin(Math.PI*40/180);
		System.out.println("(X6,Y6)="+"("+X6+"),("+Y6+")"+"\n");

	}
	
	public void getXiYiWithRandomError(){
		System.out.println("(eX0,eY0)="+"("+eX0+"),("+eY0+")");
		
		eX1=eX0+Math.random()+10*Math.cos(Math.PI*45/180);
		eY1=eY0+0.1*Math.random()+10*Math.sin(Math.PI*45/180);
		System.out.println("(eX1,eY1)="+"("+eX1+"),("+eY1+")");
		
		eX2=eX1+Math.random()+11*Math.cos(Math.PI*50/180);
		eY2=eY1+0.1*Math.random()+11*Math.sin(Math.PI*50/180);
		System.out.println("(eX2,eY2)="+"("+eX2+"),("+eY2+")");
		
		eX3=eX2+Math.random()+9*Math.cos(Math.PI*55/180);
		eY3=eY2+0.1*Math.random()+9*Math.sin(Math.PI*55/180);
		System.out.println("(eX3,eY3)="+"("+eX3+"),("+eY3+")");
		
		eX4=eX3+Math.random()+12*Math.cos(Math.PI*50/180);
		eY4=eY3+0.1*Math.random()+12*Math.sin(Math.PI*50/180);
		System.out.println("(eX4,eY4)="+"("+eX4+"),("+eY4+")");

		eX5=eX4+Math.random()+11*Math.cos(Math.PI*45/180);
		eY5=eY4+0.1*Math.random()+11*Math.sin(Math.PI*45/180);
		System.out.println("(eX5,eY5)="+"("+eX5+"),("+eY5+")");

		eX6=eX5+Math.random()+10*Math.cos(Math.PI*40/180);
		eY6=eY5+0.1*Math.random()+10*Math.sin(Math.PI*40/180);
		System.out.println("(eX6,eY6)="+"("+eX6+"),("+eY6+")");

	}
public static void main(String[] args){
	a a=new a();
	a.getXiYi();
	a.getXiYiWithRandomError();
}
}