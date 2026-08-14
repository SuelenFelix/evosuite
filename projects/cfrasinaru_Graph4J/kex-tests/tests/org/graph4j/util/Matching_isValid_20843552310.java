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

public class Matching_isValid_20843552310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4580;

    public Matching_isValid_20843552310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4589 = new HashMap();
        Set<Object> term4612 =  ((Map) term4589).keySet();
        HashSet term4588 = new HashSet((Collection<? extends Object>) term4612);
        term4580 = newInstance(Class.forName("org.graph4j.util.Matching"));
        int[] term4581 = (int[]) newIntArray(5);
        setField(term4580, term4580.getClass(), "graph", null);
        setIntElement(term4581, 0, 751596480);
        setIntElement(term4581, 1, 1971485144);
        setIntElement(term4581, 2, 2059603512);
        setIntElement(term4581, 3, -1308902065);
        setIntElement(term4581, 4, 605255795);
        setField(term4580, term4580.getClass(), "mates", term4581);
        setIntField(term4580, term4580.getClass(), "size", 1743438307);
        setField(term4580, term4580.getClass(), "edges", term4588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Matching");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term4580, args);
    }

};


