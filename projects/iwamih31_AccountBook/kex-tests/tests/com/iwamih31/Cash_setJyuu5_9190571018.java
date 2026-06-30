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

public class Cash_setJyuu5_9190571018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14235;
     Object term14260;

    public Cash_setJyuu5_9190571018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14236 = new Integer(1935707624);
        Integer term14242 = new Integer(1507074215);
        Integer term14244 = new Integer(-282881827);
        Integer term14246 = new Integer(-1183353915);
        Integer term14248 = new Integer(-420030135);
        Integer term14250 = new Integer(267763294);
        Integer term14252 = new Integer(-1497710478);
        Integer term14254 = new Integer(49950830);
        Integer term14256 = new Integer(-525257914);
        Integer term14258 = new Integer(147209682);
        term14235 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14238 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14235, term14235.getClass(), "id", term14236);
        setIntField(term14238, term14238.getClass(), "year", 2025);
        setShortField(term14238, term14238.getClass(), "month", (short) 11);
        setShortField(term14238, term14238.getClass(), "day", (short) 1);
        setField(term14235, term14235.getClass(), "date", term14238);
        setField(term14235, term14235.getClass(), "man1", term14242);
        setField(term14235, term14235.getClass(), "sen5", term14244);
        setField(term14235, term14235.getClass(), "sen1", term14246);
        setField(term14235, term14235.getClass(), "hyaku5", term14248);
        setField(term14235, term14235.getClass(), "hyaku1", term14250);
        setField(term14235, term14235.getClass(), "jyuu5", term14252);
        setField(term14235, term14235.getClass(), "jyuu1", term14254);
        setField(term14235, term14235.getClass(), "en5", term14256);
        setField(term14235, term14235.getClass(), "en1", term14258);
        term14260 = new Integer(34470066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14260;
        callMethod(klass, "setJyuu5", argTypes, term14235, args);
    }

};


