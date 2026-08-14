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

public class Plan_getStarttime_6948115677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32340;

    public Plan_getStarttime_6948115677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32341 = new Integer(1063420942);
        Integer term32343 = new Integer(1375330971);
        Integer term32389 = new Integer(-478195677);
        term32340 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term32345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32349 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32340, term32340.getClass(), "id", term32341);
        setField(term32340, term32340.getClass(), "user_id", term32343);
        setIntField(term32345, term32345.getClass(), "year", 2025);
        setShortField(term32345, term32345.getClass(), "month", (short) 11);
        setShortField(term32345, term32345.getClass(), "day", (short) 3);
        setField(term32340, term32340.getClass(), "start_date", term32345);
        setIntField(term32349, term32349.getClass(), "year", 2014);
        setShortField(term32349, term32349.getClass(), "month", (short) 3);
        setShortField(term32349, term32349.getClass(), "day", (short) 22);
        setField(term32340, term32340.getClass(), "last_date", term32349);
        setField(term32340, term32340.getClass(), "day_of_week", "HZODpafOGe");
        setField(term32340, term32340.getClass(), "subject", "dUTYEKtTfQ");
        setField(term32340, term32340.getClass(), "start_time", "HUtbHklGel");
        setField(term32340, term32340.getClass(), "minutes", term32389);
        setField(term32340, term32340.getClass(), "items", "QbfKDAwhSB");
        setField(term32340, term32340.getClass(), "note", "ckTRHEIcCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart_time", argTypes, term32340, args);
    }

};


