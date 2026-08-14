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

public class ReferenceResolver_updateReferences_16357792298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553;

    public ReferenceResolver_updateReferences_16357792298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term553 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolver"));
        setField(term553, term553.getClass(), "file", null);
        setField(term553, term553.getClass(), "stack", null);
        setField(term553, term553.getClass(), "visitedNodes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updateReferences", argTypes, term553, args);
    }

};


