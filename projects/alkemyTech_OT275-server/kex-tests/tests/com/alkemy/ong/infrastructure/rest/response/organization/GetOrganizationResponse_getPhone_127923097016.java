package com.alkemy.ong.infrastructure.rest.response.organization;

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
import static com.alkemy.ong.infrastructure.rest.response.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetOrganizationResponse_getPhone_127923097016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2561;

    public GetOrganizationResponse_getPhone_127923097016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2561 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        setField(term2561, term2561.getClass(), "name", null);
        setField(term2561, term2561.getClass(), "image", null);
        setField(term2561, term2561.getClass(), "phone", null);
        setField(term2561, term2561.getClass(), "address", null);
        setField(term2561, term2561.getClass(), "slides", null);
        setField(term2561, term2561.getClass(), "socialMedia", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term2561, args);
    }

};


