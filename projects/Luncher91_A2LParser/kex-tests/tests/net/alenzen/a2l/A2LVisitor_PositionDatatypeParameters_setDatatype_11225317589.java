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

public class A2LVisitor_PositionDatatypeParameters_setDatatype_11225317589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19879;

    public A2LVisitor_PositionDatatypeParameters_setDatatype_11225317589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19879 = newInstance(Class.forName("net.alenzen.a2l.A2LVisitor$PositionDatatypeParameters"));
        setLongField(term19879, term19879.getClass(), "position", 0L);
        setField(term19879, term19879.getClass(), "datatype", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LVisitor$PositionDatatypeParameters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.enums.DataType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDatatype", argTypes, term19879, args);
    }

};


