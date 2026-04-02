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

public class Quest_setId_12393936426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10680;
     Object term10708;

    public Quest_setId_12393936426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10681 = new Long(6273754186658578034L);
        HashMap term10697 = new HashMap();
        Set<Object> term10720 =  ((Map) term10697).keySet();
        HashSet term10696 = new HashSet((Collection<? extends Object>) term10720);
        HashMap term10703 = new HashMap();
        Set<Object> term10721 =  ((Map) term10703).keySet();
        HashSet term10702 = new HashSet((Collection<? extends Object>) term10721);
        term10680 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term10680, term10680.getClass(), "id", term10681);
        setField(term10680, term10680.getClass(), "name", "QduALnDSVo");
        setLongField(term10680, term10680.getClass(), "version", -7612550318181586304L);
        setField(term10680, term10680.getClass(), "tasks", term10696);
        setField(term10680, term10680.getClass(), "knights", term10702);
        term10708 = new Long(3620247240684476031L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term10708;
        callMethod(klass, "setId", argTypes, term10680, args);
    }

};


