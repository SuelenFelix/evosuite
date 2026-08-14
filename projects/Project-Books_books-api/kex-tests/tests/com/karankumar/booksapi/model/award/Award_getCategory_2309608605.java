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

public class Award_getCategory_2309608605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2592;

    public Award_getCategory_2309608605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2593 = new Long(5907001541142728739L);
        Class<? extends Object> term2673 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term2672 = ((Class) term2673).getDeclaredField((String) "BOOKER_INTER_PRIZE");
        ((Field) term2672).setAccessible(true);
        Object enum5 = ((Field) term2672).get((Object) null);
        HashMap term2667 = new HashMap();
        Set<Object> term2968 =  ((Map) term2667).keySet();
        HashSet term2666 = new HashSet((Collection<? extends Object>) term2968);
        term2592 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term2592, term2592.getClass(), "id", term2593);
        setField(term2592, term2592.getClass(), "awardName", enum5);
        setField(term2592, term2592.getClass(), "category", "MAcUBcBckh");
        setIntField(term2592, term2592.getClass(), "year", -616727354);
        setField(term2592, term2592.getClass(), "books", term2666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term2592, args);
    }

};


