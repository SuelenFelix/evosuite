package com.innova.dto;

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
import static com.innova.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProductDto_ProductDtoBuilder_toString_162667634511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term903;

    public ProductDto_ProductDtoBuilder_toString_162667634511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term903 = newInstance(Class.forName("com.innova.dto.ProductDto$ProductDtoBuilder"));
        setField(term903, term903.getClass(), "productId", null);
        setField(term903, term903.getClass(), "productName", null);
        setDoubleField(term903, term903.getClass(), "productPrice", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.ProductDto$ProductDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term903, args);
    }

};


