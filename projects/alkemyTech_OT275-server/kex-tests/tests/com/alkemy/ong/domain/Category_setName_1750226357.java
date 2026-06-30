package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Category_setName_1750226357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15542;

    public Category_setName_1750226357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15543 = new Long(-1084263688306617320L);
        term15542 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term15542, term15542.getClass(), "id", term15543);
        setField(term15542, term15542.getClass(), "name", "yCWSlaOrSv");
        setField(term15542, term15542.getClass(), "description", "PFpWKxDIRz");
        setField(term15542, term15542.getClass(), "imageUrl", "qePuOCwoCf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vJPujDInGq";
        callMethod(klass, "setName", argTypes, term15542, args);
    }

};


