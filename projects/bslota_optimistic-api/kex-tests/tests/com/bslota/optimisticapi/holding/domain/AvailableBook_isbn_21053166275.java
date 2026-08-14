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

public class AvailableBook_isbn_21053166275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1386;

    public AvailableBook_isbn_21053166275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1386 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook"));
        Object term1387 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term1388 = newInstance(Class.forName("java.util.UUID"));
        Object term1391 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term1404 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term1417 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term1430 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term1388, term1388.getClass(), "mostSigBits", 4784595517102746672L);
        setLongField(term1388, term1388.getClass(), "leastSigBits", -7612550318181586304L);
        setField(term1387, term1387.getClass(), "value", term1388);
        setField(term1386, term1386.getClass(), "id", term1387);
        setField(term1391, term1391.getClass(), "name", "onpbIeEKoi");
        setField(term1386, term1386.getClass(), "author", term1391);
        setField(term1404, term1404.getClass(), "title", "YRHGsAkhxb");
        setField(term1386, term1386.getClass(), "title", term1404);
        setField(term1417, term1417.getClass(), "value", "ffYhPOzlUs");
        setField(term1386, term1386.getClass(), "isbn", term1417);
        setLongField(term1430, term1430.getClass(), "value", -5476826692763582090L);
        setField(term1386, term1386.getClass(), "version", term1430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isbn", argTypes, term1386, args);
    }

};


