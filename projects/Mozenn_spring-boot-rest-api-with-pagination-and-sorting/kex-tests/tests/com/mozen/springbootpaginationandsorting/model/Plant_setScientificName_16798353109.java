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

public class Plant_setScientificName_16798353109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629;

    public Plant_setScientificName_16798353109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term630 = new Long(-7237588299778557629L);
        term629 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term668 = newInstance(Class.forName("java.time.Instant"));
        setField(term629, term629.getClass(), "id", term630);
        setField(term629, term629.getClass(), "name", "vrQLuWIDJX");
        setField(term629, term629.getClass(), "scientificName", "flxyYxBRtu");
        setField(term629, term629.getClass(), "family", "OclPbYPkcH");
        setLongField(term668, term668.getClass(), "seconds", 1786438250L);
        setIntField(term668, term668.getClass(), "nanos", 413507000);
        setField(term629, term629.getClass(), "createdAt", term668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "setScientificName", argTypes, term629, args);
    }

};


