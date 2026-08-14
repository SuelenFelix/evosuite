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

public class User_setBirthday_91062605311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2145;
     Object term2206;

    public User_setBirthday_91062605311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2146 = new Integer(-1530420153);
        Integer term2148 = new Integer(-469968304);
        term2145 = newInstance(Class.forName("com.iwamih31.User"));
        Object term2162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2178 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2145, term2145.getClass(), "id", term2146);
        setField(term2145, term2145.getClass(), "room", term2148);
        setField(term2145, term2145.getClass(), "name", "PHvxnGHptP");
        setIntField(term2162, term2162.getClass(), "year", 2018);
        setShortField(term2162, term2162.getClass(), "month", (short) 9);
        setShortField(term2162, term2162.getClass(), "day", (short) 27);
        setField(term2145, term2145.getClass(), "birthday", term2162);
        setField(term2145, term2145.getClass(), "level", "TimdotUuNC");
        setIntField(term2178, term2178.getClass(), "year", 2025);
        setShortField(term2178, term2178.getClass(), "month", (short) 4);
        setShortField(term2178, term2178.getClass(), "day", (short) 8);
        setField(term2145, term2145.getClass(), "move_in", term2178);
        setField(term2145, term2145.getClass(), "use", "PkWMRdJcBb");
        setField(term2145, term2145.getClass(), "note", "jSpAteRute");
        term2206 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2206, term2206.getClass(), "year", 2012);
        setShortField(term2206, term2206.getClass(), "month", (short) 9);
        setShortField(term2206, term2206.getClass(), "day", (short) 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2206;
        callMethod(klass, "setBirthday", argTypes, term2145, args);
    }

};


