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

public class State_getName_12476017941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435;

    public State_getName_12476017941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term436 = new Integer(1162663216);
        term435 = newInstance(Class.forName("com.iwamih31.State"));
        Object term450 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term435, term435.getClass(), "id", term436);
        setField(term435, term435.getClass(), "name", "tbcdzjIfER");
        setIntField(term450, term450.getClass(), "year", 2016);
        setShortField(term450, term450.getClass(), "month", (short) 11);
        setShortField(term450, term450.getClass(), "day", (short) 29);
        setField(term435, term435.getClass(), "date", term450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term435, args);
    }

};


