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

public class UpdateOrganizationRequest_setName_15185886089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1777;

    public UpdateOrganizationRequest_setName_15185886089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1777 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term1838 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1777, term1777.getClass(), "name", "idgaQsnJpQ");
        setField(term1777, term1777.getClass(), "imageUrl", "VgZnGoIFwQ");
        setField(term1777, term1777.getClass(), "address", "jUbSRrkrYZ");
        setField(term1777, term1777.getClass(), "phone", "bWWfajKbEX");
        setField(term1777, term1777.getClass(), "email", "cAPeiZHKGJ");
        setField(term1838, term1838.getClass(), "facebookUrl", "LvJFtLBaxj");
        setField(term1838, term1838.getClass(), "linkedInUrl", "PHvxnGHptP");
        setField(term1838, term1838.getClass(), "instagramUrl", "TimdotUuNC");
        setField(term1777, term1777.getClass(), "socialMedia", term1838);
        setField(term1777, term1777.getClass(), "aboutUsText", "PkWMRdJcBb");
        setField(term1777, term1777.getClass(), "welcomeText", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        callMethod(klass, "setName", argTypes, term1777, args);
    }

};


