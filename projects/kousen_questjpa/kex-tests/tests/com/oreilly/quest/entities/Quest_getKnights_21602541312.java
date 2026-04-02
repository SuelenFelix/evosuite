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

public class Quest_getKnights_21602541312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10960;

    public Quest_getKnights_21602541312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10961 = new Long(6843866297465638866L);
        HashMap term10977 = new HashMap();
        Set<Object> term10998 =  ((Map) term10977).keySet();
        HashSet term10976 = new HashSet((Collection<? extends Object>) term10998);
        HashMap term10983 = new HashMap();
        Set<Object> term10999 =  ((Map) term10983).keySet();
        HashSet term10982 = new HashSet((Collection<? extends Object>) term10999);
        term10960 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term10960, term10960.getClass(), "id", term10961);
        setField(term10960, term10960.getClass(), "name", "GZdcJyZntS");
        setLongField(term10960, term10960.getClass(), "version", -1154553077993834885L);
        setField(term10960, term10960.getClass(), "tasks", term10976);
        setField(term10960, term10960.getClass(), "knights", term10982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKnights", argTypes, term10960, args);
    }

};


