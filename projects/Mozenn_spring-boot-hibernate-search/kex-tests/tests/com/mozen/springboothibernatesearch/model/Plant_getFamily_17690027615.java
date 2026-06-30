package com.mozen.springboothibernatesearch.model;

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
import static com.mozen.springboothibernatesearch.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_getFamily_17690027615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;

    public Plant_getFamily_17690027615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term284 = new Long(-8400487765614892086L);
        term283 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.Plant"));
        Object term322 = newInstance(Class.forName("java.time.Instant"));
        setField(term283, term283.getClass(), "id", term284);
        setField(term283, term283.getClass(), "name", "MxlszYVzRf");
        setField(term283, term283.getClass(), "scientificName", "LQFpaHEwXR");
        setField(term283, term283.getClass(), "family", "oVcInYnLWB");
        setLongField(term322, term322.getClass(), "seconds", 1782719421L);
        setIntField(term322, term322.getClass(), "nanos", 605402000);
        setField(term283, term283.getClass(), "createdAt", term322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFamily", argTypes, term283, args);
    }

};


