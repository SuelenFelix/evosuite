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

public class Plan_getMinutes_2775521278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32465;

    public Plan_getMinutes_2775521278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32466 = new Integer(972867650);
        Integer term32468 = new Integer(1655935355);
        Integer term32514 = new Integer(-481533957);
        term32465 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term32470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32474 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32465, term32465.getClass(), "id", term32466);
        setField(term32465, term32465.getClass(), "user_id", term32468);
        setIntField(term32470, term32470.getClass(), "year", 2016);
        setShortField(term32470, term32470.getClass(), "month", (short) 6);
        setShortField(term32470, term32470.getClass(), "day", (short) 15);
        setField(term32465, term32465.getClass(), "start_date", term32470);
        setIntField(term32474, term32474.getClass(), "year", 2018);
        setShortField(term32474, term32474.getClass(), "month", (short) 9);
        setShortField(term32474, term32474.getClass(), "day", (short) 1);
        setField(term32465, term32465.getClass(), "last_date", term32474);
        setField(term32465, term32465.getClass(), "day_of_week", "NYSBqIpNlD");
        setField(term32465, term32465.getClass(), "subject", "OWglDUWQYb");
        setField(term32465, term32465.getClass(), "start_time", "FiqETbKjpv");
        setField(term32465, term32465.getClass(), "minutes", term32514);
        setField(term32465, term32465.getClass(), "items", "FxXtdhhXyS");
        setField(term32465, term32465.getClass(), "note", "HxCEzaCcgj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinutes", argTypes, term32465, args);
    }

};


