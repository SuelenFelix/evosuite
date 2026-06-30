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

public class Cash_setMan1_153251557713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14100;
     Object term14125;

    public Cash_setMan1_153251557713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14101 = new Integer(-1945706126);
        Integer term14107 = new Integer(1152356969);
        Integer term14109 = new Integer(-1667990367);
        Integer term14111 = new Integer(-1214628358);
        Integer term14113 = new Integer(1102721075);
        Integer term14115 = new Integer(-426764678);
        Integer term14117 = new Integer(-1222614956);
        Integer term14119 = new Integer(-1870495012);
        Integer term14121 = new Integer(-1310015129);
        Integer term14123 = new Integer(-2104981311);
        term14100 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14103 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14100, term14100.getClass(), "id", term14101);
        setIntField(term14103, term14103.getClass(), "year", 2015);
        setShortField(term14103, term14103.getClass(), "month", (short) 3);
        setShortField(term14103, term14103.getClass(), "day", (short) 10);
        setField(term14100, term14100.getClass(), "date", term14103);
        setField(term14100, term14100.getClass(), "man1", term14107);
        setField(term14100, term14100.getClass(), "sen5", term14109);
        setField(term14100, term14100.getClass(), "sen1", term14111);
        setField(term14100, term14100.getClass(), "hyaku5", term14113);
        setField(term14100, term14100.getClass(), "hyaku1", term14115);
        setField(term14100, term14100.getClass(), "jyuu5", term14117);
        setField(term14100, term14100.getClass(), "jyuu1", term14119);
        setField(term14100, term14100.getClass(), "en5", term14121);
        setField(term14100, term14100.getClass(), "en1", term14123);
        term14125 = new Integer(-571169753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14125;
        callMethod(klass, "setMan1", argTypes, term14100, args);
    }

};


