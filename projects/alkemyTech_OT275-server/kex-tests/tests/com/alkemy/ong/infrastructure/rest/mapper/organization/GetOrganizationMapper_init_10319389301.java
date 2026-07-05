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

public class GetOrganizationMapper_init_10319389301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;
     Object term771;

    public GetOrganizationMapper_init_10319389301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideWithTextMapper"));
        term771 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.GetOrganizationMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideWithTextMapper");
        argTypes[1] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper");
        Object[] args = new Object[2];
        args[0] = term770;
        args[1] = term771;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


