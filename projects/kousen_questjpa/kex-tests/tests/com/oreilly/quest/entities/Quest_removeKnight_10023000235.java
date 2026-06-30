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
import java.lang.String;

public class Quest_removeKnight_10023000235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10306;
     Object term10334;

    public Quest_removeKnight_10023000235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10307 = new Long(5671808784468963649L);
        HashMap term10323 = new HashMap();
        Set<Object> term10443 =  ((Map) term10323).keySet();
        HashSet term10322 = new HashSet((Collection<? extends Object>) term10443);
        HashMap term10329 = new HashMap();
        Set<Object> term10444 =  ((Map) term10329).keySet();
        HashSet term10328 = new HashSet((Collection<? extends Object>) term10444);
        term10306 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term10306, term10306.getClass(), "id", term10307);
        setField(term10306, term10306.getClass(), "name", "vGiuZVPJNH");
        setLongField(term10306, term10306.getClass(), "version", -6645965768855543712L);
        setField(term10306, term10306.getClass(), "tasks", term10322);
        setField(term10306, term10306.getClass(), "knights", term10328);
        Long term10335 = new Long(2297097306706899827L);
        Class<? extends Object> term10446 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term10445 = ((Class) term10446).getDeclaredField((String) "QUEEN");
        ((Field) term10445).setAccessible(true);
        Object enum20 = ((Field) term10445).get((Object) null);
        Long term10359 = new Long(-900457279156388404L);
        HashMap term10375 = new HashMap();
        Set<Object> term10647 =  ((Map) term10375).keySet();
        HashSet term10374 = new HashSet((Collection<? extends Object>) term10647);
        HashMap term10381 = new HashMap();
        Set<Object> term10648 =  ((Map) term10381).keySet();
        HashSet term10380 = new HashSet((Collection<? extends Object>) term10648);
        Long term10387 = new Long(1084801489398441516L);
        HashMap term10428 = new HashMap();
        Set<Object> term10679 =  ((Map) term10428).keySet();
        HashSet term10427 = new HashSet((Collection<? extends Object>) term10679);
        term10334 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term10358 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term10386 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term10334, term10334.getClass(), "id", term10335);
        setField(term10334, term10334.getClass(), "title", enum20);
        setField(term10334, term10334.getClass(), "name", "tlzpzIjMib");
        setField(term10358, term10358.getClass(), "id", term10359);
        setField(term10358, term10358.getClass(), "name", "AZdLeSugwv");
        setLongField(term10358, term10358.getClass(), "version", 4784595517102746672L);
        setField(term10358, term10358.getClass(), "tasks", term10374);
        setField(term10358, term10358.getClass(), "knights", term10380);
        setField(term10334, term10334.getClass(), "quest", term10358);
        setField(term10386, term10386.getClass(), "id", term10387);
        setField(term10386, term10386.getClass(), "name", "RMsXuyzKJV");
        setField(term10386, term10386.getClass(), "city", "FwPbDZcHmB");
        setField(term10386, term10386.getClass(), "state", "hOncybyCAH");
        setDoubleField(term10386, term10386.getClass(), "latitude", 0.6767213143579776);
        setDoubleField(term10386, term10386.getClass(), "longitude", 0.48862955528902696);
        setField(term10386, term10386.getClass(), "knights", term10427);
        setField(term10334, term10334.getClass(), "castle", term10386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Knight");
        Object[] args = new Object[1];
        args[0] = term10334;
        callMethod(klass, "removeKnight", argTypes, term10306, args);
    }

};


