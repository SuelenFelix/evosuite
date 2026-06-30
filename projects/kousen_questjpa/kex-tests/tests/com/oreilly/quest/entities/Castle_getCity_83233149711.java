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

public class Castle_getCity_83233149711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8670;

    public Castle_getCity_83233149711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8671 = new Long(4949335493504695457L);
        HashMap term8712 = new HashMap();
        Set<Object> term8747 =  ((Map) term8712).keySet();
        HashSet term8711 = new HashSet((Collection<? extends Object>) term8747);
        term8670 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term8670, term8670.getClass(), "id", term8671);
        setField(term8670, term8670.getClass(), "name", "PtirvZmsGt");
        setField(term8670, term8670.getClass(), "city", "HWkpTmtlrc");
        setField(term8670, term8670.getClass(), "state", "hMmaoREuCK");
        setDoubleField(term8670, term8670.getClass(), "latitude", 0.6862221294683138);
        setDoubleField(term8670, term8670.getClass(), "longitude", 0.15917839663695388);
        setField(term8670, term8670.getClass(), "knights", term8711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term8670, args);
    }

};


