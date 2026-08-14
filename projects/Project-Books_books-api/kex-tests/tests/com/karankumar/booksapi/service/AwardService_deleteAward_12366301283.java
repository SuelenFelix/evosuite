package com.karankumar.booksapi.service;

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
import static com.karankumar.booksapi.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class AwardService_deleteAward_12366301283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700;

    public AwardService_deleteAward_12366301283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term701 = new Long(-8257434502486459194L);
        Class<? extends Object> term759 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term758 = ((Class) term759).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term758).setAccessible(true);
        Object enum1 = ((Field) term758).get((Object) null);
        HashMap term753 = new HashMap();
        Set<Object> term1039 =  ((Map) term753).keySet();
        HashSet term752 = new HashSet((Collection<? extends Object>) term1039);
        term700 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term700, term700.getClass(), "id", term701);
        setField(term700, term700.getClass(), "awardName", enum1);
        setField(term700, term700.getClass(), "category", "sjlJAEtRrb");
        setIntField(term700, term700.getClass(), "year", 1162663216);
        setField(term700, term700.getClass(), "books", term752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.service.AwardService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.award.Award");
        Object[] args = new Object[1];
        args[0] = term700;
        callMethod(klass, "deleteAward", argTypes, null, args);
    }

};


