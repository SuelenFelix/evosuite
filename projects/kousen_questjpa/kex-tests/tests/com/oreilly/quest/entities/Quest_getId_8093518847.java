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

public class Quest_getId_8093518847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10722;

    public Quest_getId_8093518847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10723 = new Long(8313800941204938919L);
        HashMap term10739 = new HashMap();
        Set<Object> term10760 =  ((Map) term10739).keySet();
        HashSet term10738 = new HashSet((Collection<? extends Object>) term10760);
        HashMap term10745 = new HashMap();
        Set<Object> term10761 =  ((Map) term10745).keySet();
        HashSet term10744 = new HashSet((Collection<? extends Object>) term10761);
        term10722 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term10722, term10722.getClass(), "id", term10723);
        setField(term10722, term10722.getClass(), "name", "izPpKDErnQ");
        setLongField(term10722, term10722.getClass(), "version", -2170847986967241072L);
        setField(term10722, term10722.getClass(), "tasks", term10738);
        setField(term10722, term10722.getClass(), "knights", term10744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term10722, args);
    }

};


