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
import java.lang.String;

public class ReferenceResolverStackEntry_fieldIsCollection_12597891118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647;
     Object term658;

    public ReferenceResolverStackEntry_fieldIsCollection_12597891118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term653 = new HashMap();
        term647 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term648 = newInstance(Class.forName("java.util.Stack"));
        Object[] term649 = (Object[]) newArray("java.lang.Object", 10);
        setField(term648, term648.getClass(), "elementData", term649);
        setIntField(term648, term648.getClass(), "elementCount", 2);
        setIntField(term648, term648.getClass(), "capacityIncrement", 0);
        setIntField(term648, term648.getClass(), "modCount", 2);
        setField(term647, term647.getClass(), "nodesToVisit", term648);
        setField(term647, term647.getClass(), "node", null);
        setField(term647, term647.getClass(), "indexes", term653);
        Class<? extends Object> term795 = Class.forName((String) "java.util.stream.DoublePipeline$1");
        term658 = ((Class) term795).getDeclaredField((String) "val$mapper");
        ((Field) term658).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        Object[] args = new Object[1];
        args[0] = term658;
        callMethod(klass, "fieldIsCollection", argTypes, term647, args);
    }

};


