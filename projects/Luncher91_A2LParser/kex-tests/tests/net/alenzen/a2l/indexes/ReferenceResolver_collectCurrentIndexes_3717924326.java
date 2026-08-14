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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ReferenceResolver_collectCurrentIndexes_3717924326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497;

    public ReferenceResolver_collectCurrentIndexes_3717924326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term505 = new HashMap();
        HashMap term515 = new HashMap();
        HashMap term525 = new HashMap();
        HashMap term535 = new HashMap();
        HashMap term544 = new HashMap();
        Set<Object> term552 =  ((Map) term544).keySet();
        HashSet term543 = new HashSet((Collection<? extends Object>) term552);
        term497 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolver"));
        Object term498 = newInstance(Class.forName("java.util.Stack"));
        Object[] term499 = (Object[]) newArray("java.lang.Object", 10);
        Object term500 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term501 = newInstance(Class.forName("java.util.Stack"));
        Object term510 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term511 = newInstance(Class.forName("java.util.Stack"));
        Object term520 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term521 = newInstance(Class.forName("java.util.Stack"));
        Object term530 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term531 = newInstance(Class.forName("java.util.Stack"));
        setField(term497, term497.getClass(), "file", null);
        setField(term501, term501.getClass(), "elementData", null);
        setIntField(term501, term501.getClass(), "elementCount", 8);
        setIntField(term501, term501.getClass(), "capacityIncrement", 0);
        setIntField(term501, term501.getClass(), "modCount", 8);
        setField(term500, term500.getClass(), "nodesToVisit", term501);
        setField(term500, term500.getClass(), "node", null);
        setField(term500, term500.getClass(), "indexes", term505);
        setElement(term499, 0, term500);
        setField(term511, term511.getClass(), "elementData", null);
        setIntField(term511, term511.getClass(), "elementCount", 6);
        setIntField(term511, term511.getClass(), "capacityIncrement", 0);
        setIntField(term511, term511.getClass(), "modCount", 6);
        setField(term510, term510.getClass(), "nodesToVisit", term511);
        setField(term510, term510.getClass(), "node", null);
        setField(term510, term510.getClass(), "indexes", term515);
        setElement(term499, 1, term510);
        setField(term521, term521.getClass(), "elementData", null);
        setIntField(term521, term521.getClass(), "elementCount", 2);
        setIntField(term521, term521.getClass(), "capacityIncrement", 0);
        setIntField(term521, term521.getClass(), "modCount", 2);
        setField(term520, term520.getClass(), "nodesToVisit", term521);
        setField(term520, term520.getClass(), "node", null);
        setField(term520, term520.getClass(), "indexes", term525);
        setElement(term499, 2, term520);
        setField(term531, term531.getClass(), "elementData", null);
        setIntField(term531, term531.getClass(), "elementCount", 8);
        setIntField(term531, term531.getClass(), "capacityIncrement", 0);
        setIntField(term531, term531.getClass(), "modCount", 8);
        setField(term530, term530.getClass(), "nodesToVisit", term531);
        setField(term530, term530.getClass(), "node", null);
        setField(term530, term530.getClass(), "indexes", term535);
        setElement(term499, 3, term530);
        setField(term498, term498.getClass(), "elementData", term499);
        setIntField(term498, term498.getClass(), "elementCount", 4);
        setIntField(term498, term498.getClass(), "capacityIncrement", 0);
        setIntField(term498, term498.getClass(), "modCount", 4);
        setField(term497, term497.getClass(), "stack", term498);
        setField(term497, term497.getClass(), "visitedNodes", term543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "collectCurrentIndexes", argTypes, term497, args);
    }

};


