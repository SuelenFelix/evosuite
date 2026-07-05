package com.alkemy.ong.infrastructure.rest.response.activity;

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
import static com.alkemy.ong.infrastructure.rest.response.activity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CreateActivityResponse_setId_12227085104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term905;
     Object term944;

    public CreateActivityResponse_setId_12227085104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term906 = new Long(2535595959091595249L);
        term905 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.CreateActivityResponse"));
        setField(term905, term905.getClass(), "id", term906);
        setField(term905, term905.getClass(), "name", "aKnKipADSo");
        setField(term905, term905.getClass(), "content", "wSQxaModmm");
        setField(term905, term905.getClass(), "imageUrl", "UlajhuVLaP");
        term944 = new Long(-5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.CreateActivityResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term944;
        callMethod(klass, "setId", argTypes, term905, args);
    }

};


