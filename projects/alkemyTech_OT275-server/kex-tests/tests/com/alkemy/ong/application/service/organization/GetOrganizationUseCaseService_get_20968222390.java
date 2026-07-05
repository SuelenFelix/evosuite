package com.alkemy.ong.application.service.organization;

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
import static com.alkemy.ong.application.service.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetOrganizationUseCaseService_get_20968222390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term933;

    public GetOrganizationUseCaseService_get_20968222390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term933 = newInstance(Class.forName("com.alkemy.ong.application.service.organization.GetOrganizationUseCaseService"));
        setField(term933, term933.getClass(), "organizationRepository", null);
        setField(term933, term933.getClass(), "slideRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.organization.GetOrganizationUseCaseService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get", argTypes, term933, args);
    }

};


