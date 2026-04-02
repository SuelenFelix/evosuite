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

public class Knight_getName_16523788147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2199;

    public Knight_getName_16523788147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2200 = new Long(-5476826692763582090L);
        Class<? extends Object> term2299 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term2298 = ((Class) term2299).getDeclaredField((String) "QUEEN");
        ((Field) term2298).setAccessible(true);
        Object enum8 = ((Field) term2298).get((Object) null);
        Long term2224 = new Long(-872011222785455006L);
        HashMap term2240 = new HashMap();
        Set<Object> term2500 =  ((Map) term2240).keySet();
        HashSet term2239 = new HashSet((Collection<? extends Object>) term2500);
        HashMap term2246 = new HashMap();
        Set<Object> term2501 =  ((Map) term2246).keySet();
        HashSet term2245 = new HashSet((Collection<? extends Object>) term2501);
        Long term2252 = new Long(-316468845751588286L);
        HashMap term2293 = new HashMap();
        Set<Object> term2532 =  ((Map) term2293).keySet();
        HashSet term2292 = new HashSet((Collection<? extends Object>) term2532);
        term2199 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term2223 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term2251 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term2199, term2199.getClass(), "id", term2200);
        setField(term2199, term2199.getClass(), "title", enum8);
        setField(term2199, term2199.getClass(), "name", "BYqFIqCKAV");
        setField(term2223, term2223.getClass(), "id", term2224);
        setField(term2223, term2223.getClass(), "name", "vrQLuWIDJX");
        setLongField(term2223, term2223.getClass(), "version", 7411271909051562686L);
        setField(term2223, term2223.getClass(), "tasks", term2239);
        setField(term2223, term2223.getClass(), "knights", term2245);
        setField(term2199, term2199.getClass(), "quest", term2223);
        setField(term2251, term2251.getClass(), "id", term2252);
        setField(term2251, term2251.getClass(), "name", "flxyYxBRtu");
        setField(term2251, term2251.getClass(), "city", "OclPbYPkcH");
        setField(term2251, term2251.getClass(), "state", "IoAlmYsBwc");
        setDoubleField(term2251, term2251.getClass(), "latitude", 0.6076495596892013);
        setDoubleField(term2251, term2251.getClass(), "longitude", 0.37773193782763337);
        setField(term2251, term2251.getClass(), "knights", term2292);
        setField(term2199, term2199.getClass(), "castle", term2251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2199, args);
    }

};


