package de.gofabian.jfixture;

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
import static de.gofabian.jfixture.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Boolean;

public class FixtureMethodParser_1_init_8476598770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1910;
     Object enum6;
     Object term1928;
     Object term1941;
     Object term1955;
     Object term1957;
     Object term1958;
     Object term2212;

    public FixtureMethodParser_1_init_8476598770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1911 = new HashMap();
        term1910 = newInstance(Class.forName("de.gofabian.jfixture.FixtureMethodParser"));
        setField(term1910, term1910.getClass(), "cache", term1911);
        Class<? extends Object> term2214 = Class.forName((String) "de.gofabian.jfixture.Scope");
        Field term2213 = ((Class) term2214).getDeclaredField((String) "SESSION");
        ((Field) term2213).setAccessible(true);
        enum6 = ((Field) term2213).get((Object) null);
        term1928 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term1928, term1928.getClass(), "type", null);
        setField(term1928, term1928.getClass(), "name", "hNxWaHcfhY");
        Object term1944 = newInstance(Class.forName("java.lang.Object"));
        Object term1946 = newInstance(Class.forName("java.lang.Object"));
        Object term1948 = newInstance(Class.forName("java.lang.Object"));
        term1941 = new LinkedList();
        ((LinkedList) term1941).add(term1944);
        ((LinkedList) term1941).add(term1946);
        ((LinkedList) term1941).add(term1948);
        ((LinkedList) term1941).add((Object)null);
        ((LinkedList) term1941).add((Object)null);
        ((LinkedList) term1941).add((Object)null);
        term1955 = new Boolean(false);
        term1957 = (Object[]) newArray("java.lang.Class", 8);
        Class<? extends Object> term2415 = Class.forName((String) "java.util.concurrent.Executors$2");
        Object[] term2564 = (Object[]) newArray("java.lang.Class", 0);
        term1958 = ((Class) term2415).getDeclaredMethod((String) "call", (Class[]) term2564);
        ((Method) term1958).setAccessible(true);
        term2212 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureMethodParser$1");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("de.gofabian.jfixture.FixtureMethodParser");
        argTypes[1] = Class.forName("de.gofabian.jfixture.Scope");
        argTypes[2] = Class.forName("de.gofabian.jfixture.api.FixtureId");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = boolean.class;
        argTypes[5] = Array.newInstance(Class.forName("java.lang.Class"), 0).getClass();
        argTypes[6] = Class.forName("java.lang.reflect.Method");
        argTypes[7] = Class.forName("java.lang.Object");
        Object[] args = new Object[8];
        args[0] = term1910;
        args[1] = enum6;
        args[2] = term1928;
        args[3] = term1941;
        args[4] = term1955;
        args[5] = term1957;
        args[6] = term1958;
        args[7] = term2212;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


