package com.patika.model;

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
import static com.patika.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class WriterDto_init_19708143781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;
     Object term783;
     Object term821;

    public WriterDto_init_19708143781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781 = new Integer(1725571209);
        term783 = newInstance(Class.forName("java.util.Date"));
        setLongField(term783, term783.getClass(), "fastTime", 1797203628025L);
        setField(term783, term783.getClass(), "cdate", null);
        term821 = new Double(0.36923381893433327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Date");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = double.class;
        Object[] args = new Object[6];
        args[0] = term781;
        args[1] = term783;
        args[2] = "dWRymuLBtr";
        args[3] = "AijpHYOFuy";
        args[4] = "SbAoxhfrkn";
        args[5] = term821;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


