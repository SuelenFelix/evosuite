package com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response;

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
import static com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ProductResponse_ProductResponseBuilder_toString_20143015045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235;

    public ProductResponse_ProductResponseBuilder_toString_20143015045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236 = new Long(7411271909051562686L);
        term235 = newInstance(Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response.ProductResponse$ProductResponseBuilder"));
        setField(term235, term235.getClass(), "id", term236);
        setField(term235, term235.getClass(), "name", "NRdvgJlhkX");
        setField(term235, term235.getClass(), "description", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response.ProductResponse$ProductResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term235, args);
    }

};


