package com.alkemy.ong.infrastructure.rest.resource;

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
import static com.alkemy.ong.infrastructure.rest.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OrganizationResource_init_15571833710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;
     Object term45;

    public OrganizationResource_init_15571833710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.GetOrganizationMapper"));
        Object term43 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideWithTextMapper"));
        Object term44 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term42, term42.getClass(), "slideWithTextMapper", term43);
        setField(term42, term42.getClass(), "socialMediaMapper", term44);
        term45 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.UpdateOrganizationMapper"));
        Object term46 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term45, term45.getClass(), "socialMediaMapper", term46);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.resource.OrganizationResource");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.alkemy.ong.application.service.organization.usecase.IGetOrganizationUseCase");
        argTypes[1] = Class.forName("com.alkemy.ong.application.service.organization.usecase.IUpdateOrganizationUseCase");
        argTypes[2] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.GetOrganizationMapper");
        argTypes[3] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.UpdateOrganizationMapper");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term42;
        args[3] = term45;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


