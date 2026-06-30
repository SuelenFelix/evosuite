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
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Knight_init_17405840372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3;
     Object term656;

    public Knight_init_17405840372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term685 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term684 = ((Class) term685).getDeclaredField((String) "KING");
        ((Field) term684).setAccessible(true);
        enum3 = ((Field) term684).get((Object) null);
        Long term657 = new Long(2442117782898005296L);
        HashMap term673 = new HashMap();
        Set<Object> term883 =  ((Map) term673).keySet();
        HashSet term672 = new HashSet((Collection<? extends Object>) term883);
        HashMap term679 = new HashMap();
        Set<Object> term884 =  ((Map) term679).keySet();
        HashSet term678 = new HashSet((Collection<? extends Object>) term884);
        term656 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term656, term656.getClass(), "id", term657);
        setField(term656, term656.getClass(), "name", "xxtlPwDYFs");
        setLongField(term656, term656.getClass(), "version", 2442117782898005296L);
        setField(term656, term656.getClass(), "tasks", term672);
        setField(term656, term656.getClass(), "knights", term678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Title");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.oreilly.quest.entities.Quest");
        Object[] args = new Object[3];
        args[0] = enum3;
        args[1] = "MuLcgQHgqz";
        args[2] = term656;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


