package unima.aula2_exercicio_Parque;

interface IPessoa {
	final String name = "";
	int age = 0;
	float height = 0;
	float mass = 0;
	String sex = "";
	
	String getName();
	int getAge();
	float getHeight();
	float getMass();
	String getSex();
	double getIMC();
	
	
	void setName(String name);
	void setAge(int age);
	void setHeight(float height);
	void setSex(String sex);
	void setMass(float mass);
	
	void walk();
	void status();
	void speak();
}

public class Pessoa implements IPessoa {
	private String name;
	private int age;
	private float height; // in meters
	private float mass; // in kg
	private String sex;
	
	public Pessoa(String name, int age, String sex, float height, float mass) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.mass = mass;
		this.sex = sex;
	}
	
	public Pessoa() {
		this("", 0, "", 0, 0);
	}
	
	// getters
	public String getName() { 
		return this.name; 
	}

	public int getAge() { 
		return this.age;
	}

	public float getHeight() { 
		return this.height; 
	}
	
	public float getMass() { 
		return this.mass; 
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public double getIMC() {
		double result = this.mass / Math.pow(height, 2);	; 
		return result;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {

		this.age = age;
	} 
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setMass(float mass) {
		this.mass = mass;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	// methods
	public void walk() {
		System.out.println(this.name + " está andando...");
	}
	
	public void speak() {
		System.out.println(this.name + " está falando...");
	}
	
	public void status() {
		System.out.println("========== STATUS ==========");
		System.out.println("Name: " + this.name);
		System.out.println("Sex: " + this.sex);
		System.out.println("Age: " + this.age + " anos");
		System.out.println("Height: " + this.height + " metros");
		System.out.println("Mass: " + this.mass + " kg");
		System.out.println("IMC: " + this.getIMC());
	}
}
