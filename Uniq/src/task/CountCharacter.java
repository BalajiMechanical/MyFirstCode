package task;

public class CountCharacter {

	public static void main(String[] args) {
		String s[] = { "a", "d", "f", "a", "a", "p", "p", "k" };
		String[] org = new String[s.length];
		int[] org1 = new int[s.length];
		int counts = 0;
		for (int i = 0; i < s.length; i++) {
			String curEle = s[i];
			boolean isNewElement = true;
			for (int j = 0; j < counts; j++) {
				if (org[j].equals(curEle)) {
					org1[j]++;
					isNewElement = false;
					break;
				}
			}
			if (isNewElement) {
				org[counts] = curEle;
				org1[counts] = 1;
				counts++;
			}
		}
		for (int i = 0; i < counts; i++) {
			if (org1[i] % 2 != 0) {
				// if(org1[i]%2==0){
				System.out.println(org[i] + "-" + org1[i]);
			}

		}
	}

}
