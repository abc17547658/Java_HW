public class JPA05_8 {
    public static void main(String[] argv) {
        int[] data = {2, 4, 3, 5, 7, 6, 9, 1};  // ���ƧǪ����
        int temp;
        
        for(int i = 0;i < data.length - 1;i++) {
        	for(int j = 0;j < data.length - 1 - i;j++) {
        		if(data[j] > data[j + 1]) {
        			temp = data[j];
        			data[j] = data[j + 1];
        			data[j + 1] = temp;
        		}
        	}
        	
        	for(int k : data) 
        		System.out.print(" " + k);
        	System.out.println("");
        }
    }
}