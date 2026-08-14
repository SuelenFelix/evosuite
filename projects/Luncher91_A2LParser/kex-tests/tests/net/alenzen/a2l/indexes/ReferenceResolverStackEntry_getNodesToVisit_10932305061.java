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
import java.lang.Object;
import java.util.HashMap;

public class ReferenceResolverStackEntry_getNodesToVisit_10932305061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559;

    public ReferenceResolverStackEntry_getNodesToVisit_10932305061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term565 = new HashMap();
        term559 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term560 = newInstance(Class.forName("java.util.Stack"));
        Object[] term561 = (Object[]) newArray("java.lang.Object", 10);
        setField(term560, term560.getClass(), "elementData", term561);
        setIntField(term560, term560.getClass(), "elementCount", 6);
        setIntField(term560, term560.getClass(), "capacityIncrement", 0);
        setIntField(term560, term560.getClass(), "modCount", 6);
        setField(term559, term559.getClass(), "nodesToVisit", term560);
        setField(term559, term559.getClass(), "node", null);
        setField(term559, term559.getClass(), "indexes", term565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodesToVisit", argTypes, term559, args);
    }

};


