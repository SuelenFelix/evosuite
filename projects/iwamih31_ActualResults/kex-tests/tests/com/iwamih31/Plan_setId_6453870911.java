package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Plan_setId_6453870911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32840;
     Object term32915;

    public Plan_setId_6453870911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32841 = new Integer(-556405712);
        Integer term32843 = new Integer(-1772434990);
        Integer term32889 = new Integer(-1845499264);
        term32840 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term32845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32849 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32840, term32840.getClass(), "id", term32841);
        setField(term32840, term32840.getClass(), "user_id", term32843);
        setIntField(term32845, term32845.getClass(), "year", 2010);
        setShortField(term32845, term32845.getClass(), "month", (short) 6);
        setShortField(term32845, term32845.getClass(), "day", (short) 14);
        setField(term32840, term32840.getClass(), "start_date", term32845);
        setIntField(term32849, term32849.getClass(), "year", 2010);
        setShortField(term32849, term32849.getClass(), "month", (short) 7);
        setShortField(term32849, term32849.getClass(), "day", (short) 3);
        setField(term32840, term32840.getClass(), "last_date", term32849);
        setField(term32840, term32840.getClass(), "day_of_week", "KyGXZcXJwq");
        setField(term32840, term32840.getClass(), "subject", "TqiCjeuoWE");
        setField(term32840, term32840.getClass(), "start_time", "GWWfkXOYLP");
        setField(term32840, term32840.getClass(), "minutes", term32889);
        setField(term32840, term32840.getClass(), "items", "qvykDllgpT");
        setField(term32840, term32840.getClass(), "note", "hzdUbcLZhZ");
        term32915 = new Integer(-505439934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term32915;
        callMethod(klass, "setId", argTypes, term32840, args);
    }

};


