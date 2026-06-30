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

public class Castle_setId_6126200528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8412;
     Object term8459;

    public Castle_setId_6126200528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8413 = new Long(7247160664318067468L);
        HashMap term8454 = new HashMap();
        Set<Object> term8491 =  ((Map) term8454).keySet();
        HashSet term8453 = new HashSet((Collection<? extends Object>) term8491);
        term8412 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term8412, term8412.getClass(), "id", term8413);
        setField(term8412, term8412.getClass(), "name", "FPvxVzzSvD");
        setField(term8412, term8412.getClass(), "city", "WHcwFgsGFC");
        setField(term8412, term8412.getClass(), "state", "HzqpegHiRq");
        setDoubleField(term8412, term8412.getClass(), "latitude", 0.25937345430928016);
        setDoubleField(term8412, term8412.getClass(), "longitude", 0.5873228247510078);
        setField(term8412, term8412.getClass(), "knights", term8453);
        term8459 = new Long(2135754395358000892L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term8459;
        callMethod(klass, "setId", argTypes, term8412, args);
    }

};


