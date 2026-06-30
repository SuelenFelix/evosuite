package com.martinachov.hexagonal.domain.model;

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
import static com.martinachov.hexagonal.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Product_setName_7114310245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;

    public Product_setName_7114310245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term478 = new Long(-8885298608300233488L);
        term477 = newInstance(Class.forName("com.martinachov.hexagonal.domain.model.Product"));
        setField(term477, term477.getClass(), "id", term478);
        setField(term477, term477.getClass(), "name", "hNxWaHcfhY");
        setField(term477, term477.getClass(), "description", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.domain.model.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "setName", argTypes, term477, args);
    }

};


