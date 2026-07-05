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

public class Category_setDescription_16608048888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15633;

    public Category_setDescription_16608048888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15634 = new Long(1193381106528373019L);
        term15633 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term15633, term15633.getClass(), "id", term15634);
        setField(term15633, term15633.getClass(), "name", "cHZGcMhatT");
        setField(term15633, term15633.getClass(), "description", "OZGyrUPedG");
        setField(term15633, term15633.getClass(), "imageUrl", "GAxMzRqmXU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XMhUDGKSWO";
        callMethod(klass, "setDescription", argTypes, term15633, args);
    }

};


