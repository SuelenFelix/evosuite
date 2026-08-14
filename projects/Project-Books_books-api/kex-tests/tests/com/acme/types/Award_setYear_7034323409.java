package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Award_setYear_7034323409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6271;
     Object term6313;

    public Award_setYear_7034323409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6326 = Class.forName((String) "com.acme.types.AwardName");
        Field term6325 = ((Class) term6326).getDeclaredField((String) "WOMENS_PRIZE");
        ((Field) term6325).setAccessible(true);
        Object enum15 = ((Field) term6325).get((Object) null);
        term6271 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term6271, term6271.getClass(), "id", "UkppLrLyZM");
        setField(term6271, term6271.getClass(), "awardName", enum15);
        setField(term6271, term6271.getClass(), "category", "MxFKwAHuar");
        setIntField(term6271, term6271.getClass(), "year", 1107176718);
        term6313 = new Integer(480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6313;
        callMethod(klass, "setYear", argTypes, term6271, args);
    }

};


