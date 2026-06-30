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

public class Knight_hashCode_986138512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3924;

    public Knight_hashCode_986138512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3925 = new Long(6855071767938501807L);
        Class<? extends Object> term4023 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term4022 = ((Class) term4023).getDeclaredField((String) "LADY");
        ((Field) term4022).setAccessible(true);
        Object enum13 = ((Field) term4022).get((Object) null);
        Long term3948 = new Long(-5892135042702373494L);
        HashMap term3964 = new HashMap();
        Set<Object> term4221 =  ((Map) term3964).keySet();
        HashSet term3963 = new HashSet((Collection<? extends Object>) term4221);
        HashMap term3970 = new HashMap();
        Set<Object> term4222 =  ((Map) term3970).keySet();
        HashSet term3969 = new HashSet((Collection<? extends Object>) term4222);
        Long term3976 = new Long(5262507301787091109L);
        HashMap term4017 = new HashMap();
        Set<Object> term4253 =  ((Map) term4017).keySet();
        HashSet term4016 = new HashSet((Collection<? extends Object>) term4253);
        term3924 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term3947 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term3975 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term3924, term3924.getClass(), "id", term3925);
        setField(term3924, term3924.getClass(), "title", enum13);
        setField(term3924, term3924.getClass(), "name", "UiUYnPrcCi");
        setField(term3947, term3947.getClass(), "id", term3948);
        setField(term3947, term3947.getClass(), "name", "UoYtihxVaS");
        setLongField(term3947, term3947.getClass(), "version", -8885298608300233488L);
        setField(term3947, term3947.getClass(), "tasks", term3963);
        setField(term3947, term3947.getClass(), "knights", term3969);
        setField(term3924, term3924.getClass(), "quest", term3947);
        setField(term3975, term3975.getClass(), "id", term3976);
        setField(term3975, term3975.getClass(), "name", "JDswTTCZHV");
        setField(term3975, term3975.getClass(), "city", "onpbIeEKoi");
        setField(term3975, term3975.getClass(), "state", "YRHGsAkhxb");
        setDoubleField(term3975, term3975.getClass(), "latitude", 0.6436713023569729);
        setDoubleField(term3975, term3975.getClass(), "longitude", 0.7332741045694002);
        setField(term3975, term3975.getClass(), "knights", term4016);
        setField(term3924, term3924.getClass(), "castle", term3975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3924, args);
    }

};


