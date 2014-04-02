package com.smalaca.nestedclasses;

class WithLocalClass {

	private static String staticAttr = "static";
	private String regular = "regular";
	final private String finalAttr = "final";

	String getStatic() {
		class LocalClass {
			String get() {
				return staticAttr;
//				return WithLocalClass.staticAttr;
			}
		}
		
		return new LocalClass().get();
	}

	String getRegular() {
		class LocalClass {
			String get() {
				return WithLocalClass.this.regular;
//				return WithLocalClass.this.regular;
			}
		}
		
		return new LocalClass().get();
	}

	String getFinal() {
		class LocalClass {
			String get() {
				return finalAttr;
//				return WithLocalClass.this.finalAttr;
			}
		}
		
		return new LocalClass().get();
	}
//
//	String getRegularVar() {
//		String regularVar = "regular var";
//		
//		class LocalClass {
//			String get() {
//				return regularVar;
//			}
//		}
//		
//		return new LocalClass().get();
//	}

	String getFinalVar() {
		final String finalVar = "final var";
		
		class LocalClass {
			String get() {
				return finalVar;
			}
		}
		
		return new LocalClass().get();
	}
	
	boolean isLocalClassAlive() {
		class LocalClass {
			boolean imAlive() {
				return true;
			}
		}
		
		return new LocalClass().imAlive();
	}
}
