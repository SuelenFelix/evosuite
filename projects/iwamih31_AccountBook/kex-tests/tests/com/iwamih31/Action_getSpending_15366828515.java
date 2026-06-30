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

public class Action_getSpending_15366828515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13038;

    public Action_getSpending_15366828515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13039 = new Integer(865208305);
        Integer term13069 = new Integer(-1275173084);
        Integer term13071 = new Integer(-244121226);
        term13038 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13041 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13038, term13038.getClass(), "id", term13039);
        setIntField(term13041, term13041.getClass(), "year", 2015);
        setShortField(term13041, term13041.getClass(), "month", (short) 7);
        setShortField(term13041, term13041.getClass(), "day", (short) 24);
        setField(term13038, term13038.getClass(), "date", term13041);
        setField(term13038, term13038.getClass(), "subject", "OqbwYQfvAe");
        setField(term13038, term13038.getClass(), "apply", "tRxZafjqIx");
        setField(term13038, term13038.getClass(), "income", term13069);
        setField(term13038, term13038.getClass(), "spending", term13071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpending", argTypes, term13038, args);
    }

};


