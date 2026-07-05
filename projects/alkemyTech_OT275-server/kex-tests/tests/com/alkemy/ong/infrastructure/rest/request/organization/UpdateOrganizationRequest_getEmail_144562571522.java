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

public class UpdateOrganizationRequest_getEmail_144562571522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3778;

    public UpdateOrganizationRequest_getEmail_144562571522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3778 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        setField(term3778, term3778.getClass(), "name", null);
        setField(term3778, term3778.getClass(), "imageUrl", null);
        setField(term3778, term3778.getClass(), "address", null);
        setField(term3778, term3778.getClass(), "phone", null);
        setField(term3778, term3778.getClass(), "email", null);
        setField(term3778, term3778.getClass(), "socialMedia", null);
        setField(term3778, term3778.getClass(), "aboutUsText", null);
        setField(term3778, term3778.getClass(), "welcomeText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term3778, args);
    }

};


