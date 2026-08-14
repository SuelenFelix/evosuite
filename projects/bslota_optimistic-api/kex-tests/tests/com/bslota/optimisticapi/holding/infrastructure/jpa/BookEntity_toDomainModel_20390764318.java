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

public class BookEntity_toDomainModel_20390764318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2838;

    public BookEntity_toDomainModel_20390764318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2931 = Class.forName((String) "com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntityStatus");
        Field term2930 = ((Class) term2931).getDeclaredField((String) "PLACED_ON_HOLD");
        ((Field) term2930).setAccessible(true);
        Object enum6 = ((Field) term2930).get((Object) null);
        term2838 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity"));
        Object term2839 = newInstance(Class.forName("java.util.UUID"));
        Object term2878 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term2839, term2839.getClass(), "mostSigBits", 2486810210675247493L);
        setLongField(term2839, term2839.getClass(), "leastSigBits", 7009926388951271268L);
        setField(term2838, term2838.getClass(), "id", term2839);
        setField(term2838, term2838.getClass(), "title", "HyxfbSQYBe");
        setField(term2838, term2838.getClass(), "author", "pCTimMblYc");
        setField(term2838, term2838.getClass(), "isbn", "hNxWaHcfhY");
        setLongField(term2878, term2878.getClass(), "mostSigBits", -7672528020740371001L);
        setLongField(term2878, term2878.getClass(), "leastSigBits", -4502405999831680926L);
        setField(term2838, term2838.getClass(), "patronId", term2878);
        setField(term2838, term2838.getClass(), "status", enum6);
        setLongField(term2838, term2838.getClass(), "version", 4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toDomainModel", argTypes, term2838, args);
    }

};


