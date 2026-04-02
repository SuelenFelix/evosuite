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

public class Cash_getHyaku5_6460994855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13894;

    public Cash_getHyaku5_6460994855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13895 = new Integer(-893623680);
        Integer term13901 = new Integer(-1963434938);
        Integer term13903 = new Integer(906181092);
        Integer term13905 = new Integer(1045657203);
        Integer term13907 = new Integer(1386130016);
        Integer term13909 = new Integer(1072005683);
        Integer term13911 = new Integer(1861318859);
        Integer term13913 = new Integer(1474524152);
        Integer term13915 = new Integer(568954359);
        Integer term13917 = new Integer(53410913);
        term13894 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13897 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13894, term13894.getClass(), "id", term13895);
        setIntField(term13897, term13897.getClass(), "year", 2011);
        setShortField(term13897, term13897.getClass(), "month", (short) 5);
        setShortField(term13897, term13897.getClass(), "day", (short) 4);
        setField(term13894, term13894.getClass(), "date", term13897);
        setField(term13894, term13894.getClass(), "man1", term13901);
        setField(term13894, term13894.getClass(), "sen5", term13903);
        setField(term13894, term13894.getClass(), "sen1", term13905);
        setField(term13894, term13894.getClass(), "hyaku5", term13907);
        setField(term13894, term13894.getClass(), "hyaku1", term13909);
        setField(term13894, term13894.getClass(), "jyuu5", term13911);
        setField(term13894, term13894.getClass(), "jyuu1", term13913);
        setField(term13894, term13894.getClass(), "en5", term13915);
        setField(term13894, term13894.getClass(), "en1", term13917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHyaku5", argTypes, term13894, args);
    }

};


