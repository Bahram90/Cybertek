
public class Main {

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.name="Bubbly";
		dog1.age=5;
		dog1.breed="Poodle";
		dog1.color="White";
		
		System.out.println(dog1.name+":"+dog1.age+":"+dog1.breed+":"+dog1.color);
		
		dog1.bark();
		dog1.eat();
		dog1.wegTail();
		
        ////////////////////////////////
		System.out.println("===================");
		
		Dog dog2=new Dog();
		dog2.name="Chester";
		dog2.age=7;
		dog2.breed="Cocker";
		dog2.color="Brown";
		
		System.out.println(dog2.name+":"+dog2.age+":"+dog2.breed+":"+dog2.color);
		
		dog2.bark();
		dog2.eat();
		dog2.wegTail();
		
		////////////////////////////////
		
		Dog dog3=new Dog();
		dog3.name="Sherman";
		dog3.age=2;
		dog3.breed="Britany";
		dog3.color="Black";
		
		System.out.println(dog3.name+":"+dog3.age+":"+dog3.breed+":"+dog3.color);
		
		dog3.bark();
		dog3.eat();
		dog3.wegTail();
		
	}	
	

}
