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

public class Quest_addToKnights_9560158804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9936;
     Object term9964;

    public Quest_addToKnights_9560158804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9937 = new Long(-4393710401270724527L);
        HashMap term9953 = new HashMap();
        Set<Object> term10072 =  ((Map) term9953).keySet();
        HashSet term9952 = new HashSet((Collection<? extends Object>) term10072);
        HashMap term9959 = new HashMap();
        Set<Object> term10073 =  ((Map) term9959).keySet();
        HashSet term9958 = new HashSet((Collection<? extends Object>) term10073);
        term9936 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term9936, term9936.getClass(), "id", term9937);
        setField(term9936, term9936.getClass(), "name", "HDaezxQfQR");
        setLongField(term9936, term9936.getClass(), "version", -2068172595987555756L);
        setField(term9936, term9936.getClass(), "tasks", term9952);
        setField(term9936, term9936.getClass(), "knights", term9958);
        Long term9965 = new Long(-4822736661741380518L);
        Class<? extends Object> term10075 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term10074 = ((Class) term10075).getDeclaredField((String) "KING");
        ((Field) term10074).setAccessible(true);
        Object enum19 = ((Field) term10074).get((Object) null);
        Long term9988 = new Long(-5386201758403679145L);
        HashMap term10004 = new HashMap();
        Set<Object> term10273 =  ((Map) term10004).keySet();
        HashSet term10003 = new HashSet((Collection<? extends Object>) term10273);
        HashMap term10010 = new HashMap();
        Set<Object> term10274 =  ((Map) term10010).keySet();
        HashSet term10009 = new HashSet((Collection<? extends Object>) term10274);
        Long term10016 = new Long(-7268507582722666254L);
        HashMap term10057 = new HashMap();
        Set<Object> term10305 =  ((Map) term10057).keySet();
        HashSet term10056 = new HashSet((Collection<? extends Object>) term10305);
        term9964 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term9987 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term10015 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9964, term9964.getClass(), "id", term9965);
        setField(term9964, term9964.getClass(), "title", enum19);
        setField(term9964, term9964.getClass(), "name", "iikZEapDlu");
        setField(term9987, term9987.getClass(), "id", term9988);
        setField(term9987, term9987.getClass(), "name", "nhoHrZfnIN");
        setLongField(term9987, term9987.getClass(), "version", -6292278961887936280L);
        setField(term9987, term9987.getClass(), "tasks", term10003);
        setField(term9987, term9987.getClass(), "knights", term10009);
        setField(term9964, term9964.getClass(), "quest", term9987);
        setField(term10015, term10015.getClass(), "id", term10016);
        setField(term10015, term10015.getClass(), "name", "ZkMALXpEAZ");
        setField(term10015, term10015.getClass(), "city", "tXfQjSqDzN");
        setField(term10015, term10015.getClass(), "state", "BjugTaMcxJ");
        setDoubleField(term10015, term10015.getClass(), "latitude", 0.03699061125289671);
        setDoubleField(term10015, term10015.getClass(), "longitude", 0.6047137830113202);
        setField(term10015, term10015.getClass(), "knights", term10056);
        setField(term9964, term9964.getClass(), "castle", term10015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Knight");
        Object[] args = new Object[1];
        args[0] = term9964;
        callMethod(klass, "addToKnights", argTypes, term9936, args);
    }

};


