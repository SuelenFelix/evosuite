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

public class UpdateOrganizationResponse_setSocialMedia_10111355816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3791;
     Object term3913;

    public UpdateOrganizationResponse_setSocialMedia_10111355816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3791 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term3852 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term3791, term3791.getClass(), "name", "CGOpQSZZwI");
        setField(term3791, term3791.getClass(), "imageUrl", "ypEdrstygY");
        setField(term3791, term3791.getClass(), "address", "sNQFlATEeQ");
        setField(term3791, term3791.getClass(), "phone", "ZKMLioamsY");
        setField(term3791, term3791.getClass(), "email", "WVbxuoDBcn");
        setField(term3852, term3852.getClass(), "facebookUrl", "pvDEABOxLt");
        setField(term3852, term3852.getClass(), "linkedInUrl", "beAMpkroCQ");
        setField(term3852, term3852.getClass(), "instagramUrl", "uSUvKAyuvd");
        setField(term3791, term3791.getClass(), "socialMedia", term3852);
        setField(term3791, term3791.getClass(), "aboutUsText", "onQLVONGuf");
        setField(term3791, term3791.getClass(), "welcomeText", "SOrEHbcbmn");
        term3913 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term3913, term3913.getClass(), "facebookUrl", "bnsyeQXFdu");
        setField(term3913, term3913.getClass(), "linkedInUrl", "BwtdjiefJn");
        setField(term3913, term3913.getClass(), "instagramUrl", "jDmhBrIoDa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse");
        Object[] args = new Object[1];
        args[0] = term3913;
        callMethod(klass, "setSocialMedia", argTypes, term3791, args);
    }

};


