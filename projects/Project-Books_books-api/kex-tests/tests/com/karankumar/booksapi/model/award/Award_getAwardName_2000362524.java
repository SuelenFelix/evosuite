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

public class Award_getAwardName_2000362524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2245;

    public Award_getAwardName_2000362524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2246 = new Long(-8708192233349544946L);
        Class<? extends Object> term2317 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term2316 = ((Class) term2317).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term2316).setAccessible(true);
        Object enum4 = ((Field) term2316).get((Object) null);
        HashMap term2311 = new HashMap();
        Set<Object> term2591 =  ((Map) term2311).keySet();
        HashSet term2310 = new HashSet((Collection<? extends Object>) term2591);
        term2245 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term2245, term2245.getClass(), "id", term2246);
        setField(term2245, term2245.getClass(), "awardName", enum4);
        setField(term2245, term2245.getClass(), "category", "HqBOwkVqjD");
        setIntField(term2245, term2245.getClass(), "year", -1922583790);
        setField(term2245, term2245.getClass(), "books", term2310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAwardName", argTypes, term2245, args);
    }

};


