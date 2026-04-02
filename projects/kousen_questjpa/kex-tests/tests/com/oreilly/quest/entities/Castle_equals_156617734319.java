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

public class Castle_equals_156617734319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9342;
     Object term9389;

    public Castle_equals_156617734319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9343 = new Long(7276637106827860087L);
        HashMap term9384 = new HashMap();
        Set<Object> term9420 =  ((Map) term9384).keySet();
        HashSet term9383 = new HashSet((Collection<? extends Object>) term9420);
        term9342 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9342, term9342.getClass(), "id", term9343);
        setField(term9342, term9342.getClass(), "name", "ekxGuOYIwi");
        setField(term9342, term9342.getClass(), "city", "RbVQXSpxXy");
        setField(term9342, term9342.getClass(), "state", "YpJbIgJWWv");
        setDoubleField(term9342, term9342.getClass(), "latitude", 0.016575281023182953);
        setDoubleField(term9342, term9342.getClass(), "longitude", 0.5308350402051779);
        setField(term9342, term9342.getClass(), "knights", term9383);
        term9389 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9389;
        callMethod(klass, "equals", argTypes, term9342, args);
    }

};


