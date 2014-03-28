package com.smalaca.nestedclasses;

class OuterClass {

	static class StaticNestedClass {
		
		boolean amINested() {
			return true;
		}
	}
	
	class InnerClass {
		
		boolean amIInner() {
			return true;
		}
	}
}
