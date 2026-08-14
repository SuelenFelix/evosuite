package org.codefx.demo.effective_java._50_defensive_copies;

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
import static org.codefx.demo.effective_java._50_defensive_copies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class Megacorp_init_9272121150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;

    public Megacorp_init_9272121150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term173 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term173, term173.getClass(), "name", "MjGYSRKTNF");
        setIntField(term173, term173.getClass(), "revenue", -1955890973);
        Object term188 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term188, term188.getClass(), "name", "");
        setIntField(term188, term188.getClass(), "revenue", -2038273078);
        Object term192 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term192, term192.getClass(), "name", null);
        setIntField(term192, term192.getClass(), "revenue", 1227103734);
        term170 = new LinkedList();
        ((LinkedList) term170).add(term173);
        ((LinkedList) term170).add(term188);
        ((LinkedList) term170).add(term192);
        ((LinkedList) term170).add((Object)null);
        ((LinkedList) term170).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "SzjVpOQTyS";
        args[1] = term170;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


