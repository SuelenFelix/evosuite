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

public class User_getBirthday_6709749773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1311;

    public User_getBirthday_6709749773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1312 = new Integer(1622346318);
        Integer term1314 = new Integer(1048535127);
        term1311 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1344 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1311, term1311.getClass(), "id", term1312);
        setField(term1311, term1311.getClass(), "room", term1314);
        setField(term1311, term1311.getClass(), "name", "JDswTTCZHV");
        setIntField(term1328, term1328.getClass(), "year", 2015);
        setShortField(term1328, term1328.getClass(), "month", (short) 4);
        setShortField(term1328, term1328.getClass(), "day", (short) 14);
        setField(term1311, term1311.getClass(), "birthday", term1328);
        setField(term1311, term1311.getClass(), "level", "onpbIeEKoi");
        setIntField(term1344, term1344.getClass(), "year", 2017);
        setShortField(term1344, term1344.getClass(), "month", (short) 5);
        setShortField(term1344, term1344.getClass(), "day", (short) 21);
        setField(term1311, term1311.getClass(), "move_in", term1344);
        setField(term1311, term1311.getClass(), "use", "YRHGsAkhxb");
        setField(term1311, term1311.getClass(), "note", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term1311, args);
    }

};


