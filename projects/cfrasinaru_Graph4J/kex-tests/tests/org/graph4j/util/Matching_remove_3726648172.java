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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class Matching_remove_3726648172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4347;
     Object term4368;
     Object term4370;

    public Matching_remove_3726648172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4352 = new HashMap();
        Set<Object> term4373 =  ((Map) term4352).keySet();
        HashSet term4351 = new HashSet((Collection<? extends Object>) term4373);
        term4347 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4348 = (int[]) newIntArray(1);
        setField(term4347, term4347.getClass(), "graph", null);
        setIntElement(term4348, 0, 1854694585);
        setField(term4347, term4347.getClass(), "mates", term4348);
        setIntField(term4347, term4347.getClass(), "size", -1260562836);
        setField(term4347, term4347.getClass(), "edges", term4351);
        term4368 = new Integer(-91068927);
        term4370 = new Integer(680714112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4368;
        args[1] = term4370;
        callMethod(klass, "remove", argTypes, term4347, args);
    }

};


