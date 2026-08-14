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

public class ReferenceResolverStackEntry_getIndexes_14108537295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608;

    public ReferenceResolverStackEntry_getIndexes_14108537295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term614 = new HashMap();
        term608 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term609 = newInstance(Class.forName("java.util.Stack"));
        Object[] term610 = (Object[]) newArray("java.lang.Object", 10);
        setField(term609, term609.getClass(), "elementData", term610);
        setIntField(term609, term609.getClass(), "elementCount", 1);
        setIntField(term609, term609.getClass(), "capacityIncrement", 0);
        setIntField(term609, term609.getClass(), "modCount", 1);
        setField(term608, term608.getClass(), "nodesToVisit", term609);
        setField(term608, term608.getClass(), "node", null);
        setField(term608, term608.getClass(), "indexes", term614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndexes", argTypes, term608, args);
    }

};


