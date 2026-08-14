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

public class User_getRoom_1057857871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1109;

    public User_getRoom_1057857871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1110 = new Integer(1585847225);
        Integer term1112 = new Integer(597278769);
        term1109 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1142 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1109, term1109.getClass(), "id", term1110);
        setField(term1109, term1109.getClass(), "room", term1112);
        setField(term1109, term1109.getClass(), "name", "GzFkzHGYFt");
        setIntField(term1126, term1126.getClass(), "year", 2021);
        setShortField(term1126, term1126.getClass(), "month", (short) 1);
        setShortField(term1126, term1126.getClass(), "day", (short) 18);
        setField(term1109, term1109.getClass(), "birthday", term1126);
        setField(term1109, term1109.getClass(), "level", "tShwQLRGNe");
        setIntField(term1142, term1142.getClass(), "year", 2020);
        setShortField(term1142, term1142.getClass(), "month", (short) 11);
        setShortField(term1142, term1142.getClass(), "day", (short) 22);
        setField(term1109, term1109.getClass(), "move_in", term1142);
        setField(term1109, term1109.getClass(), "use", "LvtrsXUliU");
        setField(term1109, term1109.getClass(), "note", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoom", argTypes, term1109, args);
    }

};


