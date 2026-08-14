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

public class BookEntity_getStatus_11014109057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2357;

    public BookEntity_getStatus_11014109057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2450 = Class.forName((String) "com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntityStatus");
        Field term2449 = ((Class) term2450).getDeclaredField((String) "PLACED_ON_HOLD");
        ((Field) term2449).setAccessible(true);
        Object enum5 = ((Field) term2449).get((Object) null);
        term2357 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity"));
        Object term2358 = newInstance(Class.forName("java.util.UUID"));
        Object term2397 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term2358, term2358.getClass(), "mostSigBits", 8428634514691209827L);
        setLongField(term2358, term2358.getClass(), "leastSigBits", -2585684163342970173L);
        setField(term2357, term2357.getClass(), "id", term2358);
        setField(term2357, term2357.getClass(), "title", "aJlieCFVtF");
        setField(term2357, term2357.getClass(), "author", "ZiaGIbnzTs");
        setField(term2357, term2357.getClass(), "isbn", "tbcdzjIfER");
        setLongField(term2397, term2397.getClass(), "mostSigBits", 8059786003080744426L);
        setLongField(term2397, term2397.getClass(), "leastSigBits", -4365849114644724155L);
        setField(term2357, term2357.getClass(), "patronId", term2397);
        setField(term2357, term2357.getClass(), "status", enum5);
        setLongField(term2357, term2357.getClass(), "version", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term2357, args);
    }

};


