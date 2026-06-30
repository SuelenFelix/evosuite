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

public class UpdateOrganizationRequest_setWelcomeText_116501744016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3530;

    public UpdateOrganizationRequest_setWelcomeText_116501744016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3530 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term3591 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term3530, term3530.getClass(), "name", "hMmaoREuCK");
        setField(term3530, term3530.getClass(), "imageUrl", "VeDtgDzGAN");
        setField(term3530, term3530.getClass(), "address", "aWYOWZFyaX");
        setField(term3530, term3530.getClass(), "phone", "BRIVNtfUWU");
        setField(term3530, term3530.getClass(), "email", "DbiCVtPPCT");
        setField(term3591, term3591.getClass(), "facebookUrl", "WzFopsaDuG");
        setField(term3591, term3591.getClass(), "linkedInUrl", "PapWxkhEWe");
        setField(term3591, term3591.getClass(), "instagramUrl", "smnHEqRFRx");
        setField(term3530, term3530.getClass(), "socialMedia", term3591);
        setField(term3530, term3530.getClass(), "aboutUsText", "XYtryyobou");
        setField(term3530, term3530.getClass(), "welcomeText", "OYbzXylRWW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DSNsTGYXDF";
        callMethod(klass, "setWelcomeText", argTypes, term3530, args);
    }

};


