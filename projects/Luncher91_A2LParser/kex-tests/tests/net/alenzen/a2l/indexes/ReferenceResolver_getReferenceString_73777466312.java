package net.alenzen.a2l.indexes;

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
import static net.alenzen.a2l.indexes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReferenceResolver_getReferenceString_73777466312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;

    public ReferenceResolver_getReferenceString_73777466312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term557 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolver"));
        setField(term557, term557.getClass(), "file", null);
        setField(term557, term557.getClass(), "stack", null);
        setField(term557, term557.getClass(), "visitedNodes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getReferenceString", argTypes, term557, args);
    }

};


