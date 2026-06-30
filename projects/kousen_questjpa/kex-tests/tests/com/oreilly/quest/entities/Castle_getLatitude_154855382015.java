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

public class Castle_getLatitude_154855382015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9026;

    public Castle_getLatitude_154855382015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9027 = new Long(-9040825890007374809L);
        HashMap term9068 = new HashMap();
        Set<Object> term9103 =  ((Map) term9068).keySet();
        HashSet term9067 = new HashSet((Collection<? extends Object>) term9103);
        term9026 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9026, term9026.getClass(), "id", term9027);
        setField(term9026, term9026.getClass(), "name", "rLHAoqXgPh");
        setField(term9026, term9026.getClass(), "city", "zUlRdimJtU");
        setField(term9026, term9026.getClass(), "state", "vwbEQQNQrx");
        setDoubleField(term9026, term9026.getClass(), "latitude", 0.7919370314903882);
        setDoubleField(term9026, term9026.getClass(), "longitude", 0.2109867221632754);
        setField(term9026, term9026.getClass(), "knights", term9067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLatitude", argTypes, term9026, args);
    }

};


