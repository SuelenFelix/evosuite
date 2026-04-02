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

public class Cash_setJyuu1_9190955419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14262;
     Object term14287;

    public Cash_setJyuu1_9190955419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14263 = new Integer(2058711405);
        Integer term14269 = new Integer(1743683601);
        Integer term14271 = new Integer(-945116798);
        Integer term14273 = new Integer(1593461795);
        Integer term14275 = new Integer(515182546);
        Integer term14277 = new Integer(-936895502);
        Integer term14279 = new Integer(-129547140);
        Integer term14281 = new Integer(199287428);
        Integer term14283 = new Integer(-1195339592);
        Integer term14285 = new Integer(-376422566);
        term14262 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14265 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14262, term14262.getClass(), "id", term14263);
        setIntField(term14265, term14265.getClass(), "year", 2023);
        setShortField(term14265, term14265.getClass(), "month", (short) 9);
        setShortField(term14265, term14265.getClass(), "day", (short) 22);
        setField(term14262, term14262.getClass(), "date", term14265);
        setField(term14262, term14262.getClass(), "man1", term14269);
        setField(term14262, term14262.getClass(), "sen5", term14271);
        setField(term14262, term14262.getClass(), "sen1", term14273);
        setField(term14262, term14262.getClass(), "hyaku5", term14275);
        setField(term14262, term14262.getClass(), "hyaku1", term14277);
        setField(term14262, term14262.getClass(), "jyuu5", term14279);
        setField(term14262, term14262.getClass(), "jyuu1", term14281);
        setField(term14262, term14262.getClass(), "en5", term14283);
        setField(term14262, term14262.getClass(), "en1", term14285);
        term14287 = new Integer(306847454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14287;
        callMethod(klass, "setJyuu1", argTypes, term14262, args);
    }

};


