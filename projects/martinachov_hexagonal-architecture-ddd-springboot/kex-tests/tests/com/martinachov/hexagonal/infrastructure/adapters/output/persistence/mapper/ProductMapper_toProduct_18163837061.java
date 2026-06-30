package com.martinachov.hexagonal.infrastructure.adapters.output.persistence.mapper;

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
import static com.martinachov.hexagonal.infrastructure.adapters.output.persistence.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ProductMapper_toProduct_18163837061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ProductMapper_toProduct_18163837061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        term1 = newInstance(Class.forName("com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity.ProductEntity"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "description", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.output.persistence.mapper.ProductMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity.ProductEntity");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "toProduct", argTypes, null, args);
    }

};


