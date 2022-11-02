public class Cat extends MyPet  {
	private  String type;

	public Cat(String  name,  double weight,  String  type) {
		super  (name, weight);
		this.type = type;
	}
		
		@Override 
		public String makeSound() {
			return "Meow";
			}
			public String getType() {
				return type;
			}
			public void setType(String type){
				this.type = type;
			}
		
		}
