package com.alkemy.ong.infrastructure.rest.mapper.organization;

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
import static com.alkemy.ong.infrastructure.rest.mapper.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetOrganizationMapper_toResponse_6308483942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term772;

    public GetOrganizationMapper_toResponse_6308483942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term772 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.GetOrganizationMapper"));
        setField(term772, term772.getClass(), "slideWithTextMapper", null);
        setField(term772, term772.getClass(), "socialMediaMapper", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.GetOrganizationMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Organization");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toResponse", argTypes, term772, args);
    }

};


