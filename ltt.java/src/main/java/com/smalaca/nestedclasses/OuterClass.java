package com.smalaca.nestedclasses;

class OuterClass {
	
	private String name;
	
	OuterClass() {}
	
	OuterClass(String name) {
		this.name = name;
	}
	
	static void doIt() {}

	static class StaticNestedClass {
		
		boolean amINested() {
			return true;
		}
	}
	
	class InnerClass {
		
		private String name;
		
		InnerClass() {}
		
		InnerClass(String name) {
			this.name = name;
		}

		boolean amIInner() {
			return true;
		}

		String getName() {
			return name;
		}

		String getOuterName() {
			return OuterClass.this.name;
		}
	}
}
