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

public class User_getUse_3847901446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1614;

    public User_getUse_3847901446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1615 = new Integer(-1007160944);
        Integer term1617 = new Integer(1135664017);
        term1614 = newInstance(Class.forName("com.iwamih31.User"));
        Object term1631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1647 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1614, term1614.getClass(), "id", term1615);
        setField(term1614, term1614.getClass(), "room", term1617);
        setField(term1614, term1614.getClass(), "name", "uWHnvSvaPl");
        setIntField(term1631, term1631.getClass(), "year", 2025);
        setShortField(term1631, term1631.getClass(), "month", (short) 4);
        setShortField(term1631, term1631.getClass(), "day", (short) 23);
        setField(term1614, term1614.getClass(), "birthday", term1631);
        setField(term1614, term1614.getClass(), "level", "kBdSllIBVz");
        setIntField(term1647, term1647.getClass(), "year", 2012);
        setShortField(term1647, term1647.getClass(), "month", (short) 10);
        setShortField(term1647, term1647.getClass(), "day", (short) 1);
        setField(term1614, term1614.getClass(), "move_in", term1647);
        setField(term1614, term1614.getClass(), "use", "TJmVBGfTML");
        setField(term1614, term1614.getClass(), "note", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUse", argTypes, term1614, args);
    }

};


