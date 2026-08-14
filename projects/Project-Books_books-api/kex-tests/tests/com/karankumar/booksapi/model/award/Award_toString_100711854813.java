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

public class Award_toString_100711854813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5772;

    public Award_toString_100711854813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5773 = new Long(-2850532706972744550L);
        Class<? extends Object> term5831 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term5830 = ((Class) term5831).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term5830).setAccessible(true);
        Object enum14 = ((Field) term5830).get((Object) null);
        HashMap term5825 = new HashMap();
        Set<Object> term6111 =  ((Map) term5825).keySet();
        HashSet term5824 = new HashSet((Collection<? extends Object>) term6111);
        term5772 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term5772, term5772.getClass(), "id", term5773);
        setField(term5772, term5772.getClass(), "awardName", enum14);
        setField(term5772, term5772.getClass(), "category", "jiKYgYHqIS");
        setIntField(term5772, term5772.getClass(), "year", 1585847225);
        setField(term5772, term5772.getClass(), "books", term5824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5772, args);
    }

};


