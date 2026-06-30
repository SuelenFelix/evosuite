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

public class ProductMapper_toEntity_17511207262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;

    public ProductMapper_toEntity_17511207262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49 = new Long(6375119433582206027L);
        term48 = newInstance(Class.forName("com.martinachov.hexagonal.domain.model.Product"));
        setField(term48, term48.getClass(), "id", term49);
        setField(term48, term48.getClass(), "name", "MuLcgQHgqz");
        setField(term48, term48.getClass(), "description", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.output.persistence.mapper.ProductMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.martinachov.hexagonal.domain.model.Product");
        Object[] args = new Object[1];
        args[0] = term48;
        callMethod(klass, "toEntity", argTypes, null, args);
    }

};


