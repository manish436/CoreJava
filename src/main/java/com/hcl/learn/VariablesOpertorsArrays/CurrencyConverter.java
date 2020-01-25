package com.hcl.learn.VariablesOpertorsArrays;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConverter {
	int rupee = 63;
	int dirham = 3; // UAE
	int real = 3; // brazilian
	int chilean_peso = 595;
	int mexican_peso = 18;
	int _yen = 107;
	int $australian = 2; // australian dollar
	int dollar;
	int Rupee = 63;
	long dollarValue = 10000000000L;
	int octalValue = 0101;
	int x, y = 10;
	float f = 123e-23f;
	char charValue = 65;
	int intValue = 'A';
	int[] myArray = { 23, 23, 56, 555};

	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrencies();
		System.out.println("Char Value: " + cc.charValue);
		System.out.println("Char Value: " + cc.intValue);
		System.out.println(cc.myArray.length);
	}

	void printCurrencies() {
		x = y = 10;
		System.out.println(" Value of x and y:" + x + y);
		System.out.println("Ocatal Value: " + octalValue);
		System.out.println("dollarValue: " + dollarValue);
		System.out.println("rupee: " + rupee);
		System.out.println("$australian: " + $australian);
		System.out.println("dirham: " + dirham);
		System.out.println("real" + real);
		System.out.println("chilean_peso: " + chilean_peso);
		System.out.println("mexican_peso: " + mexican_peso);
		System.out.println("yen: " + _yen);
		System.out.println("dollar: " + dollar);
		System.out.println("Rupee: " + Rupee);

	}
}
