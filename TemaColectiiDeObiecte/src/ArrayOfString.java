import java.util.Arrays;

public class ArrayOfString {
	    public static void main(String[] args) {
	        String[] arrayDeSiruri = {"hello", "world"};
	        
	        System.out.println("Array-ul original: " + Arrays.toString(arrayDeSiruri));
	        
	        if (arrayDeSiruri.length >= 2) {
	            String temp = arrayDeSiruri[0];
	            arrayDeSiruri[0] = arrayDeSiruri[arrayDeSiruri.length - 1];
	            arrayDeSiruri[arrayDeSiruri.length - 1] = temp;
	        }
	        
	        System.out.println("Array-ul după schimbare: " + Arrays.toString(arrayDeSiruri));
	    }
	}

