package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Boolean;

public class TarjanStrongConnectivity_Visitor_init_1137754190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term928;
     Object term942;

    public TarjanStrongConnectivity_Visitor_init_1137754190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term929 = new ArrayList();
        Boolean term940 = new Boolean(false);
        term928 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity"));
        int[] term933 = (int[]) newIntArray(6);
        setField(term928, term928.getClass(), "compSets", term929);
        setIntElement(term933, 0, 147209682);
        setIntElement(term933, 1, 34470066);
        setIntElement(term933, 2, 2058711405);
        setIntElement(term933, 3, 1743683601);
        setIntElement(term933, 4, -945116798);
        setIntElement(term933, 5, 1593461795);
        setField(term928, term928.getClass(), "vertexComp", term933);
        setField(term928, term928.getClass(), "graph", null);
        setField(term928, term928.getClass(), "stronglyConnected", term940);
        term942 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term928;
        args[1] = term942;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


