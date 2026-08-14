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

public class ReferenceResolverStackEntry_setNodesToVisit_20426368722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570;
     Object term581;

    public ReferenceResolverStackEntry_setNodesToVisit_20426368722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term576 = new HashMap();
        term570 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term571 = newInstance(Class.forName("java.util.Stack"));
        Object[] term572 = (Object[]) newArray("java.lang.Object", 10);
        setField(term571, term571.getClass(), "elementData", term572);
        setIntField(term571, term571.getClass(), "elementCount", 8);
        setIntField(term571, term571.getClass(), "capacityIncrement", 0);
        setIntField(term571, term571.getClass(), "modCount", 8);
        setField(term570, term570.getClass(), "nodesToVisit", term571);
        setField(term570, term570.getClass(), "node", null);
        setField(term570, term570.getClass(), "indexes", term576);
        term581 = newInstance(Class.forName("java.util.Stack"));
        Object[] term582 = (Object[]) newArray("java.lang.Object", 10);
        setField(term581, term581.getClass(), "elementData", term582);
        setIntField(term581, term581.getClass(), "elementCount", 0);
        setIntField(term581, term581.getClass(), "capacityIncrement", 0);
        setIntField(term581, term581.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Stack");
        Object[] args = new Object[1];
        args[0] = term581;
        callMethod(klass, "setNodesToVisit", argTypes, term570, args);
    }

};


