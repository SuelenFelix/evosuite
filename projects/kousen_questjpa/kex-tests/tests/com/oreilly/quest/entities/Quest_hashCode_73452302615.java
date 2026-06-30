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

public class Quest_hashCode_73452302615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11088;

    public Quest_hashCode_73452302615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11089 = new Long(-1616722610139554082L);
        HashMap term11105 = new HashMap();
        Set<Object> term11126 =  ((Map) term11105).keySet();
        HashSet term11104 = new HashSet((Collection<? extends Object>) term11126);
        HashMap term11111 = new HashMap();
        Set<Object> term11127 =  ((Map) term11111).keySet();
        HashSet term11110 = new HashSet((Collection<? extends Object>) term11127);
        term11088 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term11088, term11088.getClass(), "id", term11089);
        setField(term11088, term11088.getClass(), "name", "wKWbJssZuG");
        setLongField(term11088, term11088.getClass(), "version", -1468719814009985452L);
        setField(term11088, term11088.getClass(), "tasks", term11104);
        setField(term11088, term11088.getClass(), "knights", term11110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term11088, args);
    }

};


