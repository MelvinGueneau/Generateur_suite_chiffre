package Generation_numero;

public class Generation_numero {
	String num;
	int n;
	public Generation_numero() {
		this.num = "";
		this.n = 0;
	}
	
	public int generateur(int size) {
		String temp;
		int res = 0;
		for (int i = 0; i < size;i++) {
			 n = (int)(Math.random() * 9);
			 temp = String.valueOf(n);
			 this.num = this.num + temp;
		}
		res =  Integer.parseInt(this.num);
		this.num ="";
		return res;
	}
}
