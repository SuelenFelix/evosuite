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

public class UpdateOrganizationResponse_setSocialMedia_101113558123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6349;

    public UpdateOrganizationResponse_setSocialMedia_101113558123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6349 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        setField(term6349, term6349.getClass(), "name", null);
        setField(term6349, term6349.getClass(), "imageUrl", null);
        setField(term6349, term6349.getClass(), "address", null);
        setField(term6349, term6349.getClass(), "phone", null);
        setField(term6349, term6349.getClass(), "email", null);
        setField(term6349, term6349.getClass(), "socialMedia", null);
        setField(term6349, term6349.getClass(), "aboutUsText", null);
        setField(term6349, term6349.getClass(), "welcomeText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSocialMedia", argTypes, term6349, args);
    }

};


