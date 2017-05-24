package com;

public class OperationMultiple implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		return a * b;
	}

}
