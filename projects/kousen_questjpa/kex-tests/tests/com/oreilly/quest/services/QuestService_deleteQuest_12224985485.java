package com.oreilly.quest.services;

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
import static com.oreilly.quest.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class QuestService_deleteQuest_12224985485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public QuestService_deleteQuest_12224985485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28 = new Long(-8257434502486459194L);
        HashMap term44 = new HashMap();
        Set<Object> term65 =  ((Map) term44).keySet();
        HashSet term43 = new HashSet((Collection<? extends Object>) term65);
        HashMap term50 = new HashMap();
        Set<Object> term66 =  ((Map) term50).keySet();
        HashSet term49 = new HashSet((Collection<? extends Object>) term66);
        term27 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term27, term27.getClass(), "id", term28);
        setField(term27, term27.getClass(), "name", "sjlJAEtRrb");
        setLongField(term27, term27.getClass(), "version", 2442117782898005296L);
        setField(term27, term27.getClass(), "tasks", term43);
        setField(term27, term27.getClass(), "knights", term49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.services.QuestService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Quest");
        Object[] args = new Object[1];
        args[0] = term27;
        callMethod(klass, "deleteQuest", argTypes, null, args);
    }

};


