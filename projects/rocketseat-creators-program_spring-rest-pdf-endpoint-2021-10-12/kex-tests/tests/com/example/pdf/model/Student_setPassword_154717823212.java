package com.example.pdf.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.example.pdf.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Student_setPassword_154717823212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1930;

    public Student_setPassword_154717823212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1930 = newInstance(Class.forName("com.example.pdf.model.Student"));
        Object term1979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1983 = newInstance(Class.forName("com.example.pdf.model.School"));
        Object term2008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2013 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2018 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2019 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2023 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1930, term1930.getClass(), "id", "HqBOwkVqjD");
        setField(term1930, term1930.getClass(), "name", "MAcUBcBckh");
        setField(term1930, term1930.getClass(), "email", "oVgzLbrsFr");
        setField(term1930, term1930.getClass(), "password", "vQVyKLdtaz");
        setIntField(term1979, term1979.getClass(), "year", 2025);
        setShortField(term1979, term1979.getClass(), "month", (short) 4);
        setShortField(term1979, term1979.getClass(), "day", (short) 23);
        setField(term1930, term1930.getClass(), "birthday", term1979);
        setField(term1983, term1983.getClass(), "id", "OWKQODBLzb");
        setField(term1983, term1983.getClass(), "name", "wGmYcqUkgE");
        setIntField(term2009, term2009.getClass(), "year", 2027);
        setShortField(term2009, term2009.getClass(), "month", (short) 8);
        setShortField(term2009, term2009.getClass(), "day", (short) 26);
        setField(term2008, term2008.getClass(), "date", term2009);
        setByteField(term2013, term2013.getClass(), "hour", (byte) 5);
        setByteField(term2013, term2013.getClass(), "minute", (byte) 11);
        setByteField(term2013, term2013.getClass(), "second", (byte) 9);
        setIntField(term2013, term2013.getClass(), "nano", 219245092);
        setField(term2008, term2008.getClass(), "time", term2013);
        setField(term1983, term1983.getClass(), "createdAt", term2008);
        setField(term1930, term1930.getClass(), "school", term1983);
        setIntField(term2019, term2019.getClass(), "year", 2025);
        setShortField(term2019, term2019.getClass(), "month", (short) 3);
        setShortField(term2019, term2019.getClass(), "day", (short) 9);
        setField(term2018, term2018.getClass(), "date", term2019);
        setByteField(term2023, term2023.getClass(), "hour", (byte) 5);
        setByteField(term2023, term2023.getClass(), "minute", (byte) 49);
        setByteField(term2023, term2023.getClass(), "second", (byte) 12);
        setIntField(term2023, term2023.getClass(), "nano", 791695028);
        setField(term2018, term2018.getClass(), "time", term2023);
        setField(term1930, term1930.getClass(), "createdAt", term2018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.model.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "idgaQsnJpQ";
        callMethod(klass, "setPassword", argTypes, term1930, args);
    }

};


