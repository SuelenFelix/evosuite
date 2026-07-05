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

public class UpdateOrganizationResponse_setPhone_3613120754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3303;

    public UpdateOrganizationResponse_setPhone_3613120754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3303 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term3364 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term3303, term3303.getClass(), "name", "XfRABIFVEp");
        setField(term3303, term3303.getClass(), "imageUrl", "MHGKyEnwKc");
        setField(term3303, term3303.getClass(), "address", "ShIELyuULw");
        setField(term3303, term3303.getClass(), "phone", "IpQuOGMgmj");
        setField(term3303, term3303.getClass(), "email", "pJbnHTYrxn");
        setField(term3364, term3364.getClass(), "facebookUrl", "iIRsCSYqXH");
        setField(term3364, term3364.getClass(), "linkedInUrl", "nghfqDXyCG");
        setField(term3364, term3364.getClass(), "instagramUrl", "WBAOTqErtm");
        setField(term3303, term3303.getClass(), "socialMedia", term3364);
        setField(term3303, term3303.getClass(), "aboutUsText", "PqtVXXZMqK");
        setField(term3303, term3303.getClass(), "welcomeText", "rYbtIDVdnd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKAReurpHG";
        callMethod(klass, "setPhone", argTypes, term3303, args);
    }

};


