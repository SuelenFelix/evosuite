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

public class Action_getIncome_32879525622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13757;

    public Action_getIncome_32879525622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13757 = newInstance(Class.forName("com.iwamih31.Action"));
        setField(term13757, term13757.getClass(), "id", null);
        setField(term13757, term13757.getClass(), "date", null);
        setField(term13757, term13757.getClass(), "subject", null);
        setField(term13757, term13757.getClass(), "apply", null);
        setField(term13757, term13757.getClass(), "income", null);
        setField(term13757, term13757.getClass(), "spending", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncome", argTypes, term13757, args);
    }

};


