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

public class Plant_getFamily_6819289865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317;

    public Plant_getFamily_6819289865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term318 = new Long(-8400487765614892086L);
        term317 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term356 = newInstance(Class.forName("java.time.Instant"));
        setField(term317, term317.getClass(), "id", term318);
        setField(term317, term317.getClass(), "name", "MxlszYVzRf");
        setField(term317, term317.getClass(), "scientificName", "LQFpaHEwXR");
        setField(term317, term317.getClass(), "family", "oVcInYnLWB");
        setLongField(term356, term356.getClass(), "seconds", 1786438250L);
        setIntField(term356, term356.getClass(), "nanos", 234557000);
        setField(term317, term317.getClass(), "createdAt", term356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFamily", argTypes, term317, args);
    }

};


