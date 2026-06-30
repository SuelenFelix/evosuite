package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Castle_getKnights_20680391073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7344;

    public Castle_getKnights_20680391073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7345 = new Long(6005241913654469005L);
        HashMap term7386 = new HashMap();
        Set<Object> term7421 =  ((Map) term7386).keySet();
        HashSet term7385 = new HashSet((Collection<? extends Object>) term7421);
        term7344 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term7344, term7344.getClass(), "id", term7345);
        setField(term7344, term7344.getClass(), "name", "XylxrMBraH");
        setField(term7344, term7344.getClass(), "city", "pORebkoRdD");
        setField(term7344, term7344.getClass(), "state", "mXGCWJDOqA");
        setDoubleField(term7344, term7344.getClass(), "latitude", 0.10667076642995188);
        setDoubleField(term7344, term7344.getClass(), "longitude", 0.11493000848982304);
        setField(term7344, term7344.getClass(), "knights", term7385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKnights", argTypes, term7344, args);
    }

};


