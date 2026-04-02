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

public class Plant_setId_6845099017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427;
     Object term469;

    public Plant_setId_6845099017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term428 = new Long(7411271909051562686L);
        term427 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.Plant"));
        Object term466 = newInstance(Class.forName("java.time.Instant"));
        setField(term427, term427.getClass(), "id", term428);
        setField(term427, term427.getClass(), "name", "HyxfbSQYBe");
        setField(term427, term427.getClass(), "scientificName", "pCTimMblYc");
        setField(term427, term427.getClass(), "family", "hNxWaHcfhY");
        setLongField(term466, term466.getClass(), "seconds", 1775099878L);
        setIntField(term466, term466.getClass(), "nanos", 481094000);
        setField(term427, term427.getClass(), "createdAt", term466);
        term469 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term469;
        callMethod(klass, "setId", argTypes, term427, args);
    }

};


