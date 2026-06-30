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

public class Action_getApply_5634080283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12928;

    public Action_getApply_5634080283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12929 = new Integer(-6029667);
        Integer term12959 = new Integer(-2068769794);
        Integer term12961 = new Integer(-117576464);
        term12928 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term12931 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term12928, term12928.getClass(), "id", term12929);
        setIntField(term12931, term12931.getClass(), "year", 2029);
        setShortField(term12931, term12931.getClass(), "month", (short) 1);
        setShortField(term12931, term12931.getClass(), "day", (short) 20);
        setField(term12928, term12928.getClass(), "date", term12931);
        setField(term12928, term12928.getClass(), "subject", "kNqaJKIATy");
        setField(term12928, term12928.getClass(), "apply", "vKQukfbJUd");
        setField(term12928, term12928.getClass(), "income", term12959);
        setField(term12928, term12928.getClass(), "spending", term12961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getApply", argTypes, term12928, args);
    }

};


