package com.example.EmailUpdate;

public class UserProfileDemo {
    public static void main(String[] args) {

        UserProfile user = new UserProfile(
                1001,
                "0712345678",
                "Muscat, Oman"
        );

        System.out.println("=== Original User Profile ===");
        System.out.println("User ID: " + user.getUserId());
        System.out.println("Phone Number: " + user.getPhoneNumber());
        System.out.println("Address: " + user.getAddress());

        user.setPhoneNumber("0798765432");
        user.setAddress("Ruwi, Muscat");

        System.out.println("\n=== Updated User Profile ===");
        System.out.println("User ID: " + user.getUserId());
        System.out.println("Phone Number: " + user.getPhoneNumber());
        System.out.println("Address: " + user.getAddress());
    }
}
}
