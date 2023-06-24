public class Magic {
	public static void main(String[] args) {
    // Will refer to myNumber as the original number
    int myNumber = 23;
    int magicNumber = myNumber * myNumber;
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;
    System.out.println(magicNumber);
    // The output is always 3 no matther what integer myNumber is. 
    /* Due to the range of the int primitive data type, only set myNumber to 
    integer values between -46,341 and 46,340 (both inclusive). Values outside 
    of this range for myNumber will cause the value of stepOne to exceed the 
    maximum possible value of int when we multiply myNumber by itself, which 
    can cause the program to produce unexpected results! */
	}
}