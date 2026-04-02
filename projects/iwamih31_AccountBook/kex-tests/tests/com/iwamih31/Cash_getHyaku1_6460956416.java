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

public class Cash_getHyaku1_6460956416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13919;

    public Cash_getHyaku1_6460956416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13920 = new Integer(-375014958);
        Integer term13926 = new Integer(1107176718);
        Integer term13928 = new Integer(480137250);
        Integer term13930 = new Integer(-341152642);
        Integer term13932 = new Integer(-2015854073);
        Integer term13934 = new Integer(538259104);
        Integer term13936 = new Integer(96566506);
        Integer term13938 = new Integer(-343325701);
        Integer term13940 = new Integer(107945604);
        Integer term13942 = new Integer(-1963464809);
        term13919 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13922 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13919, term13919.getClass(), "id", term13920);
        setIntField(term13922, term13922.getClass(), "year", 2017);
        setShortField(term13922, term13922.getClass(), "month", (short) 3);
        setShortField(term13922, term13922.getClass(), "day", (short) 5);
        setField(term13919, term13919.getClass(), "date", term13922);
        setField(term13919, term13919.getClass(), "man1", term13926);
        setField(term13919, term13919.getClass(), "sen5", term13928);
        setField(term13919, term13919.getClass(), "sen1", term13930);
        setField(term13919, term13919.getClass(), "hyaku5", term13932);
        setField(term13919, term13919.getClass(), "hyaku1", term13934);
        setField(term13919, term13919.getClass(), "jyuu5", term13936);
        setField(term13919, term13919.getClass(), "jyuu1", term13938);
        setField(term13919, term13919.getClass(), "en5", term13940);
        setField(term13919, term13919.getClass(), "en1", term13942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHyaku1", argTypes, term13919, args);
    }

};


