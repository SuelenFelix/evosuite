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

public class Action_setId_15536370166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13093;
     Object term13128;

    public Action_setId_15536370166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13094 = new Integer(-203030934);
        Integer term13124 = new Integer(-1179120542);
        Integer term13126 = new Integer(-73683645);
        term13093 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13096 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13093, term13093.getClass(), "id", term13094);
        setIntField(term13096, term13096.getClass(), "year", 2022);
        setShortField(term13096, term13096.getClass(), "month", (short) 11);
        setShortField(term13096, term13096.getClass(), "day", (short) 16);
        setField(term13093, term13093.getClass(), "date", term13096);
        setField(term13093, term13093.getClass(), "subject", "DhjNLmRMCu");
        setField(term13093, term13093.getClass(), "apply", "PgPzMSEjjX");
        setField(term13093, term13093.getClass(), "income", term13124);
        setField(term13093, term13093.getClass(), "spending", term13126);
        term13128 = new Integer(-226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term13128;
        callMethod(klass, "setId", argTypes, term13093, args);
    }

};


