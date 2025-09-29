package com.pluralsight;

import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Full name: ");
        String full_name = keyboard.nextLine();
        System.out.print("Date of show: ");
        String date_of_show = keyboard.nextLine();
        System.out.print("Number of tickets: ");
        int ticket_number = keyboard.nextInt();
        keyboard.nextLine();

        String[] name_parts = full_name.split(Pattern.quote(" "));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyy");
        LocalDate today = LocalDate.parse(date_of_show,format);

        if (ticket_number == 1) {
        }


    }
}
