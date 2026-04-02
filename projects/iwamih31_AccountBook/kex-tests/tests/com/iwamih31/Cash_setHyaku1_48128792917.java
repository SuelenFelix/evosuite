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

public class Cash_setHyaku1_48128792917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14208;
     Object term14233;

    public Cash_setHyaku1_48128792917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14209 = new Integer(-130649791);
        Integer term14215 = new Integer(534834644);
        Integer term14217 = new Integer(1959097203);
        Integer term14219 = new Integer(-209654048);
        Integer term14221 = new Integer(477625804);
        Integer term14223 = new Integer(252575029);
        Integer term14225 = new Integer(57189932);
        Integer term14227 = new Integer(1460722225);
        Integer term14229 = new Integer(1743224434);
        Integer term14231 = new Integer(842904495);
        term14208 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14211 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14208, term14208.getClass(), "id", term14209);
        setIntField(term14211, term14211.getClass(), "year", 2025);
        setShortField(term14211, term14211.getClass(), "month", (short) 3);
        setShortField(term14211, term14211.getClass(), "day", (short) 8);
        setField(term14208, term14208.getClass(), "date", term14211);
        setField(term14208, term14208.getClass(), "man1", term14215);
        setField(term14208, term14208.getClass(), "sen5", term14217);
        setField(term14208, term14208.getClass(), "sen1", term14219);
        setField(term14208, term14208.getClass(), "hyaku5", term14221);
        setField(term14208, term14208.getClass(), "hyaku1", term14223);
        setField(term14208, term14208.getClass(), "jyuu5", term14225);
        setField(term14208, term14208.getClass(), "jyuu1", term14227);
        setField(term14208, term14208.getClass(), "en5", term14229);
        setField(term14208, term14208.getClass(), "en1", term14231);
        term14233 = new Integer(1008080511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14233;
        callMethod(klass, "setHyaku1", argTypes, term14208, args);
    }

};


