package com.smalaca.nestedclasses;

class WithAnonymousClass {
	
	interface HasName {
		String getName();
	}
	
	abstract class WithName implements HasName {
		String name;
		
		WithName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
	}

	String getRealization() {
		return getName(new HasName() {
			
			public String getName() {
				return "Hi, my name is ?";
			}
		});
	}

	String getSubType(String name) {
		return getName(new WithName(name) {
			
			@Override
			public String getName() {
				return "Hi, my name is " + super.getName();
			}
		});
	}

	public String getFullName(final String firstName, String name) {
		
		return getName(new WithName(name) {
			private String fName;
			
			{
				this.fName = firstName;
			}
			
			class Formatter {
				String format(String firstName, String name) {
					return new StringBuilder().append(firstName).append(" ").append(name).toString();
				}
			}
			
			final Formatter formatter = new Formatter();
			
			@Override
			public String getName() {
				return formatter.format(fName, super.getName());
			}
		}); 
	}
	
	private String getName(HasName hasName) {
		return hasName.getName();
	}
}
