package ru.itgirls;

import ru.itgirls.exception.InvalidDayOfWeekNameException;

import java.util.HashMap;

public class WeekdaysTranslator {
    public HashMap<DayOfTheWeekEnglish, String> Translator = new HashMap<>();

    public WeekdaysTranslator() {
        Translator.put(DayOfTheWeekEnglish.MONDAY, "Понедельник");
        Translator.put(DayOfTheWeekEnglish.TUESDAY, "Вторник");
        Translator.put(DayOfTheWeekEnglish.WEDNESDAY, "Среда");
        Translator.put(DayOfTheWeekEnglish.THURSDAY, "Четверг");
        Translator.put(DayOfTheWeekEnglish.FRIDAY, "Пятница");
        Translator.put(DayOfTheWeekEnglish.SATURDAY, "Суббота");
        Translator.put(DayOfTheWeekEnglish.SUNDAY, "Воскресенье");
    }

    public String translateDayOfTheWeekToRussian (String dayOfWeekEnglish) throws InvalidDayOfWeekNameException {
        DayOfTheWeekEnglish enumDayOfWeekEnglish;
        String dayOfWeekRussian;
        String dayOfWeekEnglishUpperCase = dayOfWeekEnglish.toUpperCase();

        if (dayOfWeekEnglishUpperCase.equals("MONDAY") || dayOfWeekEnglishUpperCase.equals("TUESDAY") ||
                dayOfWeekEnglishUpperCase.equals("WEDNESDAY") || dayOfWeekEnglishUpperCase.equals("THURSDAY") ||
                dayOfWeekEnglishUpperCase.equals("FRIDAY") || dayOfWeekEnglishUpperCase.equals("SATURDAY") ||
                dayOfWeekEnglishUpperCase.equals("SUNDAY")) {
            enumDayOfWeekEnglish = DayOfTheWeekEnglish.valueOf(dayOfWeekEnglishUpperCase);
            dayOfWeekRussian = Translator.get(enumDayOfWeekEnglish);
        } else {
            throw new InvalidDayOfWeekNameException("Name of the day of the week entered incorrectly.");
        }

        return dayOfWeekRussian;
    }

}
