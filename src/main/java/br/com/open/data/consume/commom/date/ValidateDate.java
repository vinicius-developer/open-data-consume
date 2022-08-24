package br.com.open.data.consume.commom.date;

import java.security.InvalidParameterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidateDate {

    public static void isValid(String date) {

        SimpleDateFormat pattern =
                new SimpleDateFormat("yyyy-MM-dd");

        if(date == null) {
            ValidateDate.callException();
        }

        try {
            pattern.parse(date);
        } catch(ParseException parseException) {
            ValidateDate.callException();
        }

    }

    private static void callException() {
        throw new InvalidParameterException("Data informada não é valida");
    }

}
