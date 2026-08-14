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

public class User_getName_17090103842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1210;

    public User_getName_17090103842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1211 = new Integer(-1685132342);
        Integer term1213 = new Integer(-1456670397);
        term1210 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1243 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1210, term1210.getClass(), "id", term1211);
        setField(term1210, term1210.getClass(), "room", term1213);
        setField(term1210, term1210.getClass(), "name", "jDtqGUpnZN");
        setIntField(term1227, term1227.getClass(), "year", 2015);
        setShortField(term1227, term1227.getClass(), "month", (short) 9);
        setShortField(term1227, term1227.getClass(), "day", (short) 19);
        setField(term1210, term1210.getClass(), "birthday", term1227);
        setField(term1210, term1210.getClass(), "level", "nGKItKLYNC");
        setIntField(term1243, term1243.getClass(), "year", 2018);
        setShortField(term1243, term1243.getClass(), "month", (short) 1);
        setShortField(term1243, term1243.getClass(), "day", (short) 13);
        setField(term1210, term1210.getClass(), "move_in", term1243);
        setField(term1210, term1210.getClass(), "use", "UiUYnPrcCi");
        setField(term1210, term1210.getClass(), "note", "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1210, args);
    }

};


