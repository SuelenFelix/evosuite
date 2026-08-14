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

public class ReferenceResolver_updateReferencesRescursive_18130321129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554;

    public ReferenceResolver_updateReferencesRescursive_18130321129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolver"));
        setField(term554, term554.getClass(), "file", null);
        setField(term554, term554.getClass(), "stack", null);
        setField(term554, term554.getClass(), "visitedNodes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        argTypes[1] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "updateReferencesRescursive", argTypes, term554, args);
    }

};


