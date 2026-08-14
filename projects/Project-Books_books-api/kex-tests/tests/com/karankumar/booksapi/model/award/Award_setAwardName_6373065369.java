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

public class Award_setAwardName_6373065369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4005;
     Object enum10;

    public Award_setAwardName_6373065369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4006 = new Long(4784595517102746672L);
        Class<? extends Object> term4126 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term4125 = ((Class) term4126).getDeclaredField((String) "BOOKER_PRIZE");
        ((Field) term4125).setAccessible(true);
        Object enum9 = ((Field) term4125).get((Object) null);
        HashMap term4060 = new HashMap();
        Set<Object> term4403 =  ((Map) term4060).keySet();
        HashSet term4059 = new HashSet((Collection<? extends Object>) term4403);
        term4005 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term4005, term4005.getClass(), "id", term4006);
        setField(term4005, term4005.getClass(), "awardName", enum9);
        setField(term4005, term4005.getClass(), "category", "wGmYcqUkgE");
        setIntField(term4005, term4005.getClass(), "year", -1339778481);
        setField(term4005, term4005.getClass(), "books", term4059);
        Class<? extends Object> term4405 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term4404 = ((Class) term4405).getDeclaredField((String) "BAILLIE_PRIZE");
        ((Field) term4404).setAccessible(true);
        enum10 = ((Field) term4404).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.award.AwardName");
        Object[] args = new Object[1];
        args[0] = enum10;
        callMethod(klass, "setAwardName", argTypes, term4005, args);
    }

};


