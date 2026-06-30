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

public class CreateCategoryResponse_getDescription_17333220742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1737;

    public CreateCategoryResponse_getDescription_17333220742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1738 = new Long(6617340557564669657L);
        term1737 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.CreateCategoryResponse"));
        setField(term1737, term1737.getClass(), "id", term1738);
        setField(term1737, term1737.getClass(), "name", "ZVecLZMLHF");
        setField(term1737, term1737.getClass(), "description", "fztQhjqwdP");
        setField(term1737, term1737.getClass(), "image", "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.CreateCategoryResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term1737, args);
    }

};


