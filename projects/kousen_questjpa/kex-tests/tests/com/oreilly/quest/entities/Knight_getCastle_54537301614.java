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

public class Knight_getCastle_54537301614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4580;

    public Knight_getCastle_54537301614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4581 = new Long(6617340557564669657L);
        Class<? extends Object> term4679 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term4678 = ((Class) term4679).getDeclaredField((String) "LADY");
        ((Field) term4678).setAccessible(true);
        Object enum15 = ((Field) term4678).get((Object) null);
        Long term4604 = new Long(1439298019805881866L);
        HashMap term4620 = new HashMap();
        Set<Object> term4877 =  ((Map) term4620).keySet();
        HashSet term4619 = new HashSet((Collection<? extends Object>) term4877);
        HashMap term4626 = new HashMap();
        Set<Object> term4878 =  ((Map) term4626).keySet();
        HashSet term4625 = new HashSet((Collection<? extends Object>) term4878);
        Long term4632 = new Long(-8708192233349544946L);
        HashMap term4673 = new HashMap();
        Set<Object> term4909 =  ((Map) term4673).keySet();
        HashSet term4672 = new HashSet((Collection<? extends Object>) term4909);
        term4580 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term4603 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term4631 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term4580, term4580.getClass(), "id", term4581);
        setField(term4580, term4580.getClass(), "title", enum15);
        setField(term4580, term4580.getClass(), "name", "dEnhdmILtU");
        setField(term4603, term4603.getClass(), "id", term4604);
        setField(term4603, term4603.getClass(), "name", "hoicvmsovO");
        setLongField(term4603, term4603.getClass(), "version", 2535595959091595249L);
        setField(term4603, term4603.getClass(), "tasks", term4619);
        setField(term4603, term4603.getClass(), "knights", term4625);
        setField(term4580, term4580.getClass(), "quest", term4603);
        setField(term4631, term4631.getClass(), "id", term4632);
        setField(term4631, term4631.getClass(), "name", "eqJfYWRaEL");
        setField(term4631, term4631.getClass(), "city", "fhkbdRViHi");
        setField(term4631, term4631.getClass(), "state", "uWHnvSvaPl");
        setDoubleField(term4631, term4631.getClass(), "latitude", 0.43692187681405226);
        setDoubleField(term4631, term4631.getClass(), "longitude", 0.7633268466829064);
        setField(term4631, term4631.getClass(), "knights", term4672);
        setField(term4580, term4580.getClass(), "castle", term4631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCastle", argTypes, term4580, args);
    }

};


