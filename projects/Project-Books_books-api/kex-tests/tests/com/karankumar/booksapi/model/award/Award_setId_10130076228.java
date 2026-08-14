package com.karankumar.booksapi.model.award;

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
import static com.karankumar.booksapi.model.award.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Award_setId_10130076228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3663;
     Object term3721;

    public Award_setId_10130076228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3664 = new Long(-6292278961887936280L);
        Class<? extends Object> term3724 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term3723 = ((Class) term3724).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term3723).setAccessible(true);
        Object enum8 = ((Field) term3723).get((Object) null);
        HashMap term3716 = new HashMap();
        Set<Object> term4004 =  ((Map) term3716).keySet();
        HashSet term3715 = new HashSet((Collection<? extends Object>) term4004);
        term3663 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term3663, term3663.getClass(), "id", term3664);
        setField(term3663, term3663.getClass(), "awardName", enum8);
        setField(term3663, term3663.getClass(), "category", "OWKQODBLzb");
        setIntField(term3663, term3663.getClass(), "year", 1227103734);
        setField(term3663, term3663.getClass(), "books", term3715);
        term3721 = new Long(-6645965768855543712L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3721;
        callMethod(klass, "setId", argTypes, term3663, args);
    }

};


