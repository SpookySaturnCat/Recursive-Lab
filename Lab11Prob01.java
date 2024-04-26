
public class Lab11Prob01 {
	public static void main(String[] args) {
		System.out.println(recursiveAbstract(4));
	}


	public static int recursiveAbstract(int num) {
		
		if (num == 0) {
			return 1;
		} else if (num == 1) {
			return 3;
		} else if (num == 2) {
			return 4;
		}else {
			return recursiveAbstract(num - 3) * (recursiveAbstract(num - 2) - recursiveAbstract(num - 1));
		}
	}
}
