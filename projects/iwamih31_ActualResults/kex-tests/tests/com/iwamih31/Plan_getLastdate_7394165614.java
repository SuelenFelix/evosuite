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

public class Plan_getLastdate_7394165614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31965;

    public Plan_getLastdate_7394165614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31966 = new Integer(-112921587);
        Integer term31968 = new Integer(933028652);
        Integer term32014 = new Integer(287287233);
        term31965 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term31970 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31974 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31965, term31965.getClass(), "id", term31966);
        setField(term31965, term31965.getClass(), "user_id", term31968);
        setIntField(term31970, term31970.getClass(), "year", 2028);
        setShortField(term31970, term31970.getClass(), "month", (short) 9);
        setShortField(term31970, term31970.getClass(), "day", (short) 30);
        setField(term31965, term31965.getClass(), "start_date", term31970);
        setIntField(term31974, term31974.getClass(), "year", 2026);
        setShortField(term31974, term31974.getClass(), "month", (short) 11);
        setShortField(term31974, term31974.getClass(), "day", (short) 29);
        setField(term31965, term31965.getClass(), "last_date", term31974);
        setField(term31965, term31965.getClass(), "day_of_week", "sofyLEfomV");
        setField(term31965, term31965.getClass(), "subject", "zHcDSJHKAb");
        setField(term31965, term31965.getClass(), "start_time", "WRIQkTdeMl");
        setField(term31965, term31965.getClass(), "minutes", term32014);
        setField(term31965, term31965.getClass(), "items", "rLSEheWsHd");
        setField(term31965, term31965.getClass(), "note", "DoUKDhlGCY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLast_date", argTypes, term31965, args);
    }

};


