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

public class Action_setIncome_145617882610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13363;
     Object term13398;

    public Action_setIncome_145617882610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13364 = new Integer(-157887805);
        Integer term13394 = new Integer(1876565163);
        Integer term13396 = new Integer(-817164822);
        term13363 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13366 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13363, term13363.getClass(), "id", term13364);
        setIntField(term13366, term13366.getClass(), "year", 2025);
        setShortField(term13366, term13366.getClass(), "month", (short) 4);
        setShortField(term13366, term13366.getClass(), "day", (short) 8);
        setField(term13363, term13363.getClass(), "date", term13366);
        setField(term13363, term13363.getClass(), "subject", "BjugTaMcxJ");
        setField(term13363, term13363.getClass(), "apply", "vGiuZVPJNH");
        setField(term13363, term13363.getClass(), "income", term13394);
        setField(term13363, term13363.getClass(), "spending", term13396);
        term13398 = new Integer(-1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term13398;
        callMethod(klass, "setIncome", argTypes, term13363, args);
    }

};


