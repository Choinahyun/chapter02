
public class Sort {

	public static void main(String[] args) {
		
		int [] sort = {5, 9, 3, 8, 60, 20, 1};
		int temp = 0;
		
		while(true) {
			for (int i =0; i<sort.length-1; i++) {
				if (sort[i] < sort[i+1]) {
					temp = sort[i];
					sort[i] = sort[i+1];
					sort[i+1] = temp;
				}
			}
		}

	}

}
