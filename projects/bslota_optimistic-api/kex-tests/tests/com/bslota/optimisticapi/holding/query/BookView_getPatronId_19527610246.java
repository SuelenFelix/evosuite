package com.bslota.optimisticapi.holding.query;

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
import static com.bslota.optimisticapi.holding.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BookView_getPatronId_19527610246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671;

    public BookView_getPatronId_19527610246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671 = newInstance(Class.forName("com.bslota.optimisticapi.holding.query.BookView"));
        setField(term671, term671.getClass(), "id", "OWDIEULEFu");
        setField(term671, term671.getClass(), "author", "dWRymuLBtr");
        setField(term671, term671.getClass(), "title", "AijpHYOFuy");
        setField(term671, term671.getClass(), "isbn", "SbAoxhfrkn");
        setField(term671, term671.getClass(), "patronId", "kuTXqwMtDB");
        setField(term671, term671.getClass(), "status", "Ghbwtircqb");
        setLongField(term671, term671.getClass(), "version", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.query.BookView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPatronId", argTypes, term671, args);
    }

};


