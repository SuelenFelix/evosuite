package com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity;

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
import static com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ProductEntity_ProductEntityBuilder_id_9466294921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;
     Object term409;

    public ProductEntity_ProductEntityBuilder_id_9466294921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term383 = new Long(-7237588299778557629L);
        term382 = newInstance(Class.forName("com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity.ProductEntity$ProductEntityBuilder"));
        setField(term382, term382.getClass(), "id", term383);
        setField(term382, term382.getClass(), "name", "ZiaGIbnzTs");
        setField(term382, term382.getClass(), "description", "tbcdzjIfER");
        term409 = new Long(6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity.ProductEntity$ProductEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term409;
        callMethod(klass, "id", argTypes, term382, args);
    }

};


