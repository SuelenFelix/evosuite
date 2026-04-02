package com.mozen.springbootkeycloack.model;

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
import static com.mozen.springbootkeycloack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_setName_17275538568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;

    public Plant_setName_17275538568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term502 = new Long(6811161968424632369L);
        term501 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term540 = newInstance(Class.forName("java.time.Instant"));
        setField(term501, term501.getClass(), "id", term502);
        setField(term501, term501.getClass(), "name", "RkybSrpybU");
        setField(term501, term501.getClass(), "scientificName", "xOEqzGAmDU");
        setField(term501, term501.getClass(), "family", "eZFUvlxvGV");
        setLongField(term540, term540.getClass(), "seconds", 1775105657L);
        setIntField(term540, term540.getClass(), "nanos", 113805000);
        setField(term501, term501.getClass(), "createdAt", term540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "setName", argTypes, term501, args);
    }

};


