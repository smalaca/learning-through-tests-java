package com.smalaca.nestedclasses;

class OuterClass {
	
	private String name;
	private static int favouriteNumber = 13;
	
	OuterClass() {}
	
	OuterClass(String name) {
		this.name = name;
	}

	static void doIt() {}

	static class StaticNestedClass {
		
		static boolean canContainStaticMethod() { 
	        return true; 
	    }
		
		boolean amINested() {
			return true;
		}

		int getFavouriteNumber() {
			return OuterClass.favouriteNumber;
		}

		String getName(OuterClass outer) {
			return outer.name;
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
		
		public int getFavouriteNumber() {
			return OuterClass.favouriteNumber;
		}
//		
//		static boolean canContainStaticMethod() { 
//	        return false; 
//	    }
	}
}
