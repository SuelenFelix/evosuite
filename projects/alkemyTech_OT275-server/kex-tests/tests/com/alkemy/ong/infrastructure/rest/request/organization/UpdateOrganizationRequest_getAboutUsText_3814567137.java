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

public class UpdateOrganizationRequest_getAboutUsText_3814567137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1333;

    public UpdateOrganizationRequest_getAboutUsText_3814567137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1333 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term1394 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1333, term1333.getClass(), "name", "ieCtQFdkii");
        setField(term1333, term1333.getClass(), "imageUrl", "dEnhdmILtU");
        setField(term1333, term1333.getClass(), "address", "hoicvmsovO");
        setField(term1333, term1333.getClass(), "phone", "eqJfYWRaEL");
        setField(term1333, term1333.getClass(), "email", "fhkbdRViHi");
        setField(term1394, term1394.getClass(), "facebookUrl", "uWHnvSvaPl");
        setField(term1394, term1394.getClass(), "linkedInUrl", "kBdSllIBVz");
        setField(term1394, term1394.getClass(), "instagramUrl", "TJmVBGfTML");
        setField(term1333, term1333.getClass(), "socialMedia", term1394);
        setField(term1333, term1333.getClass(), "aboutUsText", "tPlsykYBqO");
        setField(term1333, term1333.getClass(), "welcomeText", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAboutUsText", argTypes, term1333, args);
    }

};


