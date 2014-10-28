package introduction.to.algorithms.chapter1;

public class InsertSort {

	public static int[] sort(int[] a) {
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		for (int j = 1; j < b.length; j++) {
			int key = a[j];
			for (int i = j - 1; i >= 0 && b[i] > key; i--) {
				int temp = b[i];
				b[i] = key;
				b[i + 1] = temp;
			}
			// 第二种实现方式
	/*		for (int i = j; i >0; i--) {
				if(b[i-1]>b[i]){
					int temp =b[i];
					b[i]=b[i-1];
					b[i-1]=temp;
				}
			}*/
		}
		return b;
	}
	
	// 醋，酒瓶子
	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}