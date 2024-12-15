package ru.itgirls;

import ru.itgirls.exception.InvalidDayOfWeekNameException;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InvalidDayOfWeekNameException {
        Scanner scanner = new Scanner(System.in);
        WeekdaysTranslator weekdaysTranslator = new WeekdaysTranslator();

        System.out.println("Enter day of the week in English:");
        String englishDayOfWeek = scanner.nextLine();

        try {
            String russianDayOfWeek = weekdaysTranslator.translateDayOfTheWeekToRussian(englishDayOfWeek);
            System.out.println("This is your entered day of the week name in Russian: " + russianDayOfWeek);
        } catch (InvalidDayOfWeekNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
