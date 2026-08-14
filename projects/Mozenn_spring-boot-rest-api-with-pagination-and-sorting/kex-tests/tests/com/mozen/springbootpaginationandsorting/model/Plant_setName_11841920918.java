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

public class Plant_setName_11841920918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535;

    public Plant_setName_11841920918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term536 = new Long(6811161968424632369L);
        term535 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term574 = newInstance(Class.forName("java.time.Instant"));
        setField(term535, term535.getClass(), "id", term536);
        setField(term535, term535.getClass(), "name", "RkybSrpybU");
        setField(term535, term535.getClass(), "scientificName", "xOEqzGAmDU");
        setField(term535, term535.getClass(), "family", "eZFUvlxvGV");
        setLongField(term574, term574.getClass(), "seconds", 1786438250L);
        setIntField(term574, term574.getClass(), "nanos", 367497000);
        setField(term535, term535.getClass(), "createdAt", term574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "setName", argTypes, term535, args);
    }

};


