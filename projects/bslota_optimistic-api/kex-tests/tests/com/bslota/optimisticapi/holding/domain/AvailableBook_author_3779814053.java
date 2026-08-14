package com.bslota.optimisticapi.holding.domain;

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
import static com.bslota.optimisticapi.holding.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AvailableBook_author_3779814053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1234;

    public AvailableBook_author_3779814053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1234 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook"));
        Object term1235 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term1236 = newInstance(Class.forName("java.util.UUID"));
        Object term1239 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term1252 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term1265 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term1278 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term1236, term1236.getClass(), "mostSigBits", 4178434741742309755L);
        setLongField(term1236, term1236.getClass(), "leastSigBits", -2068172595987555756L);
        setField(term1235, term1235.getClass(), "value", term1236);
        setField(term1234, term1234.getClass(), "id", term1235);
        setField(term1239, term1239.getClass(), "name", "xLbjWUgOIL");
        setField(term1234, term1234.getClass(), "author", term1239);
        setField(term1252, term1252.getClass(), "title", "jDtqGUpnZN");
        setField(term1234, term1234.getClass(), "title", term1252);
        setField(term1265, term1265.getClass(), "value", "nGKItKLYNC");
        setField(term1234, term1234.getClass(), "isbn", term1265);
        setLongField(term1278, term1278.getClass(), "value", -4325723315152823407L);
        setField(term1234, term1234.getClass(), "version", term1278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "author", argTypes, term1234, args);
    }

};


