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
import java.util.LinkedHashMap;

public class ReferenceResolverStackEntry_setIndexes_10921748956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619;
     Object term630;

    public ReferenceResolverStackEntry_setIndexes_10921748956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term625 = new HashMap();
        term619 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term620 = newInstance(Class.forName("java.util.Stack"));
        Object[] term621 = (Object[]) newArray("java.lang.Object", 10);
        setField(term620, term620.getClass(), "elementData", term621);
        setIntField(term620, term620.getClass(), "elementCount", 7);
        setIntField(term620, term620.getClass(), "capacityIncrement", 0);
        setIntField(term620, term620.getClass(), "modCount", 7);
        setField(term619, term619.getClass(), "nodesToVisit", term620);
        setField(term619, term619.getClass(), "node", null);
        setField(term619, term619.getClass(), "indexes", term625);
        term630 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term630;
        callMethod(klass, "setIndexes", argTypes, term619, args);
    }

};


