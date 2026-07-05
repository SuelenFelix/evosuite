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

public class UpdateOrganizationRequest_getName_2012879601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UpdateOrganizationRequest_getName_2012879601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term62 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "imageUrl", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "address", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "phone", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "email", "jJCZpVmanW");
        setField(term62, term62.getClass(), "facebookUrl", "EGtDIRbSSb");
        setField(term62, term62.getClass(), "linkedInUrl", "SzjVpOQTyS");
        setField(term62, term62.getClass(), "instagramUrl", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "socialMedia", term62);
        setField(term1, term1.getClass(), "aboutUsText", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "welcomeText", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1, args);
    }

};


