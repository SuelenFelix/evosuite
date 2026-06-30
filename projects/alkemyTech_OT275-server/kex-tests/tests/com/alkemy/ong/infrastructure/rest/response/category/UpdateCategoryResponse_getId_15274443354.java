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

public class UpdateCategoryResponse_getId_15274443354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1247;

    public UpdateCategoryResponse_getId_15274443354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1248 = new Long(2120084523938730454L);
        term1247 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.UpdateCategoryResponse"));
        setField(term1247, term1247.getClass(), "id", term1248);
        setField(term1247, term1247.getClass(), "name", "TimdotUuNC");
        setField(term1247, term1247.getClass(), "description", "PkWMRdJcBb");
        setField(term1247, term1247.getClass(), "imageUrl", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.UpdateCategoryResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1247, args);
    }

};


