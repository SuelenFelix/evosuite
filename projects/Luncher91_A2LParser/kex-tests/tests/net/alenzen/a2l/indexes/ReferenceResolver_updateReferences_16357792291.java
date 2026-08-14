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

public class ReferenceResolver_updateReferences_16357792291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ReferenceResolver_updateReferences_16357792291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9 = new HashMap();
        HashMap term19 = new HashMap();
        HashMap term29 = new HashMap();
        HashMap term39 = new HashMap();
        HashMap term49 = new HashMap();
        HashMap term58 = new HashMap();
        Set<Object> term66 =  ((Map) term58).keySet();
        HashSet term57 = new HashSet((Collection<? extends Object>) term66);
        term1 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolver"));
        Object term2 = newInstance(Class.forName("java.util.Stack"));
        Object[] term3 = (Object[]) newArray("java.lang.Object", 10);
        Object term4 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term5 = newInstance(Class.forName("java.util.Stack"));
        Object term14 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term15 = newInstance(Class.forName("java.util.Stack"));
        Object term24 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term25 = newInstance(Class.forName("java.util.Stack"));
        Object term34 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term35 = newInstance(Class.forName("java.util.Stack"));
        Object term44 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term45 = newInstance(Class.forName("java.util.Stack"));
        setField(term1, term1.getClass(), "file", null);
        setField(term5, term5.getClass(), "elementData", null);
        setIntField(term5, term5.getClass(), "elementCount", 4);
        setIntField(term5, term5.getClass(), "capacityIncrement", 0);
        setIntField(term5, term5.getClass(), "modCount", 4);
        setField(term4, term4.getClass(), "nodesToVisit", term5);
        setField(term4, term4.getClass(), "node", null);
        setField(term4, term4.getClass(), "indexes", term9);
        setElement(term3, 0, term4);
        setField(term15, term15.getClass(), "elementData", null);
        setIntField(term15, term15.getClass(), "elementCount", 3);
        setIntField(term15, term15.getClass(), "capacityIncrement", 0);
        setIntField(term15, term15.getClass(), "modCount", 3);
        setField(term14, term14.getClass(), "nodesToVisit", term15);
        setField(term14, term14.getClass(), "node", null);
        setField(term14, term14.getClass(), "indexes", term19);
        setElement(term3, 1, term14);
        setField(term25, term25.getClass(), "elementData", null);
        setIntField(term25, term25.getClass(), "elementCount", 4);
        setIntField(term25, term25.getClass(), "capacityIncrement", 0);
        setIntField(term25, term25.getClass(), "modCount", 4);
        setField(term24, term24.getClass(), "nodesToVisit", term25);
        setField(term24, term24.getClass(), "node", null);
        setField(term24, term24.getClass(), "indexes", term29);
        setElement(term3, 2, term24);
        setField(term35, term35.getClass(), "elementData", null);
        setIntField(term35, term35.getClass(), "elementCount", 1);
        setIntField(term35, term35.getClass(), "capacityIncrement", 0);
        setIntField(term35, term35.getClass(), "modCount", 1);
        setField(term34, term34.getClass(), "nodesToVisit", term35);
        setField(term34, term34.getClass(), "node", null);
        setField(term34, term34.getClass(), "indexes", term39);
        setElement(term3, 3, term34);
        setField(term45, term45.getClass(), "elementData", null);
        setIntField(term45, term45.getClass(), "elementCount", 6);
        setIntField(term45, term45.getClass(), "capacityIncrement", 0);
        setIntField(term45, term45.getClass(), "modCount", 6);
        setField(term44, term44.getClass(), "nodesToVisit", term45);
        setField(term44, term44.getClass(), "node", null);
        setField(term44, term44.getClass(), "indexes", term49);
        setElement(term3, 4, term44);
        setField(term2, term2.getClass(), "elementData", term3);
        setIntField(term2, term2.getClass(), "elementCount", 5);
        setIntField(term2, term2.getClass(), "capacityIncrement", 0);
        setIntField(term2, term2.getClass(), "modCount", 5);
        setField(term1, term1.getClass(), "stack", term2);
        setField(term1, term1.getClass(), "visitedNodes", term57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Consumer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updateReferences", argTypes, term1, args);
    }

};


