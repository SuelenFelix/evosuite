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

public class Action_getIncome_3287952564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12983;

    public Action_getIncome_3287952564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12984 = new Integer(-1007160944);
        Integer term13014 = new Integer(1135664017);
        Integer term13016 = new Integer(590364439);
        term12983 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term12986 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term12983, term12983.getClass(), "id", term12984);
        setIntField(term12986, term12986.getClass(), "year", 2029);
        setShortField(term12986, term12986.getClass(), "month", (short) 8);
        setShortField(term12986, term12986.getClass(), "day", (short) 28);
        setField(term12983, term12983.getClass(), "date", term12986);
        setField(term12983, term12983.getClass(), "subject", "lFRJFUMVbx");
        setField(term12983, term12983.getClass(), "apply", "sZdUNdggUW");
        setField(term12983, term12983.getClass(), "income", term13014);
        setField(term12983, term12983.getClass(), "spending", term13016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncome", argTypes, term12983, args);
    }

};


