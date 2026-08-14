package com.pfa.app.model.id;

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
import static com.pfa.app.model.id.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class AssignmentId_init_10411598721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term5;

    public AssignmentId_init_10411598721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term3 = new Integer(1162663216);
        term5 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term6, term6.getClass(), "year", 2012);
        setShortField(term6, term6.getClass(), "month", (short) 8);
        setShortField(term6, term6.getClass(), "day", (short) 25);
        setField(term5, term5.getClass(), "date", term6);
        setByteField(term10, term10.getClass(), "hour", (byte) 5);
        setByteField(term10, term10.getClass(), "minute", (byte) 20);
        setByteField(term10, term10.getClass(), "second", (byte) 50);
        setIntField(term10, term10.getClass(), "nano", 345595912);
        setField(term5, term5.getClass(), "time", term10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.id.AssignmentId");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.Integer");
        argTypes[2] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term3;
        args[2] = term5;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


