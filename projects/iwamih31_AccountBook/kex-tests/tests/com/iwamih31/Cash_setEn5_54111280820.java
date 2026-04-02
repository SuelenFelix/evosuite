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

public class Cash_setEn5_54111280820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14289;
     Object term14314;

    public Cash_setEn5_54111280820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14290 = new Integer(1745276158);
        Integer term14296 = new Integer(2009020256);
        Integer term14298 = new Integer(2049577015);
        Integer term14300 = new Integer(1236004505);
        Integer term14302 = new Integer(1050765721);
        Integer term14304 = new Integer(474518942);
        Integer term14306 = new Integer(-1656687479);
        Integer term14308 = new Integer(-249614216);
        Integer term14310 = new Integer(1870727665);
        Integer term14312 = new Integer(-519881101);
        term14289 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14292 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14289, term14289.getClass(), "id", term14290);
        setIntField(term14292, term14292.getClass(), "year", 2013);
        setShortField(term14292, term14292.getClass(), "month", (short) 3);
        setShortField(term14292, term14292.getClass(), "day", (short) 8);
        setField(term14289, term14289.getClass(), "date", term14292);
        setField(term14289, term14289.getClass(), "man1", term14296);
        setField(term14289, term14289.getClass(), "sen5", term14298);
        setField(term14289, term14289.getClass(), "sen1", term14300);
        setField(term14289, term14289.getClass(), "hyaku5", term14302);
        setField(term14289, term14289.getClass(), "hyaku1", term14304);
        setField(term14289, term14289.getClass(), "jyuu5", term14306);
        setField(term14289, term14289.getClass(), "jyuu1", term14308);
        setField(term14289, term14289.getClass(), "en5", term14310);
        setField(term14289, term14289.getClass(), "en1", term14312);
        term14314 = new Integer(-680920524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14314;
        callMethod(klass, "setEn5", argTypes, term14289, args);
    }

};


