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

public class BookView_getId_6481623862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public BookView_getId_6481623862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("com.bslota.optimisticapi.holding.query.BookView"));
        setField(term135, term135.getClass(), "id", "SzjVpOQTyS");
        setField(term135, term135.getClass(), "author", "MjGYSRKTNF");
        setField(term135, term135.getClass(), "title", "hRNSzYYIrc");
        setField(term135, term135.getClass(), "isbn", "RMFIsYGgne");
        setField(term135, term135.getClass(), "patronId", "NRdvgJlhkX");
        setField(term135, term135.getClass(), "status", "uuaPigETmJ");
        setLongField(term135, term135.getClass(), "version", 6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.query.BookView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term135, args);
    }

};


