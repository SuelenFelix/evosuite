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

public class Cash_setId_5222234711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14044;
     Object term14069;

    public Cash_setId_5222234711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14045 = new Integer(-2066804303);
        Integer term14051 = new Integer(-1731761810);
        Integer term14053 = new Integer(197109649);
        Integer term14055 = new Integer(-1239406390);
        Integer term14057 = new Integer(1557431527);
        Integer term14059 = new Integer(-1504890659);
        Integer term14061 = new Integer(1358829571);
        Integer term14063 = new Integer(991356662);
        Integer term14065 = new Integer(-506958186);
        Integer term14067 = new Integer(-507387516);
        term14044 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14047 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14044, term14044.getClass(), "id", term14045);
        setIntField(term14047, term14047.getClass(), "year", 2027);
        setShortField(term14047, term14047.getClass(), "month", (short) 10);
        setShortField(term14047, term14047.getClass(), "day", (short) 4);
        setField(term14044, term14044.getClass(), "date", term14047);
        setField(term14044, term14044.getClass(), "man1", term14051);
        setField(term14044, term14044.getClass(), "sen5", term14053);
        setField(term14044, term14044.getClass(), "sen1", term14055);
        setField(term14044, term14044.getClass(), "hyaku5", term14057);
        setField(term14044, term14044.getClass(), "hyaku1", term14059);
        setField(term14044, term14044.getClass(), "jyuu5", term14061);
        setField(term14044, term14044.getClass(), "jyuu1", term14063);
        setField(term14044, term14044.getClass(), "en5", term14065);
        setField(term14044, term14044.getClass(), "en1", term14067);
        term14069 = new Integer(-1970452551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14069;
        callMethod(klass, "setId", argTypes, term14044, args);
    }

};


