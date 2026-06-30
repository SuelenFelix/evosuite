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

public class Cash_getJyuu1_9899110488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13969;

    public Cash_getJyuu1_9899110488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13970 = new Integer(1555897383);
        Integer term13976 = new Integer(202001407);
        Integer term13978 = new Integer(158873461);
        Integer term13980 = new Integer(-430151637);
        Integer term13982 = new Integer(-1697741339);
        Integer term13984 = new Integer(98922530);
        Integer term13986 = new Integer(-1388471422);
        Integer term13988 = new Integer(-1498296052);
        Integer term13990 = new Integer(2098647989);
        Integer term13992 = new Integer(1598895173);
        term13969 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13972 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13969, term13969.getClass(), "id", term13970);
        setIntField(term13972, term13972.getClass(), "year", 2020);
        setShortField(term13972, term13972.getClass(), "month", (short) 7);
        setShortField(term13972, term13972.getClass(), "day", (short) 23);
        setField(term13969, term13969.getClass(), "date", term13972);
        setField(term13969, term13969.getClass(), "man1", term13976);
        setField(term13969, term13969.getClass(), "sen5", term13978);
        setField(term13969, term13969.getClass(), "sen1", term13980);
        setField(term13969, term13969.getClass(), "hyaku5", term13982);
        setField(term13969, term13969.getClass(), "hyaku1", term13984);
        setField(term13969, term13969.getClass(), "jyuu5", term13986);
        setField(term13969, term13969.getClass(), "jyuu1", term13988);
        setField(term13969, term13969.getClass(), "en5", term13990);
        setField(term13969, term13969.getClass(), "en1", term13992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJyuu1", argTypes, term13969, args);
    }

};


