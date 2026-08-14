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

public class User_setLevel_166921651512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2250;

    public User_setLevel_166921651512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2251 = new Integer(-1145578966);
        Integer term2253 = new Integer(679763016);
        term2250 = newInstance(Class.forName("com.iwamih31.User"));
        Object term2267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2283 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2250, term2250.getClass(), "id", term2251);
        setField(term2250, term2250.getClass(), "room", term2253);
        setField(term2250, term2250.getClass(), "name", "swZVeJAxjt");
        setIntField(term2267, term2267.getClass(), "year", 2017);
        setShortField(term2267, term2267.getClass(), "month", (short) 8);
        setShortField(term2267, term2267.getClass(), "day", (short) 7);
        setField(term2250, term2250.getClass(), "birthday", term2267);
        setField(term2250, term2250.getClass(), "level", "xOcJIiQQDu");
        setIntField(term2283, term2283.getClass(), "year", 2021);
        setShortField(term2283, term2283.getClass(), "month", (short) 9);
        setShortField(term2283, term2283.getClass(), "day", (short) 6);
        setField(term2250, term2250.getClass(), "move_in", term2283);
        setField(term2250, term2250.getClass(), "use", "GVizqqzXpy");
        setField(term2250, term2250.getClass(), "note", "JqXGgAhZPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jiKYgYHqIS";
        callMethod(klass, "setLevel", argTypes, term2250, args);
    }

};


