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

public class Plan_getSubject_21080383296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32215;

    public Plan_getSubject_21080383296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32216 = new Integer(335112684);
        Integer term32218 = new Integer(1551099402);
        Integer term32264 = new Integer(-2027534003);
        term32215 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term32220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32224 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32215, term32215.getClass(), "id", term32216);
        setField(term32215, term32215.getClass(), "user_id", term32218);
        setIntField(term32220, term32220.getClass(), "year", 2021);
        setShortField(term32220, term32220.getClass(), "month", (short) 8);
        setShortField(term32220, term32220.getClass(), "day", (short) 11);
        setField(term32215, term32215.getClass(), "start_date", term32220);
        setIntField(term32224, term32224.getClass(), "year", 2014);
        setShortField(term32224, term32224.getClass(), "month", (short) 2);
        setShortField(term32224, term32224.getClass(), "day", (short) 23);
        setField(term32215, term32215.getClass(), "last_date", term32224);
        setField(term32215, term32215.getClass(), "day_of_week", "KKEcpYXNZV");
        setField(term32215, term32215.getClass(), "subject", "shLHFznysy");
        setField(term32215, term32215.getClass(), "start_time", "YCKIloBHLj");
        setField(term32215, term32215.getClass(), "minutes", term32264);
        setField(term32215, term32215.getClass(), "items", "qUWDhAeFJY");
        setField(term32215, term32215.getClass(), "note", "wboNBMhRjP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubject", argTypes, term32215, args);
    }

};


