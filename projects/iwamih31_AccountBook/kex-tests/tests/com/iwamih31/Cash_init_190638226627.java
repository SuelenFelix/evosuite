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

public class Cash_init_190638226627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14445;
     Object term14447;
     Object term14451;
     Object term14453;
     Object term14455;
     Object term14457;
     Object term14459;
     Object term14461;
     Object term14463;
     Object term14465;
     Object term14467;

    public Cash_init_190638226627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14445 = new Integer(-2070466617);
        term14447 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term14447, term14447.getClass(), "year", 2014);
        setShortField(term14447, term14447.getClass(), "month", (short) 2);
        setShortField(term14447, term14447.getClass(), "day", (short) 23);
        term14451 = new Integer(-1127721881);
        term14453 = new Integer(1074848808);
        term14455 = new Integer(-146054762);
        term14457 = new Integer(798043553);
        term14459 = new Integer(533197381);
        term14461 = new Integer(1048271679);
        term14463 = new Integer(-1529797673);
        term14465 = new Integer(-868676396);
        term14467 = new Integer(1922684808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.time.LocalDate");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.lang.Integer");
        argTypes[5] = Class.forName("java.lang.Integer");
        argTypes[6] = Class.forName("java.lang.Integer");
        argTypes[7] = Class.forName("java.lang.Integer");
        argTypes[8] = Class.forName("java.lang.Integer");
        argTypes[9] = Class.forName("java.lang.Integer");
        argTypes[10] = Class.forName("java.lang.Integer");
        Object[] args = new Object[11];
        args[0] = term14445;
        args[1] = term14447;
        args[2] = term14451;
        args[3] = term14453;
        args[4] = term14455;
        args[5] = term14457;
        args[6] = term14459;
        args[7] = term14461;
        args[8] = term14463;
        args[9] = term14465;
        args[10] = term14467;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


