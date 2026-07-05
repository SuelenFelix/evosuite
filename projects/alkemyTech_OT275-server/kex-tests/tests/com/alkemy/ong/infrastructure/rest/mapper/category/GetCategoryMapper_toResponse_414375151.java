package com.alkemy.ong.infrastructure.rest.mapper.category;

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
import static com.alkemy.ong.infrastructure.rest.mapper.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GetCategoryMapper_toResponse_414375151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;
     Object term283;

    public GetCategoryMapper_toResponse_414375151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        Long term284 = new Long(-8257434502486459194L);
        term283 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term283, term283.getClass(), "id", term284);
        setField(term283, term283.getClass(), "name", "MxlszYVzRf");
        setField(term283, term283.getClass(), "description", "LQFpaHEwXR");
        setField(term283, term283.getClass(), "imageUrl", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Category");
        Object[] args = new Object[1];
        args[0] = term283;
        callMethod(klass, "toResponse", argTypes, term282, args);
    }

};


