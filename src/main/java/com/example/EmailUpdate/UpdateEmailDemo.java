package com.example.EmailUpdate;

public class UpdateEmailDemo {
    public static void main(String[] args) {

        String oldEmail = "ahmed@example.com";
        String newEmail = "ali@example.com";

        boolean isUpdated;

        System.out.println("Original Email: " + oldEmail);
        System.out.println("New Email: " + newEmail);

        if (!oldEmail.equalsIgnoreCase(newEmail)) {

            oldEmail = newEmail;
            isUpdated = true;
            System.out.println("Email updated successfully.");

        } else {


        }


}
