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

public class UpdateOrganizationUseCaseService_changeSocialMediaFieldsNotNull_11784566652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795;
     Object term796;
     Object term833;

    public UpdateOrganizationUseCaseService_changeSocialMediaFieldsNotNull_11784566652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term795 = newInstance(Class.forName("com.alkemy.ong.application.service.organization.UpdateOrganizationUseCaseService"));
        setField(term795, term795.getClass(), "organizationRepository", null);
        term796 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term796, term796.getClass(), "facebookUrl", "OWKQODBLzb");
        setField(term796, term796.getClass(), "linkedInUrl", "wGmYcqUkgE");
        setField(term796, term796.getClass(), "instagramUrl", "idgaQsnJpQ");
        term833 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term833, term833.getClass(), "facebookUrl", "VgZnGoIFwQ");
        setField(term833, term833.getClass(), "linkedInUrl", "jUbSRrkrYZ");
        setField(term833, term833.getClass(), "instagramUrl", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.organization.UpdateOrganizationUseCaseService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.SocialMedia");
        argTypes[1] = Class.forName("com.alkemy.ong.domain.SocialMedia");
        Object[] args = new Object[2];
        args[0] = term796;
        args[1] = term833;
        callMethod(klass, "changeSocialMediaFieldsNotNull", argTypes, term795, args);
    }

};


