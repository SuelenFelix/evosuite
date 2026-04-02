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
import java.lang.Double;

public class Castle_setLongitude_78381769318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9262;
     Object term9309;

    public Castle_setLongitude_78381769318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9263 = new Long(2354625302846375590L);
        HashMap term9304 = new HashMap();
        Set<Object> term9341 =  ((Map) term9304).keySet();
        HashSet term9303 = new HashSet((Collection<? extends Object>) term9341);
        term9262 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9262, term9262.getClass(), "id", term9263);
        setField(term9262, term9262.getClass(), "name", "DyiXbeYIaN");
        setField(term9262, term9262.getClass(), "city", "VGizxZnyHX");
        setField(term9262, term9262.getClass(), "state", "kVEZMHmRtR");
        setDoubleField(term9262, term9262.getClass(), "latitude", 0.5306473989087822);
        setDoubleField(term9262, term9262.getClass(), "longitude", 0.022483645678509023);
        setField(term9262, term9262.getClass(), "knights", term9303);
        term9309 = new Double(0.025133051616627267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9309;
        callMethod(klass, "setLongitude", argTypes, term9262, args);
    }

};


