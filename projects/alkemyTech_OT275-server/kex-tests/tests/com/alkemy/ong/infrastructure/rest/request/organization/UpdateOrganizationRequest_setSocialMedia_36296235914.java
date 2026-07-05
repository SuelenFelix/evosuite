package com.alkemy.ong.infrastructure.rest.request.organization;

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
import static com.alkemy.ong.infrastructure.rest.request.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UpdateOrganizationRequest_setSocialMedia_36296235914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2997;
     Object term3119;

    public UpdateOrganizationRequest_setSocialMedia_36296235914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2997 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term3058 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term2997, term2997.getClass(), "name", "fWKJoSoCwE");
        setField(term2997, term2997.getClass(), "imageUrl", "wfaXBpWAUH");
        setField(term2997, term2997.getClass(), "address", "VMeAzAHwZj");
        setField(term2997, term2997.getClass(), "phone", "PznxWXsZME");
        setField(term2997, term2997.getClass(), "email", "ZzIujlwVsw");
        setField(term3058, term3058.getClass(), "facebookUrl", "LWyEaeIyAo");
        setField(term3058, term3058.getClass(), "linkedInUrl", "yVMkkQhvmN");
        setField(term3058, term3058.getClass(), "instagramUrl", "mvrkADEgpp");
        setField(term2997, term2997.getClass(), "socialMedia", term3058);
        setField(term2997, term2997.getClass(), "aboutUsText", "pXOkjyeIRb");
        setField(term2997, term2997.getClass(), "welcomeText", "GgZWSjxjyE");
        term3119 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term3119, term3119.getClass(), "facebookUrl", "EeBVbzjcCI");
        setField(term3119, term3119.getClass(), "linkedInUrl", "UfQtPRyWRC");
        setField(term3119, term3119.getClass(), "instagramUrl", "FPvxVzzSvD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest");
        Object[] args = new Object[1];
        args[0] = term3119;
        callMethod(klass, "setSocialMedia", argTypes, term2997, args);
    }

};


