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

public class Plan_getId_9567671291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31590;

    public Plan_getId_9567671291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31591 = new Integer(1328271830);
        Integer term31593 = new Integer(1596070772);
        Integer term31639 = new Integer(97029295);
        term31590 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term31595 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31599 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31590, term31590.getClass(), "id", term31591);
        setField(term31590, term31590.getClass(), "user_id", term31593);
        setIntField(term31595, term31595.getClass(), "year", 2027);
        setShortField(term31595, term31595.getClass(), "month", (short) 8);
        setShortField(term31595, term31595.getClass(), "day", (short) 25);
        setField(term31590, term31590.getClass(), "start_date", term31595);
        setIntField(term31599, term31599.getClass(), "year", 2014);
        setShortField(term31599, term31599.getClass(), "month", (short) 5);
        setShortField(term31599, term31599.getClass(), "day", (short) 21);
        setField(term31590, term31590.getClass(), "last_date", term31599);
        setField(term31590, term31590.getClass(), "day_of_week", "ZhWJlplAVK");
        setField(term31590, term31590.getClass(), "subject", "pnmjTuTojv");
        setField(term31590, term31590.getClass(), "start_time", "eMtshhmGEm");
        setField(term31590, term31590.getClass(), "minutes", term31639);
        setField(term31590, term31590.getClass(), "items", "VJUbzHGOvg");
        setField(term31590, term31590.getClass(), "note", "SiwcigIrfD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term31590, args);
    }

};


