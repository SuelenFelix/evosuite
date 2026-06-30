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

public class UpdateOrganizationRequest_setImageUrl_11433856910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2021;

    public UpdateOrganizationRequest_setImageUrl_11433856910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2021 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term2082 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term2021, term2021.getClass(), "name", "xOcJIiQQDu");
        setField(term2021, term2021.getClass(), "imageUrl", "GVizqqzXpy");
        setField(term2021, term2021.getClass(), "address", "JqXGgAhZPl");
        setField(term2021, term2021.getClass(), "phone", "jiKYgYHqIS");
        setField(term2021, term2021.getClass(), "email", "DfISiziTgG");
        setField(term2082, term2082.getClass(), "facebookUrl", "XqgfKFvPSD");
        setField(term2082, term2082.getClass(), "linkedInUrl", "JiVRgTZvKc");
        setField(term2082, term2082.getClass(), "instagramUrl", "XPKmummaqg");
        setField(term2021, term2021.getClass(), "socialMedia", term2082);
        setField(term2021, term2021.getClass(), "aboutUsText", "BKLfkLiZTH");
        setField(term2021, term2021.getClass(), "welcomeText", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        callMethod(klass, "setImageUrl", argTypes, term2021, args);
    }

};


