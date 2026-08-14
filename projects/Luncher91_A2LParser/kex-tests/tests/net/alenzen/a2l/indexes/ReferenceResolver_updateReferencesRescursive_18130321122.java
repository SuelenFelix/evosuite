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

public class ReferenceResolver_updateReferencesRescursive_18130321122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;

    public ReferenceResolver_updateReferencesRescursive_18130321122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term75 = new HashMap();
        HashMap term85 = new HashMap();
        HashMap term95 = new HashMap();
        HashMap term105 = new HashMap();
        HashMap term115 = new HashMap();
        HashMap term125 = new HashMap();
        HashMap term134 = new HashMap();
        Set<Object> term142 =  ((Map) term134).keySet();
        HashSet term133 = new HashSet((Collection<? extends Object>) term142);
        term67 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolver"));
        Object term68 = newInstance(Class.forName("java.util.Stack"));
        Object[] term69 = (Object[]) newArray("java.lang.Object", 10);
        Object term70 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term71 = newInstance(Class.forName("java.util.Stack"));
        Object term80 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term81 = newInstance(Class.forName("java.util.Stack"));
        Object term90 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term91 = newInstance(Class.forName("java.util.Stack"));
        Object term100 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term101 = newInstance(Class.forName("java.util.Stack"));
        Object term110 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term111 = newInstance(Class.forName("java.util.Stack"));
        Object term120 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term121 = newInstance(Class.forName("java.util.Stack"));
        setField(term67, term67.getClass(), "file", null);
        setField(term71, term71.getClass(), "elementData", null);
        setIntField(term71, term71.getClass(), "elementCount", 7);
        setIntField(term71, term71.getClass(), "capacityIncrement", 0);
        setIntField(term71, term71.getClass(), "modCount", 7);
        setField(term70, term70.getClass(), "nodesToVisit", term71);
        setField(term70, term70.getClass(), "node", null);
        setField(term70, term70.getClass(), "indexes", term75);
        setElement(term69, 0, term70);
        setField(term81, term81.getClass(), "elementData", null);
        setIntField(term81, term81.getClass(), "elementCount", 1);
        setIntField(term81, term81.getClass(), "capacityIncrement", 0);
        setIntField(term81, term81.getClass(), "modCount", 1);
        setField(term80, term80.getClass(), "nodesToVisit", term81);
        setField(term80, term80.getClass(), "node", null);
        setField(term80, term80.getClass(), "indexes", term85);
        setElement(term69, 1, term80);
        setField(term91, term91.getClass(), "elementData", null);
        setIntField(term91, term91.getClass(), "elementCount", 6);
        setIntField(term91, term91.getClass(), "capacityIncrement", 0);
        setIntField(term91, term91.getClass(), "modCount", 6);
        setField(term90, term90.getClass(), "nodesToVisit", term91);
        setField(term90, term90.getClass(), "node", null);
        setField(term90, term90.getClass(), "indexes", term95);
        setElement(term69, 2, term90);
        setField(term101, term101.getClass(), "elementData", null);
        setIntField(term101, term101.getClass(), "elementCount", 5);
        setIntField(term101, term101.getClass(), "capacityIncrement", 0);
        setIntField(term101, term101.getClass(), "modCount", 5);
        setField(term100, term100.getClass(), "nodesToVisit", term101);
        setField(term100, term100.getClass(), "node", null);
        setField(term100, term100.getClass(), "indexes", term105);
        setElement(term69, 3, term100);
        setField(term111, term111.getClass(), "elementData", null);
        setIntField(term111, term111.getClass(), "elementCount", 5);
        setIntField(term111, term111.getClass(), "capacityIncrement", 0);
        setIntField(term111, term111.getClass(), "modCount", 5);
        setField(term110, term110.getClass(), "nodesToVisit", term111);
        setField(term110, term110.getClass(), "node", null);
        setField(term110, term110.getClass(), "indexes", term115);
        setElement(term69, 4, term110);
        setField(term121, term121.getClass(), "elementData", null);
        setIntField(term121, term121.getClass(), "elementCount", 2);
        setIntField(term121, term121.getClass(), "capacityIncrement", 0);
        setIntField(term121, term121.getClass(), "modCount", 2);
        setField(term120, term120.getClass(), "nodesToVisit", term121);
        setField(term120, term120.getClass(), "node", null);
        setField(term120, term120.getClass(), "indexes", term125);
        setElement(term69, 5, term120);
        setField(term68, term68.getClass(), "elementData", term69);
        setIntField(term68, term68.getClass(), "elementCount", 6);
        setIntField(term68, term68.getClass(), "capacityIncrement", 0);
        setIntField(term68, term68.getClass(), "modCount", 6);
        setField(term67, term67.getClass(), "stack", term68);
        setField(term67, term67.getClass(), "visitedNodes", term133);
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
        callMethod(klass, "updateReferencesRescursive", argTypes, term67, args);
    }

};


