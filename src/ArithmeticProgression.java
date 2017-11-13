
public class ArithmeticProgression {
	public static void main(String[] args) {
		int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10,12,13,14,15};
		int begin = arr[0];
		for (int i=0; i < arr.length; i++) {
			if (begin != arr[i]) {
				System.out.println("missing value is ::"+begin + ", present value is ::" + arr[i]);
				break;
			}
			begin += arr[0];
		}
	}

}
