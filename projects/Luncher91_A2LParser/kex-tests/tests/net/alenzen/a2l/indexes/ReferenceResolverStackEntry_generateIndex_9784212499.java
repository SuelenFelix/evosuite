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

public class ReferenceResolverStackEntry_generateIndex_9784212499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term962;
     Object term973;

    public ReferenceResolverStackEntry_generateIndex_9784212499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term968 = new HashMap();
        term962 = newInstance(Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry"));
        Object term963 = newInstance(Class.forName("java.util.Stack"));
        Object[] term964 = (Object[]) newArray("java.lang.Object", 10);
        setField(term963, term963.getClass(), "elementData", term964);
        setIntField(term963, term963.getClass(), "elementCount", 7);
        setIntField(term963, term963.getClass(), "capacityIncrement", 0);
        setIntField(term963, term963.getClass(), "modCount", 7);
        setField(term962, term962.getClass(), "nodesToVisit", term963);
        setField(term962, term962.getClass(), "node", null);
        setField(term962, term962.getClass(), "indexes", term968);
        Class<? extends Object> term1125 = Class.forName((String) "java.util.TimerTask");
        term973 = ((Class) term1125).getDeclaredField((String) "period");
        ((Field) term973).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.indexes.ReferenceResolverStackEntry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.reflect.Field");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term973;
        args[1] = "BndsHwAFMv";
        callMethod(klass, "generateIndex", argTypes, term962, args);
    }

};


