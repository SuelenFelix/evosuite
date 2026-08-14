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

public class Plan_setStartdate_45739563713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33094;
     Object term33169;

    public Plan_setStartdate_45739563713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term33095 = new Integer(-1263114719);
        Integer term33097 = new Integer(-894662986);
        Integer term33143 = new Integer(304775596);
        term33094 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term33099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33103 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33094, term33094.getClass(), "id", term33095);
        setField(term33094, term33094.getClass(), "user_id", term33097);
        setIntField(term33099, term33099.getClass(), "year", 2024);
        setShortField(term33099, term33099.getClass(), "month", (short) 4);
        setShortField(term33099, term33099.getClass(), "day", (short) 23);
        setField(term33094, term33094.getClass(), "start_date", term33099);
        setIntField(term33103, term33103.getClass(), "year", 2022);
        setShortField(term33103, term33103.getClass(), "month", (short) 9);
        setShortField(term33103, term33103.getClass(), "day", (short) 17);
        setField(term33094, term33094.getClass(), "last_date", term33103);
        setField(term33094, term33094.getClass(), "day_of_week", "otxkkKfDfl");
        setField(term33094, term33094.getClass(), "subject", "bqIuFFFwnP");
        setField(term33094, term33094.getClass(), "start_time", "hDxvvVgGlk");
        setField(term33094, term33094.getClass(), "minutes", term33143);
        setField(term33094, term33094.getClass(), "items", "XdjSvjaTqk");
        setField(term33094, term33094.getClass(), "note", "ukrlYVcvsg");
        term33169 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term33169, term33169.getClass(), "year", 2010);
        setShortField(term33169, term33169.getClass(), "month", (short) 1);
        setShortField(term33169, term33169.getClass(), "day", (short) 17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term33169;
        callMethod(klass, "setStart_date", argTypes, term33094, args);
    }

};


