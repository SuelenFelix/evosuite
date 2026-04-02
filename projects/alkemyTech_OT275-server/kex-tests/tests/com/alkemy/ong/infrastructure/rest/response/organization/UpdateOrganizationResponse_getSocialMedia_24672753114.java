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
import java.lang.Object;

public class UpdateOrganizationResponse_getSocialMedia_24672753114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5678;

    public UpdateOrganizationResponse_getSocialMedia_24672753114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5678 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term5739 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term5678, term5678.getClass(), "name", "aanyiAOJCl");
        setField(term5678, term5678.getClass(), "imageUrl", "VDokbsCuqq");
        setField(term5678, term5678.getClass(), "address", "xClUIcPECX");
        setField(term5678, term5678.getClass(), "phone", "avhRaGZaBF");
        setField(term5678, term5678.getClass(), "email", "JkgoRtImdE");
        setField(term5739, term5739.getClass(), "facebookUrl", "qFGKIJjlmV");
        setField(term5739, term5739.getClass(), "linkedInUrl", "IHqvyhMtuM");
        setField(term5739, term5739.getClass(), "instagramUrl", "dAldIGYAXV");
        setField(term5678, term5678.getClass(), "socialMedia", term5739);
        setField(term5678, term5678.getClass(), "aboutUsText", "mLwibAPEsa");
        setField(term5678, term5678.getClass(), "welcomeText", "zsWKWiTFuo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSocialMedia", argTypes, term5678, args);
    }

};


