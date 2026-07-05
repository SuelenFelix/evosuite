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

public class UpdateOrganizationResponse_getPhone_78498049112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5234;

    public UpdateOrganizationResponse_getPhone_78498049112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5234 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term5295 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term5234, term5234.getClass(), "name", "riMtzCoxNj");
        setField(term5234, term5234.getClass(), "imageUrl", "YAXkVjQZcV");
        setField(term5234, term5234.getClass(), "address", "pumvwBWvpy");
        setField(term5234, term5234.getClass(), "phone", "HwLHeGLyhe");
        setField(term5234, term5234.getClass(), "email", "RDnkgWkcbz");
        setField(term5295, term5295.getClass(), "facebookUrl", "IBpaxltauX");
        setField(term5295, term5295.getClass(), "linkedInUrl", "hePqROaplw");
        setField(term5295, term5295.getClass(), "instagramUrl", "PJcSNDruWd");
        setField(term5234, term5234.getClass(), "socialMedia", term5295);
        setField(term5234, term5234.getClass(), "aboutUsText", "VVNNlAePXF");
        setField(term5234, term5234.getClass(), "welcomeText", "jnwVnmKAFv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term5234, args);
    }

};


