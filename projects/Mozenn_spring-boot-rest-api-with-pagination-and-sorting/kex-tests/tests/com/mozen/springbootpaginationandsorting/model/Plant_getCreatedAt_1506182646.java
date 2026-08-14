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

public class Plant_getCreatedAt_1506182646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;

    public Plant_getCreatedAt_1506182646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term390 = new Long(5270370404989704783L);
        term389 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term428 = newInstance(Class.forName("java.time.Instant"));
        setField(term389, term389.getClass(), "id", term390);
        setField(term389, term389.getClass(), "name", "aJlieCFVtF");
        setField(term389, term389.getClass(), "scientificName", "ZiaGIbnzTs");
        setField(term389, term389.getClass(), "family", "tbcdzjIfER");
        setLongField(term428, term428.getClass(), "seconds", 1786438250L);
        setIntField(term428, term428.getClass(), "nanos", 275572000);
        setField(term389, term389.getClass(), "createdAt", term428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term389, args);
    }

};


