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

public class UpdateOrganizationRequest_setEmail_186929413113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2753;

    public UpdateOrganizationRequest_setEmail_186929413113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2753 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term2814 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term2753, term2753.getClass(), "name", "AdxvLJhNLe");
        setField(term2753, term2753.getClass(), "imageUrl", "lHfTrWKMPk");
        setField(term2753, term2753.getClass(), "address", "JDaAnsVTGV");
        setField(term2753, term2753.getClass(), "phone", "mLUZFTfjle");
        setField(term2753, term2753.getClass(), "email", "xIeFjkHkOe");
        setField(term2814, term2814.getClass(), "facebookUrl", "SdCKLMIYnX");
        setField(term2814, term2814.getClass(), "linkedInUrl", "OJJtVNPyKZ");
        setField(term2814, term2814.getClass(), "instagramUrl", "AKNapTAfmD");
        setField(term2753, term2753.getClass(), "socialMedia", term2814);
        setField(term2753, term2753.getClass(), "aboutUsText", "xJgPlLxpgC");
        setField(term2753, term2753.getClass(), "welcomeText", "EYtfuJaxiM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gCWtLVKVVe";
        callMethod(klass, "setEmail", argTypes, term2753, args);
    }

};


