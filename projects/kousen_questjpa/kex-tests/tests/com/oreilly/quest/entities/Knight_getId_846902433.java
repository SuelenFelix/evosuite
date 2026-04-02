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

public class Knight_getId_846902433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term885;

    public Knight_getId_846902433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term886 = new Long(6375119433582206027L);
        Class<? extends Object> term983 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term982 = ((Class) term983).getDeclaredField((String) "SIR");
        ((Field) term982).setAccessible(true);
        Object enum4 = ((Field) term982).get((Object) null);
        Long term908 = new Long(-8257434502486459194L);
        HashMap term924 = new HashMap();
        Set<Object> term1178 =  ((Map) term924).keySet();
        HashSet term923 = new HashSet((Collection<? extends Object>) term1178);
        HashMap term930 = new HashMap();
        Set<Object> term1179 =  ((Map) term930).keySet();
        HashSet term929 = new HashSet((Collection<? extends Object>) term1179);
        Long term936 = new Long(-8400487765614892086L);
        HashMap term977 = new HashMap();
        Set<Object> term1210 =  ((Map) term977).keySet();
        HashSet term976 = new HashSet((Collection<? extends Object>) term1210);
        term885 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term907 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term935 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term885, term885.getClass(), "id", term886);
        setField(term885, term885.getClass(), "title", enum4);
        setField(term885, term885.getClass(), "name", "jJCZpVmanW");
        setField(term907, term907.getClass(), "id", term908);
        setField(term907, term907.getClass(), "name", "EGtDIRbSSb");
        setLongField(term907, term907.getClass(), "version", 6375119433582206027L);
        setField(term907, term907.getClass(), "tasks", term923);
        setField(term907, term907.getClass(), "knights", term929);
        setField(term885, term885.getClass(), "quest", term907);
        setField(term935, term935.getClass(), "id", term936);
        setField(term935, term935.getClass(), "name", "SzjVpOQTyS");
        setField(term935, term935.getClass(), "city", "MjGYSRKTNF");
        setField(term935, term935.getClass(), "state", "hRNSzYYIrc");
        setDoubleField(term935, term935.getClass(), "latitude", 0.13238746331190498);
        setDoubleField(term935, term935.getClass(), "longitude", 0.3455959125047594);
        setField(term935, term935.getClass(), "knights", term976);
        setField(term885, term885.getClass(), "castle", term935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term885, args);
    }

};


