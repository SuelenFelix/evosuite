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

public class ReferenceResolverStackEntry_getNode_5350673593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586;

    public ReferenceResolverStackEntry_getNode_5350673593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term592 = new HashMap();
        term586 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term587 = newInstance(Class.forName("java.util.Stack"));
        Object[] term588 = (Object[]) newArray("java.lang.Object", 10);
        setField(term587, term587.getClass(), "elementData", term588);
        setIntField(term587, term587.getClass(), "elementCount", 1);
        setIntField(term587, term587.getClass(), "capacityIncrement", 0);
        setIntField(term587, term587.getClass(), "modCount", 1);
        setField(term586, term586.getClass(), "nodesToVisit", term587);
        setField(term586, term586.getClass(), "node", null);
        setField(term586, term586.getClass(), "indexes", term592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNode", argTypes, term586, args);
    }

};


