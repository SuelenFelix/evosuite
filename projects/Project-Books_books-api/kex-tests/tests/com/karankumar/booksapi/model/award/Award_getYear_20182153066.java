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

public class Award_getYear_20182153066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2969;

    public Award_getYear_20182153066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2970 = new Long(4178434741742309755L);
        Class<? extends Object> term3041 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term3040 = ((Class) term3041).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term3040).setAccessible(true);
        Object enum6 = ((Field) term3040).get((Object) null);
        HashMap term3035 = new HashMap();
        Set<Object> term3315 =  ((Map) term3035).keySet();
        HashSet term3034 = new HashSet((Collection<? extends Object>) term3315);
        term2969 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term2969, term2969.getClass(), "id", term2970);
        setField(term2969, term2969.getClass(), "awardName", enum6);
        setField(term2969, term2969.getClass(), "category", "oVgzLbrsFr");
        setIntField(term2969, term2969.getClass(), "year", -1955890973);
        setField(term2969, term2969.getClass(), "books", term3034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYear", argTypes, term2969, args);
    }

};


