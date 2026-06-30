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
import java.lang.Long;
import java.lang.Double;

public class ProductDto_ProductDtoBuilder_productPrice_6245037983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813;
     Object term829;

    public ProductDto_ProductDtoBuilder_productPrice_6245037983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term814 = new Long(-8400487765614892086L);
        term813 = newInstance(Class.forName("com.innova.dto.ProductDto$ProductDtoBuilder"));
        setField(term813, term813.getClass(), "productId", term814);
        setField(term813, term813.getClass(), "productName", "Ghbwtircqb");
        setDoubleField(term813, term813.getClass(), "productPrice", 0.5523635872663106);
        term829 = new Double(0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.ProductDto$ProductDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term829;
        callMethod(klass, "productPrice", argTypes, term813, args);
    }

};


