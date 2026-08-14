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

public class ReferenceResolver_resolveReferencesOnCurrentLevel_327851303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;

    public ReferenceResolver_resolveReferencesOnCurrentLevel_327851303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term151 = new HashMap();
        HashMap term160 = new HashMap();
        Set<Object> term168 =  ((Map) term160).keySet();
        HashSet term159 = new HashSet((Collection<? extends Object>) term168);
        term143 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolver"));
        Object term144 = newInstance(Class.forName("java.util.Stack"));
        Object[] term145 = (Object[]) newArray("java.lang.Object", 10);
        Object term146 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term147 = newInstance(Class.forName("java.util.Stack"));
        setField(term143, term143.getClass(), "file", null);
        setField(term147, term147.getClass(), "elementData", null);
        setIntField(term147, term147.getClass(), "elementCount", 0);
        setIntField(term147, term147.getClass(), "capacityIncrement", 0);
        setIntField(term147, term147.getClass(), "modCount", 0);
        setField(term146, term146.getClass(), "nodesToVisit", term147);
        setField(term146, term146.getClass(), "node", null);
        setField(term146, term146.getClass(), "indexes", term151);
        setElement(term145, 0, term146);
        setField(term144, term144.getClass(), "elementData", term145);
        setIntField(term144, term144.getClass(), "elementCount", 1);
        setIntField(term144, term144.getClass(), "capacityIncrement", 0);
        setIntField(term144, term144.getClass(), "modCount", 1);
        setField(term143, term143.getClass(), "stack", term144);
        setField(term143, term143.getClass(), "visitedNodes", term159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "resolveReferencesOnCurrentLevel", argTypes, term143, args);
    }

};


