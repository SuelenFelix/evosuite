package com.alkemy.ong.infrastructure.rest.mapper.common;

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
import static com.alkemy.ong.infrastructure.rest.mapper.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SocialMediaMapper_toDomain_8489357611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public SocialMediaMapper_toDomain_8489357611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        term2 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term2, term2.getClass(), "facebookUrl", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "linkedInUrl", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "instagramUrl", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "toDomain", argTypes, term1, args);
    }

};


