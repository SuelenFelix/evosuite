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

public class Cash_toString_59439911725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14420;

    public Cash_toString_59439911725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14421 = new Integer(-1697741155);
        Integer term14427 = new Integer(1295839803);
        Integer term14429 = new Integer(-1891015523);
        Integer term14431 = new Integer(-1560631747);
        Integer term14433 = new Integer(1215150180);
        Integer term14435 = new Integer(-1422859977);
        Integer term14437 = new Integer(-1972436591);
        Integer term14439 = new Integer(68922753);
        Integer term14441 = new Integer(-220791533);
        Integer term14443 = new Integer(1741500243);
        term14420 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14423 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14420, term14420.getClass(), "id", term14421);
        setIntField(term14423, term14423.getClass(), "year", 2021);
        setShortField(term14423, term14423.getClass(), "month", (short) 8);
        setShortField(term14423, term14423.getClass(), "day", (short) 11);
        setField(term14420, term14420.getClass(), "date", term14423);
        setField(term14420, term14420.getClass(), "man1", term14427);
        setField(term14420, term14420.getClass(), "sen5", term14429);
        setField(term14420, term14420.getClass(), "sen1", term14431);
        setField(term14420, term14420.getClass(), "hyaku5", term14433);
        setField(term14420, term14420.getClass(), "hyaku1", term14435);
        setField(term14420, term14420.getClass(), "jyuu5", term14437);
        setField(term14420, term14420.getClass(), "jyuu1", term14439);
        setField(term14420, term14420.getClass(), "en5", term14441);
        setField(term14420, term14420.getClass(), "en1", term14443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term14420, args);
    }

};


