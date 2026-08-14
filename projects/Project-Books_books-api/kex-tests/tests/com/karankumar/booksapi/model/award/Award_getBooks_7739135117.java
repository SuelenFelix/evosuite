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

public class Award_getBooks_7739135117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3316;

    public Award_getBooks_7739135117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3317 = new Long(-2068172595987555756L);
        Class<? extends Object> term3388 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term3387 = ((Class) term3388).getDeclaredField((String) "DYLAN_PRIZE");
        ((Field) term3387).setAccessible(true);
        Object enum7 = ((Field) term3387).get((Object) null);
        HashMap term3382 = new HashMap();
        Set<Object> term3662 =  ((Map) term3382).keySet();
        HashSet term3381 = new HashSet((Collection<? extends Object>) term3662);
        term3316 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term3316, term3316.getClass(), "id", term3317);
        setField(term3316, term3316.getClass(), "awardName", enum7);
        setField(term3316, term3316.getClass(), "category", "vQVyKLdtaz");
        setIntField(term3316, term3316.getClass(), "year", -2038273078);
        setField(term3316, term3316.getClass(), "books", term3381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBooks", argTypes, term3316, args);
    }

};


