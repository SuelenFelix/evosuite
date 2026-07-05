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

public class UpdateOrganizationResponse_setImageUrl_13024131092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2815;

    public UpdateOrganizationResponse_setImageUrl_13024131092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2815 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term2876 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term2815, term2815.getClass(), "name", "NnpwZBUTvx");
        setField(term2815, term2815.getClass(), "imageUrl", "tlQSNgTkQX");
        setField(term2815, term2815.getClass(), "address", "PCipZnmBOF");
        setField(term2815, term2815.getClass(), "phone", "zcorEihhLK");
        setField(term2815, term2815.getClass(), "email", "GrqozDKFOk");
        setField(term2876, term2876.getClass(), "facebookUrl", "CFyoseFGLF");
        setField(term2876, term2876.getClass(), "linkedInUrl", "SFqCrhEWLm");
        setField(term2876, term2876.getClass(), "instagramUrl", "GZdcJyZntS");
        setField(term2815, term2815.getClass(), "socialMedia", term2876);
        setField(term2815, term2815.getClass(), "aboutUsText", "OIHoJeysUi");
        setField(term2815, term2815.getClass(), "welcomeText", "WXMWFDGcLB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wKWbJssZuG";
        callMethod(klass, "setImageUrl", argTypes, term2815, args);
    }

};


