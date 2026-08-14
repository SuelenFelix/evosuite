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

public class A2LWriter_getBOMBytes_10366524830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23997;

    public A2LWriter_getBOMBytes_10366524830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23997 = newInstance(Class.forName("net.alenzen.a2l.A2LWriter"));
        setField(term23997, term23997.getClass(), "lineBreak", null);
        setField(term23997, term23997.getClass(), "indentation", null);
        setField(term23997, term23997.getClass(), "charset", null);
        setField(term23997, term23997.getClass(), "os", null);
        setIntField(term23997, term23997.getClass(), "indentationDepth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.A2LWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBOMBytes", argTypes, term23997, args);
    }

};


