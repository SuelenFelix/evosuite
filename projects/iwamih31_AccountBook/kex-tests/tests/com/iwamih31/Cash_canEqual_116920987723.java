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

public class Cash_canEqual_116920987723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14369;
     Object term14394;

    public Cash_canEqual_116920987723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14370 = new Integer(803925431);
        Integer term14376 = new Integer(76929641);
        Integer term14378 = new Integer(-2003192918);
        Integer term14380 = new Integer(-1362856620);
        Integer term14382 = new Integer(-1835839814);
        Integer term14384 = new Integer(-1404350380);
        Integer term14386 = new Integer(-2013924238);
        Integer term14388 = new Integer(579006268);
        Integer term14390 = new Integer(-1694747156);
        Integer term14392 = new Integer(1466373988);
        term14369 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14372 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14369, term14369.getClass(), "id", term14370);
        setIntField(term14372, term14372.getClass(), "year", 2027);
        setShortField(term14372, term14372.getClass(), "month", (short) 2);
        setShortField(term14372, term14372.getClass(), "day", (short) 18);
        setField(term14369, term14369.getClass(), "date", term14372);
        setField(term14369, term14369.getClass(), "man1", term14376);
        setField(term14369, term14369.getClass(), "sen5", term14378);
        setField(term14369, term14369.getClass(), "sen1", term14380);
        setField(term14369, term14369.getClass(), "hyaku5", term14382);
        setField(term14369, term14369.getClass(), "hyaku1", term14384);
        setField(term14369, term14369.getClass(), "jyuu5", term14386);
        setField(term14369, term14369.getClass(), "jyuu1", term14388);
        setField(term14369, term14369.getClass(), "en5", term14390);
        setField(term14369, term14369.getClass(), "en1", term14392);
        term14394 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14394;
        callMethod(klass, "canEqual", argTypes, term14369, args);
    }

};


