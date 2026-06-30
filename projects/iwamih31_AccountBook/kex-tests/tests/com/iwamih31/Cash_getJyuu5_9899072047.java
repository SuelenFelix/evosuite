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

public class Cash_getJyuu5_9899072047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13944;

    public Cash_getJyuu5_9899072047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13945 = new Integer(71190297);
        Integer term13951 = new Integer(1202361360);
        Integer term13953 = new Integer(-2015048153);
        Integer term13955 = new Integer(-2063457669);
        Integer term13957 = new Integer(-1222006000);
        Integer term13959 = new Integer(2095798786);
        Integer term13961 = new Integer(-1565502840);
        Integer term13963 = new Integer(344323424);
        Integer term13965 = new Integer(9726679);
        Integer term13967 = new Integer(-25637976);
        term13944 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13947 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13944, term13944.getClass(), "id", term13945);
        setIntField(term13947, term13947.getClass(), "year", 2011);
        setShortField(term13947, term13947.getClass(), "month", (short) 7);
        setShortField(term13947, term13947.getClass(), "day", (short) 24);
        setField(term13944, term13944.getClass(), "date", term13947);
        setField(term13944, term13944.getClass(), "man1", term13951);
        setField(term13944, term13944.getClass(), "sen5", term13953);
        setField(term13944, term13944.getClass(), "sen1", term13955);
        setField(term13944, term13944.getClass(), "hyaku5", term13957);
        setField(term13944, term13944.getClass(), "hyaku1", term13959);
        setField(term13944, term13944.getClass(), "jyuu5", term13961);
        setField(term13944, term13944.getClass(), "jyuu1", term13963);
        setField(term13944, term13944.getClass(), "en5", term13965);
        setField(term13944, term13944.getClass(), "en1", term13967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJyuu5", argTypes, term13944, args);
    }

};


