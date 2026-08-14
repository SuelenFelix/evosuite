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

public class PlacedOnHoldBook_getPatronId_10218024037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;

    public PlacedOnHoldBook_getPatronId_10218024037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term916 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook"));
        Object term917 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term918 = newInstance(Class.forName("java.util.UUID"));
        Object term921 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term934 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term947 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term960 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term961 = newInstance(Class.forName("java.util.UUID"));
        Object term964 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term918, term918.getClass(), "mostSigBits", 1967728129628047933L);
        setLongField(term918, term918.getClass(), "leastSigBits", 2120084523938730454L);
        setField(term917, term917.getClass(), "value", term918);
        setField(term916, term916.getClass(), "id", term917);
        setField(term921, term921.getClass(), "name", "xrwlQZdwCp");
        setField(term916, term916.getClass(), "author", term921);
        setField(term934, term934.getClass(), "title", "IDCWpPLRkE");
        setField(term916, term916.getClass(), "title", term934);
        setField(term947, term947.getClass(), "value", "nyiiPDVjAc");
        setField(term916, term916.getClass(), "isbn", term947);
        setLongField(term961, term961.getClass(), "mostSigBits", 6855071767938501807L);
        setLongField(term961, term961.getClass(), "leastSigBits", -5892135042702373494L);
        setField(term960, term960.getClass(), "value", term961);
        setField(term916, term916.getClass(), "patronId", term960);
        setLongField(term964, term964.getClass(), "value", -7237588299778557629L);
        setField(term916, term916.getClass(), "version", term964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPatronId", argTypes, term916, args);
    }

};


