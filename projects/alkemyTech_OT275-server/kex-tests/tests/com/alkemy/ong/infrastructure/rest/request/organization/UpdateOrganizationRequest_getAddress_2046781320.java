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

public class UpdateOrganizationRequest_getAddress_2046781320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3776;

    public UpdateOrganizationRequest_getAddress_2046781320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3776 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        setField(term3776, term3776.getClass(), "name", null);
        setField(term3776, term3776.getClass(), "imageUrl", null);
        setField(term3776, term3776.getClass(), "address", null);
        setField(term3776, term3776.getClass(), "phone", null);
        setField(term3776, term3776.getClass(), "email", null);
        setField(term3776, term3776.getClass(), "socialMedia", null);
        setField(term3776, term3776.getClass(), "aboutUsText", null);
        setField(term3776, term3776.getClass(), "welcomeText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term3776, args);
    }

};


