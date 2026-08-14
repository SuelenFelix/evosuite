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

public class Award_setCategory_135538158010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4675;

    public Award_setCategory_135538158010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4676 = new Long(-7612550318181586304L);
        Class<? extends Object> term4752 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term4751 = ((Class) term4752).getDeclaredField((String) "NOBEL_PRIZE");
        ((Field) term4751).setAccessible(true);
        Object enum11 = ((Field) term4751).get((Object) null);
        HashMap term4734 = new HashMap();
        Set<Object> term5026 =  ((Map) term4734).keySet();
        HashSet term4733 = new HashSet((Collection<? extends Object>) term5026);
        term4675 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term4675, term4675.getClass(), "id", term4676);
        setField(term4675, term4675.getClass(), "awardName", enum11);
        setField(term4675, term4675.getClass(), "category", "idgaQsnJpQ");
        setIntField(term4675, term4675.getClass(), "year", 1725571209);
        setField(term4675, term4675.getClass(), "books", term4733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VgZnGoIFwQ";
        callMethod(klass, "setCategory", argTypes, term4675, args);
    }

};


