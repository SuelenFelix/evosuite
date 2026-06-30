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

public class UpdateOrganizationResponse_setEmail_6812195915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3547;

    public UpdateOrganizationResponse_setEmail_6812195915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3547 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term3608 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term3547, term3547.getClass(), "name", "WVRMUmrljA");
        setField(term3547, term3547.getClass(), "imageUrl", "NTlKJDDWlk");
        setField(term3547, term3547.getClass(), "address", "vOuMEpOQAg");
        setField(term3547, term3547.getClass(), "phone", "SIODFGaQhr");
        setField(term3547, term3547.getClass(), "email", "qYzsiuXOgS");
        setField(term3608, term3608.getClass(), "facebookUrl", "bxrCBbrrct");
        setField(term3608, term3608.getClass(), "linkedInUrl", "CKWpJaaaxX");
        setField(term3608, term3608.getClass(), "instagramUrl", "UBRmXJmfrt");
        setField(term3547, term3547.getClass(), "socialMedia", term3608);
        setField(term3547, term3547.getClass(), "aboutUsText", "WZzvmIHhzZ");
        setField(term3547, term3547.getClass(), "welcomeText", "doQLHkjpNm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lCyLIcSuom";
        callMethod(klass, "setEmail", argTypes, term3547, args);
    }

};


