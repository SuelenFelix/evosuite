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

public class Quest_setTasks_37340382711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10904;
     Object term10932;

    public Quest_setTasks_37340382711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10905 = new Long(-2255965562447970862L);
        HashMap term10921 = new HashMap();
        Set<Object> term10957 =  ((Map) term10921).keySet();
        HashSet term10920 = new HashSet((Collection<? extends Object>) term10957);
        HashMap term10927 = new HashMap();
        Set<Object> term10958 =  ((Map) term10927).keySet();
        HashSet term10926 = new HashSet((Collection<? extends Object>) term10958);
        term10904 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term10904, term10904.getClass(), "id", term10905);
        setField(term10904, term10904.getClass(), "name", "GrqozDKFOk");
        setLongField(term10904, term10904.getClass(), "version", -5788180182343976541L);
        setField(term10904, term10904.getClass(), "tasks", term10920);
        setField(term10904, term10904.getClass(), "knights", term10926);
        HashMap term10933 = new HashMap();
        Set<Object> term10959 =  ((Map) term10933).keySet();
        term10932 = new HashSet((Collection<? extends Object>) term10959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term10932;
        callMethod(klass, "setTasks", argTypes, term10904, args);
    }

};


