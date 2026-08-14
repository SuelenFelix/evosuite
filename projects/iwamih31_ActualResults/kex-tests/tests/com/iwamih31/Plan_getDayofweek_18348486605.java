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

public class Plan_getDayofweek_18348486605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32090;

    public Plan_getDayofweek_18348486605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32091 = new Integer(962840079);
        Integer term32093 = new Integer(1540719661);
        Integer term32139 = new Integer(1265463001);
        term32090 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term32095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32099 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32090, term32090.getClass(), "id", term32091);
        setField(term32090, term32090.getClass(), "user_id", term32093);
        setIntField(term32095, term32095.getClass(), "year", 2027);
        setShortField(term32095, term32095.getClass(), "month", (short) 2);
        setShortField(term32095, term32095.getClass(), "day", (short) 18);
        setField(term32090, term32090.getClass(), "start_date", term32095);
        setIntField(term32099, term32099.getClass(), "year", 2028);
        setShortField(term32099, term32099.getClass(), "month", (short) 5);
        setShortField(term32099, term32099.getClass(), "day", (short) 29);
        setField(term32090, term32090.getClass(), "last_date", term32099);
        setField(term32090, term32090.getClass(), "day_of_week", "IeoToWsQWU");
        setField(term32090, term32090.getClass(), "subject", "QxiiHtQAzN");
        setField(term32090, term32090.getClass(), "start_time", "gQgTBlRIvX");
        setField(term32090, term32090.getClass(), "minutes", term32139);
        setField(term32090, term32090.getClass(), "items", "ulKaKnANzj");
        setField(term32090, term32090.getClass(), "note", "ABwhdjjeJi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDay_of_week", argTypes, term32090, args);
    }

};


