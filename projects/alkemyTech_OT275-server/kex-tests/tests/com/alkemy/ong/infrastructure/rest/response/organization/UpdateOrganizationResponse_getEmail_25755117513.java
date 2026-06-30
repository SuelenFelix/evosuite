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

public class UpdateOrganizationResponse_getEmail_25755117513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5456;

    public UpdateOrganizationResponse_getEmail_25755117513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5456 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term5517 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term5456, term5456.getClass(), "name", "TXyHhqeCjR");
        setField(term5456, term5456.getClass(), "imageUrl", "lZIgPZPgTu");
        setField(term5456, term5456.getClass(), "address", "iuCxnHGMoW");
        setField(term5456, term5456.getClass(), "phone", "GPSEWEDSTo");
        setField(term5456, term5456.getClass(), "email", "RCOqfVsRHt");
        setField(term5517, term5517.getClass(), "facebookUrl", "TSyCeEZPaT");
        setField(term5517, term5517.getClass(), "linkedInUrl", "JeZFtaqkzW");
        setField(term5517, term5517.getClass(), "instagramUrl", "vOVuNSCCLe");
        setField(term5456, term5456.getClass(), "socialMedia", term5517);
        setField(term5456, term5456.getClass(), "aboutUsText", "fzeqPnzpnt");
        setField(term5456, term5456.getClass(), "welcomeText", "RxbhrFBjkO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term5456, args);
    }

};


