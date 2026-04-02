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

public class Castle_getLongitude_210833228317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9184;

    public Castle_getLongitude_210833228317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9185 = new Long(-5786861555969446503L);
        HashMap term9226 = new HashMap();
        Set<Object> term9261 =  ((Map) term9226).keySet();
        HashSet term9225 = new HashSet((Collection<? extends Object>) term9261);
        term9184 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9184, term9184.getClass(), "id", term9185);
        setField(term9184, term9184.getClass(), "name", "JmcmxoGhIK");
        setField(term9184, term9184.getClass(), "city", "jXzmYyrnnT");
        setField(term9184, term9184.getClass(), "state", "igCAtimmYB");
        setDoubleField(term9184, term9184.getClass(), "latitude", 0.9126850255993704);
        setDoubleField(term9184, term9184.getClass(), "longitude", 0.11179067076100713);
        setField(term9184, term9184.getClass(), "knights", term9225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLongitude", argTypes, term9184, args);
    }

};


