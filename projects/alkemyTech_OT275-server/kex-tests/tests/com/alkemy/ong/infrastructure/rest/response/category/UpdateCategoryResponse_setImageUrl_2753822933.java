package com.alkemy.ong.infrastructure.rest.response.category;

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
import static com.alkemy.ong.infrastructure.rest.response.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UpdateCategoryResponse_setImageUrl_2753822933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156;

    public UpdateCategoryResponse_setImageUrl_2753822933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1157 = new Long(1967728129628047933L);
        term1156 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.UpdateCategoryResponse"));
        setField(term1156, term1156.getClass(), "id", term1157);
        setField(term1156, term1156.getClass(), "name", "bWWfajKbEX");
        setField(term1156, term1156.getClass(), "description", "cAPeiZHKGJ");
        setField(term1156, term1156.getClass(), "imageUrl", "LvJFtLBaxj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.UpdateCategoryResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PHvxnGHptP";
        callMethod(klass, "setImageUrl", argTypes, term1156, args);
    }

};


