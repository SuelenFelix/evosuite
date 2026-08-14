package com.digitalpetri.fsm;

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
import static com.digitalpetri.fsm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.lang.Object;

public class StrictMachine_init_18934952690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2002;
     Object term2067;
     Object term2068;
     Object term2069;
     Object term2072;

    public StrictMachine_init_18934952690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2002 = new LinkedHashMap();
        term2067 = newInstance(Class.forName("java.lang.Object"));
        term2068 = newInstance(Class.forName("java.lang.Object"));
        term2069 = new LinkedList();
        term2072 = new LinkedList();
        ((LinkedList) term2072).add((Object)null);
        ((LinkedList) term2072).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("java.util.concurrent.Executor");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("com.digitalpetri.fsm.dsl.ActionProxy");
        argTypes[5] = Class.forName("java.lang.Object");
        argTypes[6] = Class.forName("java.util.List");
        argTypes[7] = Class.forName("java.util.List");
        Object[] args = new Object[8];
        args[0] = "OWDIEULEFu";
        args[1] = term2002;
        args[2] = null;
        args[3] = term2067;
        args[4] = null;
        args[5] = term2068;
        args[6] = term2069;
        args[7] = term2072;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


