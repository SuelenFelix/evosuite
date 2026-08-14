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

public class ReferenceResolverStackEntry_setNode_15948036514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597;

    public ReferenceResolverStackEntry_setNode_15948036514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term603 = new HashMap();
        term597 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term598 = newInstance(Class.forName("java.util.Stack"));
        Object[] term599 = (Object[]) newArray("java.lang.Object", 10);
        setField(term598, term598.getClass(), "elementData", term599);
        setIntField(term598, term598.getClass(), "elementCount", 6);
        setIntField(term598, term598.getClass(), "capacityIncrement", 0);
        setIntField(term598, term598.getClass(), "modCount", 6);
        setField(term597, term597.getClass(), "nodesToVisit", term598);
        setField(term597, term597.getClass(), "node", null);
        setField(term597, term597.getClass(), "indexes", term603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.alenzen.a2l.IAsap2TreeElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNode", argTypes, term597, args);
    }

};


