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

public class UpdateOrganizationResponse_getAddress_120854235328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6354;

    public UpdateOrganizationResponse_getAddress_120854235328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6354 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        setField(term6354, term6354.getClass(), "name", null);
        setField(term6354, term6354.getClass(), "imageUrl", null);
        setField(term6354, term6354.getClass(), "address", null);
        setField(term6354, term6354.getClass(), "phone", null);
        setField(term6354, term6354.getClass(), "email", null);
        setField(term6354, term6354.getClass(), "socialMedia", null);
        setField(term6354, term6354.getClass(), "aboutUsText", null);
        setField(term6354, term6354.getClass(), "welcomeText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term6354, args);
    }

};


