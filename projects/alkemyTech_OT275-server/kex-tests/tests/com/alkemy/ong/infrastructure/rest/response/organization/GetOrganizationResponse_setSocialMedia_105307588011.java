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
import java.util.ArrayList;
import java.lang.Object;

public class GetOrganizationResponse_setSocialMedia_105307588011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2077;
     Object term2167;

    public GetOrganizationResponse_setSocialMedia_105307588011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2126 = new ArrayList();
        term2077 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse"));
        Object term2130 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term2077, term2077.getClass(), "name", "rLHAoqXgPh");
        setField(term2077, term2077.getClass(), "image", "zUlRdimJtU");
        setField(term2077, term2077.getClass(), "phone", "vwbEQQNQrx");
        setField(term2077, term2077.getClass(), "address", "xtftXXMbem");
        setField(term2077, term2077.getClass(), "slides", term2126);
        setField(term2130, term2130.getClass(), "facebookUrl", "cudZvLMQon");
        setField(term2130, term2130.getClass(), "linkedInUrl", "lihXWlGDxk");
        setField(term2130, term2130.getClass(), "instagramUrl", "JmcmxoGhIK");
        setField(term2077, term2077.getClass(), "socialMedia", term2130);
        term2167 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term2167, term2167.getClass(), "facebookUrl", "jXzmYyrnnT");
        setField(term2167, term2167.getClass(), "linkedInUrl", "igCAtimmYB");
        setField(term2167, term2167.getClass(), "instagramUrl", "DyiXbeYIaN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.GetOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse");
        Object[] args = new Object[1];
        args[0] = term2167;
        callMethod(klass, "setSocialMedia", argTypes, term2077, args);
    }

};


