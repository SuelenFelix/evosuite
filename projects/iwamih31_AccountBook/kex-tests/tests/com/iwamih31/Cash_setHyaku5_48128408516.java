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

public class Cash_setHyaku5_48128408516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14181;
     Object term14206;

    public Cash_setHyaku5_48128408516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14182 = new Integer(-1146679443);
        Integer term14188 = new Integer(-860131894);
        Integer term14190 = new Integer(-1022990421);
        Integer term14192 = new Integer(1045547089);
        Integer term14194 = new Integer(-1122880881);
        Integer term14196 = new Integer(-542712742);
        Integer term14198 = new Integer(-1254072822);
        Integer term14200 = new Integer(-1111249833);
        Integer term14202 = new Integer(-1692331299);
        Integer term14204 = new Integer(479531250);
        term14181 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14184 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14181, term14181.getClass(), "id", term14182);
        setIntField(term14184, term14184.getClass(), "year", 2014);
        setShortField(term14184, term14184.getClass(), "month", (short) 5);
        setShortField(term14184, term14184.getClass(), "day", (short) 21);
        setField(term14181, term14181.getClass(), "date", term14184);
        setField(term14181, term14181.getClass(), "man1", term14188);
        setField(term14181, term14181.getClass(), "sen5", term14190);
        setField(term14181, term14181.getClass(), "sen1", term14192);
        setField(term14181, term14181.getClass(), "hyaku5", term14194);
        setField(term14181, term14181.getClass(), "hyaku1", term14196);
        setField(term14181, term14181.getClass(), "jyuu5", term14198);
        setField(term14181, term14181.getClass(), "jyuu1", term14200);
        setField(term14181, term14181.getClass(), "en5", term14202);
        setField(term14181, term14181.getClass(), "en1", term14204);
        term14206 = new Integer(1320570890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14206;
        callMethod(klass, "setHyaku5", argTypes, term14181, args);
    }

};


