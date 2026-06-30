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

public class Cash_getEn1_105879955010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14019;

    public Cash_getEn1_105879955010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14020 = new Integer(1384592638);
        Integer term14026 = new Integer(-1002370457);
        Integer term14028 = new Integer(-2014576105);
        Integer term14030 = new Integer(1296895584);
        Integer term14032 = new Integer(628918458);
        Integer term14034 = new Integer(-1274456137);
        Integer term14036 = new Integer(1041916673);
        Integer term14038 = new Integer(-601863069);
        Integer term14040 = new Integer(663292551);
        Integer term14042 = new Integer(-1885090354);
        term14019 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14022 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14019, term14019.getClass(), "id", term14020);
        setIntField(term14022, term14022.getClass(), "year", 2014);
        setShortField(term14022, term14022.getClass(), "month", (short) 7);
        setShortField(term14022, term14022.getClass(), "day", (short) 13);
        setField(term14019, term14019.getClass(), "date", term14022);
        setField(term14019, term14019.getClass(), "man1", term14026);
        setField(term14019, term14019.getClass(), "sen5", term14028);
        setField(term14019, term14019.getClass(), "sen1", term14030);
        setField(term14019, term14019.getClass(), "hyaku5", term14032);
        setField(term14019, term14019.getClass(), "hyaku1", term14034);
        setField(term14019, term14019.getClass(), "jyuu5", term14036);
        setField(term14019, term14019.getClass(), "jyuu1", term14038);
        setField(term14019, term14019.getClass(), "en5", term14040);
        setField(term14019, term14019.getClass(), "en1", term14042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEn1", argTypes, term14019, args);
    }

};


