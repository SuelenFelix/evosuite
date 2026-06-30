package com.alkemy.ong.infrastructure.rest.response.common;

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
import static com.alkemy.ong.infrastructure.rest.response.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SocialMediaResponse_setLinkedInUrl_197656748512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1026;

    public SocialMediaResponse_setLinkedInUrl_197656748512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1026 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term1026, term1026.getClass(), "facebookUrl", null);
        setField(term1026, term1026.getClass(), "linkedInUrl", null);
        setField(term1026, term1026.getClass(), "instagramUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLinkedInUrl", argTypes, term1026, args);
    }

};


