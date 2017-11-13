package com.prg.hashcode;
import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String passport;

	public User() {}
	
	public User(String name, int age, String passport) {
		this.name = name;
		this.age = age;
		this.passport = passport;
	}

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }
    
    
    
    public static void main(String[] args) {
		User user1 = new User();
		System.out.println(user1.hashCode());
		
		User user2 = new User("Bob", 43, "TDS93235");
		System.out.println(user2.hashCode());
		
		User user3 = new User("Bob", 43, "TDS93235");
		System.out.println(user3.hashCode());
	
	}

}