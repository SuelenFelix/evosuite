package net.alenzen.a2l;

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
import static net.alenzen.a2l.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class A2LVisitor_PositionDatatypeParameters_setPosition_16732679347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19873;
     Object term19875;

    public A2LVisitor_PositionDatatypeParameters_setPosition_16732679347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19873 = newInstance(Class.forName("net.alenzen.a2l.A2LVisitor$PositionDatatypeParameters"));
        setLongField(term19873, term19873.getClass(), "position", 0L);
        setField(term19873, term19873.getClass(), "datatype", null);
        term19875 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LVisitor$PositionDatatypeParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term19875;
        callMethod(klass, "setPosition", argTypes, term19873, args);
    }

};


