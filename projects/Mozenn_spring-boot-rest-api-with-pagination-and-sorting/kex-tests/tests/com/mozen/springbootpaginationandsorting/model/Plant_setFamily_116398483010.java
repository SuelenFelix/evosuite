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

public class Plant_setFamily_116398483010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;

    public Plant_setFamily_116398483010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term724 = new Long(6967924379644551255L);
        term723 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term762 = newInstance(Class.forName("java.time.Instant"));
        setField(term723, term723.getClass(), "id", term724);
        setField(term723, term723.getClass(), "name", "TEParAifyi");
        setField(term723, term723.getClass(), "scientificName", "OWDIEULEFu");
        setField(term723, term723.getClass(), "family", "dWRymuLBtr");
        setLongField(term762, term762.getClass(), "seconds", 1786438250L);
        setIntField(term762, term762.getClass(), "nanos", 461581000);
        setField(term723, term723.getClass(), "createdAt", term762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AijpHYOFuy";
        callMethod(klass, "setFamily", argTypes, term723, args);
    }

};


