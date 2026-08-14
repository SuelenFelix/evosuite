package com.mozen.springbootpaginationandsorting.model;

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
import static com.mozen.springbootpaginationandsorting.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_toString_177231092012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892;

    public Plant_toString_177231092012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term893 = new Long(-8885298608300233488L);
        term892 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term931 = newInstance(Class.forName("java.time.Instant"));
        setField(term892, term892.getClass(), "id", term893);
        setField(term892, term892.getClass(), "name", "xrwlQZdwCp");
        setField(term892, term892.getClass(), "scientificName", "IDCWpPLRkE");
        setField(term892, term892.getClass(), "family", "nyiiPDVjAc");
        setLongField(term931, term931.getClass(), "seconds", 1786438250L);
        setIntField(term931, term931.getClass(), "nanos", 562702000);
        setField(term892, term892.getClass(), "createdAt", term931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term892, args);
    }

};


