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

public class Knight_setId_5147320014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1211;
     Object term1308;

    public Knight_setId_5147320014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1212 = new Long(5270370404989704783L);
        Class<? extends Object> term1311 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term1310 = ((Class) term1311).getDeclaredField((String) "SIR");
        ((Field) term1310).setAccessible(true);
        Object enum5 = ((Field) term1310).get((Object) null);
        Long term1234 = new Long(7411271909051562686L);
        HashMap term1250 = new HashMap();
        Set<Object> term1506 =  ((Map) term1250).keySet();
        HashSet term1249 = new HashSet((Collection<? extends Object>) term1506);
        HashMap term1256 = new HashMap();
        Set<Object> term1507 =  ((Map) term1256).keySet();
        HashSet term1255 = new HashSet((Collection<? extends Object>) term1507);
        Long term1262 = new Long(4872422362414183754L);
        HashMap term1303 = new HashMap();
        Set<Object> term1538 =  ((Map) term1303).keySet();
        HashSet term1302 = new HashSet((Collection<? extends Object>) term1538);
        term1211 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term1233 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term1261 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term1211, term1211.getClass(), "id", term1212);
        setField(term1211, term1211.getClass(), "title", enum5);
        setField(term1211, term1211.getClass(), "name", "RMFIsYGgne");
        setField(term1233, term1233.getClass(), "id", term1234);
        setField(term1233, term1233.getClass(), "name", "NRdvgJlhkX");
        setLongField(term1233, term1233.getClass(), "version", -8257434502486459194L);
        setField(term1233, term1233.getClass(), "tasks", term1249);
        setField(term1233, term1233.getClass(), "knights", term1255);
        setField(term1211, term1211.getClass(), "quest", term1233);
        setField(term1261, term1261.getClass(), "id", term1262);
        setField(term1261, term1261.getClass(), "name", "uuaPigETmJ");
        setField(term1261, term1261.getClass(), "city", "MxlszYVzRf");
        setField(term1261, term1261.getClass(), "state", "LQFpaHEwXR");
        setDoubleField(term1261, term1261.getClass(), "latitude", 0.5523635872663106);
        setDoubleField(term1261, term1261.getClass(), "longitude", 0.544608645520025);
        setField(term1261, term1261.getClass(), "knights", term1302);
        setField(term1211, term1211.getClass(), "castle", term1261);
        term1308 = new Long(6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1308;
        callMethod(klass, "setId", argTypes, term1211, args);
    }

};


