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

public class ProductDto_ProductDtoBuilder_productId_15081691891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;
     Object term753;

    public ProductDto_ProductDtoBuilder_productId_15081691891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term738 = new Long(2442117782898005296L);
        term737 = newInstance(Class.forName("com.innova.dto.ProductDto$ProductDtoBuilder"));
        setField(term737, term737.getClass(), "productId", term738);
        setField(term737, term737.getClass(), "productName", "AijpHYOFuy");
        setDoubleField(term737, term737.getClass(), "productPrice", 0.13238746331190498);
        term753 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.ProductDto$ProductDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term753;
        callMethod(klass, "productId", argTypes, term737, args);
    }

};


