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

public class ReferenceResolver_getReferenceString_7377746635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;

    public ReferenceResolver_getReferenceString_7377746635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term417 = new HashMap();
        HashMap term427 = new HashMap();
        HashMap term437 = new HashMap();
        HashMap term447 = new HashMap();
        HashMap term457 = new HashMap();
        HashMap term466 = new HashMap();
        Set<Object> term486 =  ((Map) term466).keySet();
        HashSet term465 = new HashSet((Collection<? extends Object>) term486);
        term409 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolver"));
        Object term410 = newInstance(Class.forName("java.util.Stack"));
        Object[] term411 = (Object[]) newArray("java.lang.Object", 10);
        Object term412 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term413 = newInstance(Class.forName("java.util.Stack"));
        Object term422 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term423 = newInstance(Class.forName("java.util.Stack"));
        Object term432 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term433 = newInstance(Class.forName("java.util.Stack"));
        Object term442 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term443 = newInstance(Class.forName("java.util.Stack"));
        Object term452 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term453 = newInstance(Class.forName("java.util.Stack"));
        setField(term409, term409.getClass(), "file", null);
        setField(term413, term413.getClass(), "elementData", null);
        setIntField(term413, term413.getClass(), "elementCount", 3);
        setIntField(term413, term413.getClass(), "capacityIncrement", 0);
        setIntField(term413, term413.getClass(), "modCount", 3);
        setField(term412, term412.getClass(), "nodesToVisit", term413);
        setField(term412, term412.getClass(), "node", null);
        setField(term412, term412.getClass(), "indexes", term417);
        setElement(term411, 0, term412);
        setField(term423, term423.getClass(), "elementData", null);
        setIntField(term423, term423.getClass(), "elementCount", 5);
        setIntField(term423, term423.getClass(), "capacityIncrement", 0);
        setIntField(term423, term423.getClass(), "modCount", 5);
        setField(term422, term422.getClass(), "nodesToVisit", term423);
        setField(term422, term422.getClass(), "node", null);
        setField(term422, term422.getClass(), "indexes", term427);
        setElement(term411, 1, term422);
        setField(term433, term433.getClass(), "elementData", null);
        setIntField(term433, term433.getClass(), "elementCount", 5);
        setIntField(term433, term433.getClass(), "capacityIncrement", 0);
        setIntField(term433, term433.getClass(), "modCount", 5);
        setField(term432, term432.getClass(), "nodesToVisit", term433);
        setField(term432, term432.getClass(), "node", null);
        setField(term432, term432.getClass(), "indexes", term437);
        setElement(term411, 2, term432);
        setField(term443, term443.getClass(), "elementData", null);
        setIntField(term443, term443.getClass(), "elementCount", 1);
        setIntField(term443, term443.getClass(), "capacityIncrement", 0);
        setIntField(term443, term443.getClass(), "modCount", 1);
        setField(term442, term442.getClass(), "nodesToVisit", term443);
        setField(term442, term442.getClass(), "node", null);
        setField(term442, term442.getClass(), "indexes", term447);
        setElement(term411, 3, term442);
        setField(term453, term453.getClass(), "elementData", null);
        setIntField(term453, term453.getClass(), "elementCount", 0);
        setIntField(term453, term453.getClass(), "capacityIncrement", 0);
        setIntField(term453, term453.getClass(), "modCount", 0);
        setField(term452, term452.getClass(), "nodesToVisit", term453);
        setField(term452, term452.getClass(), "node", null);
        setField(term452, term452.getClass(), "indexes", term457);
        setElement(term411, 4, term452);
        setField(term410, term410.getClass(), "elementData", term411);
        setIntField(term410, term410.getClass(), "elementCount", 5);
        setIntField(term410, term410.getClass(), "capacityIncrement", 0);
        setIntField(term410, term410.getClass(), "modCount", 5);
        setField(term409, term409.getClass(), "stack", term410);
        setField(term409, term409.getClass(), "visitedNodes", term465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "OclPbYPkcH";
        callMethod(klass, "getReferenceString", argTypes, term409, args);
    }

};


