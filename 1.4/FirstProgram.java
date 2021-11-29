class FirstClass {
	public static void main(String[] s) {
		SecondClass s2 = new SecondClass();
		int i, j;
		for (i = 1; i <= 8; i++) {
			for(j = 1; j <= 8; j++) {
				s2.setX(i);
				s2.setY(j);
				System.out.print(s2.getSum());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

class SecondClass {
	private int x;
	private int y;

public void setX(int x){
this.x = x;
}
public void setY(int y){
this.y = y;
}
public int getX(){
return x;
}
public int getY(){
return y;
}
public int getSum(){
return x + y;
}
}