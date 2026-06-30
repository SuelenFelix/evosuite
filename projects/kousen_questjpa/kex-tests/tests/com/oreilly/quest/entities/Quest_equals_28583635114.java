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

public class Quest_equals_28583635114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11047;
     Object term11075;

    public Quest_equals_28583635114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11048 = new Long(855932984568615096L);
        HashMap term11064 = new HashMap();
        Set<Object> term11086 =  ((Map) term11064).keySet();
        HashSet term11063 = new HashSet((Collection<? extends Object>) term11086);
        HashMap term11070 = new HashMap();
        Set<Object> term11087 =  ((Map) term11070).keySet();
        HashSet term11069 = new HashSet((Collection<? extends Object>) term11087);
        term11047 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term11047, term11047.getClass(), "id", term11048);
        setField(term11047, term11047.getClass(), "name", "WXMWFDGcLB");
        setLongField(term11047, term11047.getClass(), "version", -2644215923136513282L);
        setField(term11047, term11047.getClass(), "tasks", term11063);
        setField(term11047, term11047.getClass(), "knights", term11069);
        term11075 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11075;
        callMethod(klass, "equals", argTypes, term11047, args);
    }

};


