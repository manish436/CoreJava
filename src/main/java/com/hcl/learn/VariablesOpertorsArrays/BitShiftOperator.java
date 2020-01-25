package com.hcl.learn.VariablesOpertorsArrays;

// Theory: Bitshift operator shifts the bits.
// it works on Integers only.
public class BitShiftOperator {

	// Types of bitshift operators
	// << Left shift <- and pads zeros
	// >>> Unsigned right-shift -> and pads zeros
	// >> Signed right-shift -> and pads MSB(Most significant bit)

	private static void bitShiftExample() {
		int x = 6;
		//6 will be converted into binery
		// ie. 00000000 00000000 00000000 00000110
		// then 1 will be shofted to right
		// i.e. 00000000 00000000 00000000 00000110
		// now the output will be 12
		System.out.println(x << 1);
		// Mathematically: x * pow(2, numberOfBitShift);   
	}

	public static void main(String[] args) {
		bitShiftExample();
	}

}
