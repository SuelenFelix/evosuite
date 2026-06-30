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

public class UpdateOrganizationResponse_setAddress_3970613293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3059;

    public UpdateOrganizationResponse_setAddress_3970613293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3059 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term3120 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term3059, term3059.getClass(), "name", "NzBMMhkhpT");
        setField(term3059, term3059.getClass(), "imageUrl", "qCpEbQDHdF");
        setField(term3059, term3059.getClass(), "address", "AHbZyFOmlo");
        setField(term3059, term3059.getClass(), "phone", "TwfWVQGiIj");
        setField(term3059, term3059.getClass(), "email", "gUvcueTURF");
        setField(term3120, term3120.getClass(), "facebookUrl", "EwQBhZjCIT");
        setField(term3120, term3120.getClass(), "linkedInUrl", "aSkmSwTnEw");
        setField(term3120, term3120.getClass(), "instagramUrl", "xvkbvaEGYd");
        setField(term3059, term3059.getClass(), "socialMedia", term3120);
        setField(term3059, term3059.getClass(), "aboutUsText", "HBGNxdNURv");
        setField(term3059, term3059.getClass(), "welcomeText", "mfCpTPPQQm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OcJCIDNIXA";
        callMethod(klass, "setAddress", argTypes, term3059, args);
    }

};


