package com.meteergin.medium.stream;

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
import static com.meteergin.medium.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_canEqual_136721681111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831;
     Object term870;

    public User_canEqual_136721681111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term831 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term831, term831.getClass(), "id", -4325723315152823407L);
        setField(term831, term831.getClass(), "firstName", "xrwlQZdwCp");
        setField(term831, term831.getClass(), "lastName", "IDCWpPLRkE");
        setIntField(term831, term831.getClass(), "age", 1134449235);
        setField(term831, term831.getClass(), "nationality", "nyiiPDVjAc");
        term870 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term870;
        callMethod(klass, "canEqual", argTypes, term831, args);
    }

};


