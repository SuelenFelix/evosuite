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

public class User_hashCode_6649295518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2928;

    public User_hashCode_6649295518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2929 = new Integer(1632125673);
        Integer term2931 = new Integer(454281060);
        term2928 = newInstance(Class.forName("com.iwamih31.User"));
        Object term2945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2961 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2928, term2928.getClass(), "id", term2929);
        setField(term2928, term2928.getClass(), "room", term2931);
        setField(term2928, term2928.getClass(), "name", "XylxrMBraH");
        setIntField(term2945, term2945.getClass(), "year", 2020);
        setShortField(term2945, term2945.getClass(), "month", (short) 7);
        setShortField(term2945, term2945.getClass(), "day", (short) 23);
        setField(term2928, term2928.getClass(), "birthday", term2945);
        setField(term2928, term2928.getClass(), "level", "pORebkoRdD");
        setIntField(term2961, term2961.getClass(), "year", 2016);
        setShortField(term2961, term2961.getClass(), "month", (short) 5);
        setShortField(term2961, term2961.getClass(), "day", (short) 28);
        setField(term2928, term2928.getClass(), "move_in", term2961);
        setField(term2928, term2928.getClass(), "use", "mXGCWJDOqA");
        setField(term2928, term2928.getClass(), "note", "dpNsDgfPso");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2928, args);
    }

};


