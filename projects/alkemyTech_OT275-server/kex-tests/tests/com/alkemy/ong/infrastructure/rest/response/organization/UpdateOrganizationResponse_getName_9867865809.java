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

public class UpdateOrganizationResponse_getName_9867865809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4568;

    public UpdateOrganizationResponse_getName_9867865809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4568 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term4629 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term4568, term4568.getClass(), "name", "EKjQdtKxAM");
        setField(term4568, term4568.getClass(), "imageUrl", "TXZAIPQJHt");
        setField(term4568, term4568.getClass(), "address", "DIbeDHICho");
        setField(term4568, term4568.getClass(), "phone", "dJGPlmSRnz");
        setField(term4568, term4568.getClass(), "email", "DPskuFUobI");
        setField(term4629, term4629.getClass(), "facebookUrl", "wBGfLpNNiZ");
        setField(term4629, term4629.getClass(), "linkedInUrl", "yUGCjlqgJE");
        setField(term4629, term4629.getClass(), "instagramUrl", "PXdVZyoJyC");
        setField(term4568, term4568.getClass(), "socialMedia", term4629);
        setField(term4568, term4568.getClass(), "aboutUsText", "vLerpqavFM");
        setField(term4568, term4568.getClass(), "welcomeText", "qnvxzwuGKX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term4568, args);
    }

};


