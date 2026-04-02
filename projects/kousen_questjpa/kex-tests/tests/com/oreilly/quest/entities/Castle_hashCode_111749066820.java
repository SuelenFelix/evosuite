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

public class Castle_hashCode_111749066820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9421;

    public Castle_hashCode_111749066820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9422 = new Long(-3936701866695933852L);
        HashMap term9463 = new HashMap();
        Set<Object> term9498 =  ((Map) term9463).keySet();
        HashSet term9462 = new HashSet((Collection<? extends Object>) term9498);
        term9421 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9421, term9421.getClass(), "id", term9422);
        setField(term9421, term9421.getClass(), "name", "JppkknKVOw");
        setField(term9421, term9421.getClass(), "city", "iljANwuEjk");
        setField(term9421, term9421.getClass(), "state", "kNqaJKIATy");
        setDoubleField(term9421, term9421.getClass(), "latitude", 0.7154795600170818);
        setDoubleField(term9421, term9421.getClass(), "longitude", 0.6355029654528058);
        setField(term9421, term9421.getClass(), "knights", term9462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term9421, args);
    }

};


