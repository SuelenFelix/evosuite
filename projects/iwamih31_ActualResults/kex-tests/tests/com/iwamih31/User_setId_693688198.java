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

public class User_setId_693688198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1816;
     Object term1877;

    public User_setId_693688198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1817 = new Integer(-1275173084);
        Integer term1819 = new Integer(-244121226);
        term1816 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1849 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1816, term1816.getClass(), "id", term1817);
        setField(term1816, term1816.getClass(), "room", term1819);
        setField(term1816, term1816.getClass(), "name", "KoyGrUJeJW");
        setIntField(term1833, term1833.getClass(), "year", 2029);
        setShortField(term1833, term1833.getClass(), "month", (short) 8);
        setShortField(term1833, term1833.getClass(), "day", (short) 28);
        setField(term1816, term1816.getClass(), "birthday", term1833);
        setField(term1816, term1816.getClass(), "level", "HqBOwkVqjD");
        setIntField(term1849, term1849.getClass(), "year", 2015);
        setShortField(term1849, term1849.getClass(), "month", (short) 7);
        setShortField(term1849, term1849.getClass(), "day", (short) 24);
        setField(term1816, term1816.getClass(), "move_in", term1849);
        setField(term1816, term1816.getClass(), "use", "MAcUBcBckh");
        setField(term1816, term1816.getClass(), "note", "oVgzLbrsFr");
        term1877 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1877;
        callMethod(klass, "setId", argTypes, term1816, args);
    }

};


