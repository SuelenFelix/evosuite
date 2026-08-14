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

public class Plan_toString_58208275524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34591;

    public Plan_toString_58208275524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34592 = new Integer(538259104);
        Integer term34594 = new Integer(96566506);
        Integer term34640 = new Integer(-343325701);
        term34591 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term34596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34600 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term34591, term34591.getClass(), "id", term34592);
        setField(term34591, term34591.getClass(), "user_id", term34594);
        setIntField(term34596, term34596.getClass(), "year", 2013);
        setShortField(term34596, term34596.getClass(), "month", (short) 5);
        setShortField(term34596, term34596.getClass(), "day", (short) 26);
        setField(term34591, term34591.getClass(), "start_date", term34596);
        setIntField(term34600, term34600.getClass(), "year", 2017);
        setShortField(term34600, term34600.getClass(), "month", (short) 11);
        setShortField(term34600, term34600.getClass(), "day", (short) 9);
        setField(term34591, term34591.getClass(), "last_date", term34600);
        setField(term34591, term34591.getClass(), "day_of_week", "DiSkERzqOE");
        setField(term34591, term34591.getClass(), "subject", "hPSZZeYqHQ");
        setField(term34591, term34591.getClass(), "start_time", "scReMUKyGq");
        setField(term34591, term34591.getClass(), "minutes", term34640);
        setField(term34591, term34591.getClass(), "items", "FmIpnxjRxA");
        setField(term34591, term34591.getClass(), "note", "FTjxxGvyun");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term34591, args);
    }

};


