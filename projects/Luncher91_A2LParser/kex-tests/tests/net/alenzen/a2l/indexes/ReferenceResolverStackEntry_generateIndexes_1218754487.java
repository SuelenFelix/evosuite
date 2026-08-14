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

public class ReferenceResolverStackEntry_generateIndexes_1218754487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636;

    public ReferenceResolverStackEntry_generateIndexes_1218754487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term642 = new HashMap();
        term636 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term637 = newInstance(Class.forName("java.util.Stack"));
        Object[] term638 = (Object[]) newArray("java.lang.Object", 10);
        setField(term637, term637.getClass(), "elementData", term638);
        setIntField(term637, term637.getClass(), "elementCount", 0);
        setIntField(term637, term637.getClass(), "capacityIncrement", 0);
        setIntField(term637, term637.getClass(), "modCount", 0);
        setField(term636, term636.getClass(), "nodesToVisit", term637);
        setField(term636, term636.getClass(), "node", null);
        setField(term636, term636.getClass(), "indexes", term642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateIndexes", argTypes, term636, args);
    }

};


