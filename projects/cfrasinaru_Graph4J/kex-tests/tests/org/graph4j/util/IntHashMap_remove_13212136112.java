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
import java.lang.Object;
import java.lang.Integer;

public class IntHashMap_remove_13212136112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154602;
     Object term154607;

    public IntHashMap_remove_13212136112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154602 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term154603 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setField(term154602, term154602.getClass(), "table", term154603);
        setIntField(term154602, term154602.getClass(), "count", -385927012);
        setIntField(term154602, term154602.getClass(), "threshold", 15);
        setFloatField(term154602, term154602.getClass(), "loadFactor", 0.75F);
        term154607 = new Integer(-900872519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term154607;
        callMethod(klass, "remove", argTypes, term154602, args);
    }

};


