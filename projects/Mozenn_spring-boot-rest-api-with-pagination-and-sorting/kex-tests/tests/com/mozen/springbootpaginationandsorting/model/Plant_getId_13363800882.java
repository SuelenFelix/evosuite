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

public class Plant_getId_13363800882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;

    public Plant_getId_13363800882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term102 = new Long(2442117782898005296L);
        term101 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term140 = newInstance(Class.forName("java.time.Instant"));
        setField(term101, term101.getClass(), "id", term102);
        setField(term101, term101.getClass(), "name", "xxtlPwDYFs");
        setField(term101, term101.getClass(), "scientificName", "jJCZpVmanW");
        setField(term101, term101.getClass(), "family", "EGtDIRbSSb");
        setLongField(term140, term140.getClass(), "seconds", 1786438250L);
        setIntField(term140, term140.getClass(), "nanos", 98990000);
        setField(term101, term101.getClass(), "createdAt", term140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term101, args);
    }

};


