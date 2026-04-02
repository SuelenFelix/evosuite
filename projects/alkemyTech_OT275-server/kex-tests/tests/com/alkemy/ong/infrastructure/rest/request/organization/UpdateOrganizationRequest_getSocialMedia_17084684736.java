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

public class UpdateOrganizationRequest_getSocialMedia_17084684736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1111;

    public UpdateOrganizationRequest_getSocialMedia_17084684736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1111 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term1172 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1111, term1111.getClass(), "name", "nGKItKLYNC");
        setField(term1111, term1111.getClass(), "imageUrl", "UiUYnPrcCi");
        setField(term1111, term1111.getClass(), "address", "UoYtihxVaS");
        setField(term1111, term1111.getClass(), "phone", "JDswTTCZHV");
        setField(term1111, term1111.getClass(), "email", "onpbIeEKoi");
        setField(term1172, term1172.getClass(), "facebookUrl", "YRHGsAkhxb");
        setField(term1172, term1172.getClass(), "linkedInUrl", "ffYhPOzlUs");
        setField(term1172, term1172.getClass(), "instagramUrl", "MLqYREekMl");
        setField(term1111, term1111.getClass(), "socialMedia", term1172);
        setField(term1111, term1111.getClass(), "aboutUsText", "ytSBIKXogI");
        setField(term1111, term1111.getClass(), "welcomeText", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSocialMedia", argTypes, term1111, args);
    }

};


