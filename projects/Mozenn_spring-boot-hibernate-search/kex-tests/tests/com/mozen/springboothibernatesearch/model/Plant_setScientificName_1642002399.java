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

public class Plant_setScientificName_1642002399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595;

    public Plant_setScientificName_1642002399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term596 = new Long(-7237588299778557629L);
        term595 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.Plant"));
        Object term634 = newInstance(Class.forName("java.time.Instant"));
        setField(term595, term595.getClass(), "id", term596);
        setField(term595, term595.getClass(), "name", "vrQLuWIDJX");
        setField(term595, term595.getClass(), "scientificName", "flxyYxBRtu");
        setField(term595, term595.getClass(), "family", "OclPbYPkcH");
        setLongField(term634, term634.getClass(), "seconds", 1775099878L);
        setIntField(term634, term634.getClass(), "nanos", 622255000);
        setField(term595, term595.getClass(), "createdAt", term634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "setScientificName", argTypes, term595, args);
    }

};


