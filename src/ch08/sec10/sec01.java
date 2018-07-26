package ch08.sec10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sec01 {
    public static void main(String[] args) {
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
        Map<String, String> languageNames = locales.collect(
                Collectors.toMap(
                        Locale::getDisplayLanguage,
                        loc -> loc.getDisplayLanguage(loc),
                (existingValue, newValue) -> existingValue));

        Map<String, List<Locale>> countryToLocales = locales.collect(Collectors.groupingBy(Locale::getCountry));

        List<Locale> swissLocales = countryToLocales.get("CH");

    }
}