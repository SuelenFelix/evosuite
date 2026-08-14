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
import java.util.LinkedHashMap;

public class ReferenceResolver_resolveReferencesOnFields_9450293084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169;
     Object term264;

    public ReferenceResolver_resolveReferencesOnFields_9450293084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term177 = new HashMap();
        HashMap term187 = new HashMap();
        HashMap term197 = new HashMap();
        HashMap term207 = new HashMap();
        HashMap term217 = new HashMap();
        HashMap term227 = new HashMap();
        HashMap term237 = new HashMap();
        HashMap term247 = new HashMap();
        HashMap term256 = new HashMap();
        Set<Object> term408 =  ((Map) term256).keySet();
        HashSet term255 = new HashSet((Collection<? extends Object>) term408);
        term169 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolver"));
        Object term170 = newInstance(Class.forName("java.util.Stack"));
        Object[] term171 = (Object[]) newArray("java.lang.Object", 10);
        Object term172 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term173 = newInstance(Class.forName("java.util.Stack"));
        Object term182 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term183 = newInstance(Class.forName("java.util.Stack"));
        Object term192 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term193 = newInstance(Class.forName("java.util.Stack"));
        Object term202 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term203 = newInstance(Class.forName("java.util.Stack"));
        Object term212 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term213 = newInstance(Class.forName("java.util.Stack"));
        Object term222 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term223 = newInstance(Class.forName("java.util.Stack"));
        Object term232 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term233 = newInstance(Class.forName("java.util.Stack"));
        Object term242 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term243 = newInstance(Class.forName("java.util.Stack"));
        setField(term169, term169.getClass(), "file", null);
        setField(term173, term173.getClass(), "elementData", null);
        setIntField(term173, term173.getClass(), "elementCount", 6);
        setIntField(term173, term173.getClass(), "capacityIncrement", 0);
        setIntField(term173, term173.getClass(), "modCount", 6);
        setField(term172, term172.getClass(), "nodesToVisit", term173);
        setField(term172, term172.getClass(), "node", null);
        setField(term172, term172.getClass(), "indexes", term177);
        setElement(term171, 0, term172);
        setField(term183, term183.getClass(), "elementData", null);
        setIntField(term183, term183.getClass(), "elementCount", 2);
        setIntField(term183, term183.getClass(), "capacityIncrement", 0);
        setIntField(term183, term183.getClass(), "modCount", 2);
        setField(term182, term182.getClass(), "nodesToVisit", term183);
        setField(term182, term182.getClass(), "node", null);
        setField(term182, term182.getClass(), "indexes", term187);
        setElement(term171, 1, term182);
        setField(term193, term193.getClass(), "elementData", null);
        setIntField(term193, term193.getClass(), "elementCount", 1);
        setIntField(term193, term193.getClass(), "capacityIncrement", 0);
        setIntField(term193, term193.getClass(), "modCount", 1);
        setField(term192, term192.getClass(), "nodesToVisit", term193);
        setField(term192, term192.getClass(), "node", null);
        setField(term192, term192.getClass(), "indexes", term197);
        setElement(term171, 2, term192);
        setField(term203, term203.getClass(), "elementData", null);
        setIntField(term203, term203.getClass(), "elementCount", 9);
        setIntField(term203, term203.getClass(), "capacityIncrement", 0);
        setIntField(term203, term203.getClass(), "modCount", 9);
        setField(term202, term202.getClass(), "nodesToVisit", term203);
        setField(term202, term202.getClass(), "node", null);
        setField(term202, term202.getClass(), "indexes", term207);
        setElement(term171, 3, term202);
        setField(term213, term213.getClass(), "elementData", null);
        setIntField(term213, term213.getClass(), "elementCount", 3);
        setIntField(term213, term213.getClass(), "capacityIncrement", 0);
        setIntField(term213, term213.getClass(), "modCount", 3);
        setField(term212, term212.getClass(), "nodesToVisit", term213);
        setField(term212, term212.getClass(), "node", null);
        setField(term212, term212.getClass(), "indexes", term217);
        setElement(term171, 4, term212);
        setField(term223, term223.getClass(), "elementData", null);
        setIntField(term223, term223.getClass(), "elementCount", 5);
        setIntField(term223, term223.getClass(), "capacityIncrement", 0);
        setIntField(term223, term223.getClass(), "modCount", 5);
        setField(term222, term222.getClass(), "nodesToVisit", term223);
        setField(term222, term222.getClass(), "node", null);
        setField(term222, term222.getClass(), "indexes", term227);
        setElement(term171, 5, term222);
        setField(term233, term233.getClass(), "elementData", null);
        setIntField(term233, term233.getClass(), "elementCount", 6);
        setIntField(term233, term233.getClass(), "capacityIncrement", 0);
        setIntField(term233, term233.getClass(), "modCount", 6);
        setField(term232, term232.getClass(), "nodesToVisit", term233);
        setField(term232, term232.getClass(), "node", null);
        setField(term232, term232.getClass(), "indexes", term237);
        setElement(term171, 6, term232);
        setField(term243, term243.getClass(), "elementData", null);
        setIntField(term243, term243.getClass(), "elementCount", 5);
        setIntField(term243, term243.getClass(), "capacityIncrement", 0);
        setIntField(term243, term243.getClass(), "modCount", 5);
        setField(term242, term242.getClass(), "nodesToVisit", term243);
        setField(term242, term242.getClass(), "node", null);
        setField(term242, term242.getClass(), "indexes", term247);
        setElement(term171, 7, term242);
        setField(term170, term170.getClass(), "elementData", term171);
        setIntField(term170, term170.getClass(), "elementCount", 8);
        setIntField(term170, term170.getClass(), "capacityIncrement", 0);
        setIntField(term170, term170.getClass(), "modCount", 8);
        setField(term169, term169.getClass(), "stack", term170);
        setField(term169, term169.getClass(), "visitedNodes", term255);
        term264 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term264;
        args[2] = null;
        callMethod(klass, "resolveReferencesOnFields", argTypes, term169, args);
    }

};


