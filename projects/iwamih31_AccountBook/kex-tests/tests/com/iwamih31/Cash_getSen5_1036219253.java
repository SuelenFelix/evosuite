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

public class Cash_getSen5_1036219253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13844;

    public Cash_getSen5_1036219253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13845 = new Integer(-1034506028);
        Integer term13851 = new Integer(-1263114719);
        Integer term13853 = new Integer(-894662986);
        Integer term13855 = new Integer(304775596);
        Integer term13857 = new Integer(-1347665717);
        Integer term13859 = new Integer(-1888585309);
        Integer term13861 = new Integer(683666002);
        Integer term13863 = new Integer(1596213415);
        Integer term13865 = new Integer(-268815336);
        Integer term13867 = new Integer(-1210583429);
        term13844 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13847 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13844, term13844.getClass(), "id", term13845);
        setIntField(term13847, term13847.getClass(), "year", 2022);
        setShortField(term13847, term13847.getClass(), "month", (short) 8);
        setShortField(term13847, term13847.getClass(), "day", (short) 8);
        setField(term13844, term13844.getClass(), "date", term13847);
        setField(term13844, term13844.getClass(), "man1", term13851);
        setField(term13844, term13844.getClass(), "sen5", term13853);
        setField(term13844, term13844.getClass(), "sen1", term13855);
        setField(term13844, term13844.getClass(), "hyaku5", term13857);
        setField(term13844, term13844.getClass(), "hyaku1", term13859);
        setField(term13844, term13844.getClass(), "jyuu5", term13861);
        setField(term13844, term13844.getClass(), "jyuu1", term13863);
        setField(term13844, term13844.getClass(), "en5", term13865);
        setField(term13844, term13844.getClass(), "en1", term13867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSen5", argTypes, term13844, args);
    }

};


