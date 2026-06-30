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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Knight_toString_52062107513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4254;

    public Knight_toString_52062107513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4255 = new Long(-6823727938421990489L);
        Class<? extends Object> term4352 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term4351 = ((Class) term4352).getDeclaredField((String) "SIR");
        ((Field) term4351).setAccessible(true);
        Object enum14 = ((Field) term4351).get((Object) null);
        Long term4277 = new Long(-484994522244390100L);
        HashMap term4293 = new HashMap();
        Set<Object> term4547 =  ((Map) term4293).keySet();
        HashSet term4292 = new HashSet((Collection<? extends Object>) term4547);
        HashMap term4299 = new HashMap();
        Set<Object> term4548 =  ((Map) term4299).keySet();
        HashSet term4298 = new HashSet((Collection<? extends Object>) term4548);
        Long term4305 = new Long(1233889271256172047L);
        HashMap term4346 = new HashMap();
        Set<Object> term4579 =  ((Map) term4346).keySet();
        HashSet term4345 = new HashSet((Collection<? extends Object>) term4579);
        term4254 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term4276 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term4304 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term4254, term4254.getClass(), "id", term4255);
        setField(term4254, term4254.getClass(), "title", enum14);
        setField(term4254, term4254.getClass(), "name", "ffYhPOzlUs");
        setField(term4276, term4276.getClass(), "id", term4277);
        setField(term4276, term4276.getClass(), "name", "MLqYREekMl");
        setLongField(term4276, term4276.getClass(), "version", -4325723315152823407L);
        setField(term4276, term4276.getClass(), "tasks", term4292);
        setField(term4276, term4276.getClass(), "knights", term4298);
        setField(term4254, term4254.getClass(), "quest", term4276);
        setField(term4304, term4304.getClass(), "id", term4305);
        setField(term4304, term4304.getClass(), "name", "ytSBIKXogI");
        setField(term4304, term4304.getClass(), "city", "nHXjMycHlU");
        setField(term4304, term4304.getClass(), "state", "ieCtQFdkii");
        setDoubleField(term4304, term4304.getClass(), "latitude", 0.4569171842750229);
        setDoubleField(term4304, term4304.getClass(), "longitude", 0.8598297828918529);
        setField(term4304, term4304.getClass(), "knights", term4345);
        setField(term4254, term4254.getClass(), "castle", term4304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4254, args);
    }

};


