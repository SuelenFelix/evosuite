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

public class Plant_setId_17664218467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461;
     Object term503;

    public Plant_setId_17664218467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term462 = new Long(7411271909051562686L);
        term461 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term500 = newInstance(Class.forName("java.time.Instant"));
        setField(term461, term461.getClass(), "id", term462);
        setField(term461, term461.getClass(), "name", "HyxfbSQYBe");
        setField(term461, term461.getClass(), "scientificName", "pCTimMblYc");
        setField(term461, term461.getClass(), "family", "hNxWaHcfhY");
        setLongField(term500, term500.getClass(), "seconds", 1786438250L);
        setIntField(term500, term500.getClass(), "nanos", 319044000);
        setField(term461, term461.getClass(), "createdAt", term500);
        term503 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term503;
        callMethod(klass, "setId", argTypes, term461, args);
    }

};


