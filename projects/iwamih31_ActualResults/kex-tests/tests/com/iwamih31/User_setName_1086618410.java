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

public class User_setName_1086618410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2022;

    public User_setName_1086618410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2023 = new Integer(1193880199);
        Integer term2025 = new Integer(-1087774327);
        term2022 = newInstance(Class.forName("com.iwamih31.User"));
        Object term2039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2055 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2022, term2022.getClass(), "id", term2023);
        setField(term2022, term2022.getClass(), "room", term2025);
        setField(term2022, term2022.getClass(), "name", "VgZnGoIFwQ");
        setIntField(term2039, term2039.getClass(), "year", 2019);
        setShortField(term2039, term2039.getClass(), "month", (short) 2);
        setShortField(term2039, term2039.getClass(), "day", (short) 20);
        setField(term2022, term2022.getClass(), "birthday", term2039);
        setField(term2022, term2022.getClass(), "level", "jUbSRrkrYZ");
        setIntField(term2055, term2055.getClass(), "year", 2027);
        setShortField(term2055, term2055.getClass(), "month", (short) 3);
        setShortField(term2055, term2055.getClass(), "day", (short) 14);
        setField(term2022, term2022.getClass(), "move_in", term2055);
        setField(term2022, term2022.getClass(), "use", "bWWfajKbEX");
        setField(term2022, term2022.getClass(), "note", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvJFtLBaxj";
        callMethod(klass, "setName", argTypes, term2022, args);
    }

};


