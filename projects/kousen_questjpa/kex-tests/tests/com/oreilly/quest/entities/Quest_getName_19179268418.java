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

public class Quest_getName_19179268418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10762;

    public Quest_getName_19179268418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10763 = new Long(-1214968196781083707L);
        HashMap term10779 = new HashMap();
        Set<Object> term10800 =  ((Map) term10779).keySet();
        HashSet term10778 = new HashSet((Collection<? extends Object>) term10800);
        HashMap term10785 = new HashMap();
        Set<Object> term10801 =  ((Map) term10785).keySet();
        HashSet term10784 = new HashSet((Collection<? extends Object>) term10801);
        term10762 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term10762, term10762.getClass(), "id", term10763);
        setField(term10762, term10762.getClass(), "name", "NnpwZBUTvx");
        setLongField(term10762, term10762.getClass(), "version", 4044358158040652353L);
        setField(term10762, term10762.getClass(), "tasks", term10778);
        setField(term10762, term10762.getClass(), "knights", term10784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term10762, args);
    }

};


