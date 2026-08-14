package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class IntHashMap_Entry_init_17632559970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7448;
     Object term7450;
     Object term7452;
     Object term7454;

    public IntHashMap_Entry_init_17632559970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7448 = new Integer(-1062022366);
        term7450 = new Integer(-1347618079);
        term7452 = new Integer(1510246255);
        term7454 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        Object term7458 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        Object term7462 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        Object term7466 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        Object term7470 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        setIntField(term7454, term7454.getClass(), "hash", -515631808);
        setIntField(term7454, term7454.getClass(), "key", 1546701347);
        setIntField(term7454, term7454.getClass(), "value", -111931851);
        setIntField(term7458, term7458.getClass(), "hash", -251696516);
        setIntField(term7458, term7458.getClass(), "key", 1075321384);
        setIntField(term7458, term7458.getClass(), "value", -1726073541);
        setIntField(term7462, term7462.getClass(), "hash", 406945977);
        setIntField(term7462, term7462.getClass(), "key", 493657684);
        setIntField(term7462, term7462.getClass(), "value", 1882655922);
        setIntField(term7466, term7466.getClass(), "hash", 1314996390);
        setIntField(term7466, term7466.getClass(), "key", 1367703658);
        setIntField(term7466, term7466.getClass(), "value", 1120153100);
        setIntField(term7470, term7470.getClass(), "hash", 158801111);
        setIntField(term7470, term7470.getClass(), "key", 464966803);
        setIntField(term7470, term7470.getClass(), "value", -246618392);
        setField(term7470, term7470.getClass(), "next", null);
        setField(term7466, term7466.getClass(), "next", term7470);
        setField(term7462, term7462.getClass(), "next", term7466);
        setField(term7458, term7458.getClass(), "next", term7462);
        setField(term7454, term7454.getClass(), "next", term7458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap$Entry");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.graph4j.util.IntHashMap$Entry");
        Object[] args = new Object[4];
        args[0] = term7448;
        args[1] = term7450;
        args[2] = term7452;
        args[3] = term7454;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


