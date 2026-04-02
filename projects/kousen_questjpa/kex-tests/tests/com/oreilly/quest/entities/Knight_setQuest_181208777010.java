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

public class Knight_setQuest_181208777010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3215;
     Object term3314;

    public Knight_setQuest_181208777010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3216 = new Long(-4365849114644724155L);
        Class<? extends Object> term3343 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term3342 = ((Class) term3343).getDeclaredField((String) "QUEEN");
        ((Field) term3342).setAccessible(true);
        Object enum11 = ((Field) term3342).get((Object) null);
        Long term3240 = new Long(2486810210675247493L);
        HashMap term3256 = new HashMap();
        Set<Object> term3544 =  ((Map) term3256).keySet();
        HashSet term3255 = new HashSet((Collection<? extends Object>) term3544);
        HashMap term3262 = new HashMap();
        Set<Object> term3545 =  ((Map) term3262).keySet();
        HashSet term3261 = new HashSet((Collection<? extends Object>) term3545);
        Long term3268 = new Long(7009926388951271268L);
        HashMap term3309 = new HashMap();
        Set<Object> term3576 =  ((Map) term3309).keySet();
        HashSet term3308 = new HashSet((Collection<? extends Object>) term3576);
        term3215 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term3239 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term3267 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term3215, term3215.getClass(), "id", term3216);
        setField(term3215, term3215.getClass(), "title", enum11);
        setField(term3215, term3215.getClass(), "name", "wSQxaModmm");
        setField(term3239, term3239.getClass(), "id", term3240);
        setField(term3239, term3239.getClass(), "name", "UlajhuVLaP");
        setLongField(term3239, term3239.getClass(), "version", -7237588299778557629L);
        setField(term3239, term3239.getClass(), "tasks", term3255);
        setField(term3239, term3239.getClass(), "knights", term3261);
        setField(term3215, term3215.getClass(), "quest", term3239);
        setField(term3267, term3267.getClass(), "id", term3268);
        setField(term3267, term3267.getClass(), "name", "gGSMzuGICf");
        setField(term3267, term3267.getClass(), "city", "hxCBltsObl");
        setField(term3267, term3267.getClass(), "state", "BndsHwAFMv");
        setDoubleField(term3267, term3267.getClass(), "latitude", 0.7031006357544823);
        setDoubleField(term3267, term3267.getClass(), "longitude", 0.9527281779865117);
        setField(term3267, term3267.getClass(), "knights", term3308);
        setField(term3215, term3215.getClass(), "castle", term3267);
        Long term3315 = new Long(-7672528020740371001L);
        HashMap term3331 = new HashMap();
        Set<Object> term3587 =  ((Map) term3331).keySet();
        HashSet term3330 = new HashSet((Collection<? extends Object>) term3587);
        HashMap term3337 = new HashMap();
        Set<Object> term3588 =  ((Map) term3337).keySet();
        HashSet term3336 = new HashSet((Collection<? extends Object>) term3588);
        term3314 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term3314, term3314.getClass(), "id", term3315);
        setField(term3314, term3314.getClass(), "name", "GzFkzHGYFt");
        setLongField(term3314, term3314.getClass(), "version", 6967924379644551255L);
        setField(term3314, term3314.getClass(), "tasks", term3330);
        setField(term3314, term3314.getClass(), "knights", term3336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Quest");
        Object[] args = new Object[1];
        args[0] = term3314;
        callMethod(klass, "setQuest", argTypes, term3215, args);
    }

};


