package com.bslota.optimisticapi.holding.infrastructure.jpa;

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
import static com.bslota.optimisticapi.holding.infrastructure.jpa.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BookEntity_getTitle_13419251604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term954;

    public BookEntity_getTitle_13419251604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1042 = Class.forName((String) "com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntityStatus");
        Field term1041 = ((Class) term1042).getDeclaredField((String) "AVAILABLE");
        ((Field) term1041).setAccessible(true);
        Object enum2 = ((Field) term1041).get((Object) null);
        term954 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity"));
        Object term955 = newInstance(Class.forName("java.util.UUID"));
        Object term994 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term955, term955.getClass(), "mostSigBits", -7237588299778557629L);
        setLongField(term955, term955.getClass(), "leastSigBits", 6967924379644551255L);
        setField(term954, term954.getClass(), "id", term955);
        setField(term954, term954.getClass(), "title", "SzjVpOQTyS");
        setField(term954, term954.getClass(), "author", "MjGYSRKTNF");
        setField(term954, term954.getClass(), "isbn", "hRNSzYYIrc");
        setLongField(term994, term994.getClass(), "mostSigBits", -2813493605142626659L);
        setLongField(term994, term994.getClass(), "leastSigBits", -8885298608300233488L);
        setField(term954, term954.getClass(), "patronId", term994);
        setField(term954, term954.getClass(), "status", enum2);
        setLongField(term954, term954.getClass(), "version", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term954, args);
    }

};


