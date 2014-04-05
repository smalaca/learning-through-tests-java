package com.smalaca.nestedclasses;

class WithLocalClass {

	private static String staticAttr = "static";
	private String regular = "regular";
	final private String finalAttr = "final";

	String getStatic() {
		class LocalClass {
			String get() {
				// both acceptable
				return staticAttr;
//				return WithLocalClass.staticAttr;
			}
		}
		
		return new LocalClass().get();
	}

	String getRegular() {
		class LocalClass {
			String get() {
//				both acceptable
				return regular;
//				return WithLocalClass.this.regular;
			}
		}
		
		return new LocalClass().get();
	}

	String getFinal() {
		class LocalClass {
			String get() {
//				both acceptable
				return finalAttr;
//				return WithLocalClass.this.finalAttr;
			}
		}
		
		return new LocalClass().get();
	}

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

//	String getStaticMember() {
//		class LocalClass {
//			private static String staticMember = "static member"; 
//			String get() {
//				return staticMember;
//			}
//		}
//		
//		return new LocalClass().get();
//	}

	String getStaticFinalMember() {
		class LocalClass {
			private static final String staticMember = "static and final"; 
			String get() {
				return staticMember;
			}
		}
		
		return new LocalClass().get();
	}
	
//	void withInterface() {
//        interface DoSomething {
//           public void doIt();
//        }
//        
//        class Run implements DoSomething {
//            public void doIt() {}
//        }
//        
//        new Run().doIt();
//    }
}
