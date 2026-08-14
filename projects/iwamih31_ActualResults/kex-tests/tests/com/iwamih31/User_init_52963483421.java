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

public class User_init_52963483421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3130;
     Object term3132;
     Object term3146;
     Object term3162;

    public User_init_52963483421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3130 = new Integer(-1048298087);
        term3132 = new Integer(292681826);
        term3146 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3146, term3146.getClass(), "year", 2023);
        setShortField(term3146, term3146.getClass(), "month", (short) 3);
        setShortField(term3146, term3146.getClass(), "day", (short) 7);
        term3162 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3162, term3162.getClass(), "year", 2022);
        setShortField(term3162, term3162.getClass(), "month", (short) 10);
        setShortField(term3162, term3162.getClass(), "day", (short) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.User");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDate");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.time.LocalDate");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        Object[] args = new Object[8];
        args[0] = term3130;
        args[1] = term3132;
        args[2] = "lHfTrWKMPk";
        args[3] = term3146;
        args[4] = "JDaAnsVTGV";
        args[5] = term3162;
        args[6] = "mLUZFTfjle";
        args[7] = "xIeFjkHkOe";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


