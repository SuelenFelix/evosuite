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

public class Plant_hashCode_126155123015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1110;

    public Plant_hashCode_126155123015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1111 = new Long(-5476826692763582090L);
        term1110 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term1149 = newInstance(Class.forName("java.time.Instant"));
        setField(term1110, term1110.getClass(), "id", term1111);
        setField(term1110, term1110.getClass(), "name", "GzFkzHGYFt");
        setField(term1110, term1110.getClass(), "scientificName", "tShwQLRGNe");
        setField(term1110, term1110.getClass(), "family", "LvtrsXUliU");
        setLongField(term1149, term1149.getClass(), "seconds", 1786438250L);
        setIntField(term1149, term1149.getClass(), "nanos", 690606000);
        setField(term1110, term1110.getClass(), "createdAt", term1149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1110, args);
    }

};


