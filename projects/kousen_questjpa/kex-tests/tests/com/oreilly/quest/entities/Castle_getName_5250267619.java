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

public class Castle_getName_5250267619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8492;

    public Castle_getName_5250267619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8493 = new Long(-8085190702504231560L);
        HashMap term8534 = new HashMap();
        Set<Object> term8569 =  ((Map) term8534).keySet();
        HashSet term8533 = new HashSet((Collection<? extends Object>) term8569);
        term8492 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term8492, term8492.getClass(), "id", term8493);
        setField(term8492, term8492.getClass(), "name", "jwsfVjMoJT");
        setField(term8492, term8492.getClass(), "city", "ZfdXfCCFDf");
        setField(term8492, term8492.getClass(), "state", "MwwjNtdOFT");
        setDoubleField(term8492, term8492.getClass(), "latitude", 0.8823181080774973);
        setDoubleField(term8492, term8492.getClass(), "longitude", 0.2192450926212024);
        setField(term8492, term8492.getClass(), "knights", term8533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term8492, args);
    }

};


