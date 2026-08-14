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

public class Award_getId_14430493803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1901;

    public Award_getId_14430493803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1902 = new Long(1439298019805881866L);
        Class<? extends Object> term1967 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term1966 = ((Class) term1967).getDeclaredField((String) "WOMENS_PRIZE");
        ((Field) term1966).setAccessible(true);
        Object enum3 = ((Field) term1966).get((Object) null);
        HashMap term1961 = new HashMap();
        Set<Object> term2244 =  ((Map) term1961).keySet();
        HashSet term1960 = new HashSet((Collection<? extends Object>) term2244);
        term1901 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term1901, term1901.getClass(), "id", term1902);
        setField(term1901, term1901.getClass(), "awardName", enum3);
        setField(term1901, term1901.getClass(), "category", "KoyGrUJeJW");
        setIntField(term1901, term1901.getClass(), "year", 391863371);
        setField(term1901, term1901.getClass(), "books", term1960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1901, args);
    }

};


