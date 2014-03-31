package com.smalaca.nestedclasses;

class OuterClass {
	
	private String name;
	
	public OuterClass() {}
	
	public OuterClass(String name) {
		this.name = name;
	}

	static class StaticNestedClass {
		
		boolean amINested() {
			return true;
		}
	}
	
	class InnerClass {
		
		private String name;
		
		public InnerClass() {}
		
		public InnerClass(String name) {
			this.name = name;
		}

		boolean amIInner() {
			return true;
		}

		public String getName() {
			return name;
		}

		public String getOuterName() {
			return OuterClass.this.name;
		}
	}
}
