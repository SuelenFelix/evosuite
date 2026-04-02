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

public class Knight_setCastle_156367347415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4910;
     Object term5009;

    public Knight_setCastle_156367347415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4911 = new Long(5907001541142728739L);
        Class<? extends Object> term5057 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term5056 = ((Class) term5057).getDeclaredField((String) "QUEEN");
        ((Field) term5056).setAccessible(true);
        Object enum16 = ((Field) term5056).get((Object) null);
        Long term4935 = new Long(4178434741742309755L);
        HashMap term4951 = new HashMap();
        Set<Object> term5258 =  ((Map) term4951).keySet();
        HashSet term4950 = new HashSet((Collection<? extends Object>) term5258);
        HashMap term4957 = new HashMap();
        Set<Object> term5259 =  ((Map) term4957).keySet();
        HashSet term4956 = new HashSet((Collection<? extends Object>) term5259);
        Long term4963 = new Long(-2068172595987555756L);
        HashMap term5004 = new HashMap();
        Set<Object> term5290 =  ((Map) term5004).keySet();
        HashSet term5003 = new HashSet((Collection<? extends Object>) term5290);
        term4910 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term4934 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term4962 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term4910, term4910.getClass(), "id", term4911);
        setField(term4910, term4910.getClass(), "title", enum16);
        setField(term4910, term4910.getClass(), "name", "kBdSllIBVz");
        setField(term4934, term4934.getClass(), "id", term4935);
        setField(term4934, term4934.getClass(), "name", "TJmVBGfTML");
        setLongField(term4934, term4934.getClass(), "version", -5476826692763582090L);
        setField(term4934, term4934.getClass(), "tasks", term4950);
        setField(term4934, term4934.getClass(), "knights", term4956);
        setField(term4910, term4910.getClass(), "quest", term4934);
        setField(term4962, term4962.getClass(), "id", term4963);
        setField(term4962, term4962.getClass(), "name", "tPlsykYBqO");
        setField(term4962, term4962.getClass(), "city", "bLPjGVBhlX");
        setField(term4962, term4962.getClass(), "state", "whBvTVIIlC");
        setDoubleField(term4962, term4962.getClass(), "latitude", 0.13481025392611334);
        setDoubleField(term4962, term4962.getClass(), "longitude", 0.3800088629986428);
        setField(term4962, term4962.getClass(), "knights", term5003);
        setField(term4910, term4910.getClass(), "castle", term4962);
        Long term5010 = new Long(-6292278961887936280L);
        HashMap term5051 = new HashMap();
        Set<Object> term5321 =  ((Map) term5051).keySet();
        HashSet term5050 = new HashSet((Collection<? extends Object>) term5321);
        term5009 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term5009, term5009.getClass(), "id", term5010);
        setField(term5009, term5009.getClass(), "name", "IgRJUzaCwW");
        setField(term5009, term5009.getClass(), "city", "JUmudUmaaV");
        setField(term5009, term5009.getClass(), "state", "KoyGrUJeJW");
        setDoubleField(term5009, term5009.getClass(), "latitude", 0.5840714198152577);
        setDoubleField(term5009, term5009.getClass(), "longitude", 0.7559240768573477);
        setField(term5009, term5009.getClass(), "knights", term5050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Castle");
        Object[] args = new Object[1];
        args[0] = term5009;
        callMethod(klass, "setCastle", argTypes, term4910, args);
    }

};


