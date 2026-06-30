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

public class UpdateOrganizationResponse_getWelcomeText_7999371616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6122;

    public UpdateOrganizationResponse_getWelcomeText_7999371616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6122 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term6183 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term6122, term6122.getClass(), "name", "llRfwANcVF");
        setField(term6122, term6122.getClass(), "imageUrl", "sUEeHQTWkA");
        setField(term6122, term6122.getClass(), "address", "BDIRCxAWLA");
        setField(term6122, term6122.getClass(), "phone", "eOJfbiZLnb");
        setField(term6122, term6122.getClass(), "email", "nKZKnxWYCK");
        setField(term6183, term6183.getClass(), "facebookUrl", "JOqQxuzRuZ");
        setField(term6183, term6183.getClass(), "linkedInUrl", "RSaoipUlsg");
        setField(term6183, term6183.getClass(), "instagramUrl", "cSHGbqKqlN");
        setField(term6122, term6122.getClass(), "socialMedia", term6183);
        setField(term6122, term6122.getClass(), "aboutUsText", "pFAfANnxup");
        setField(term6122, term6122.getClass(), "welcomeText", "FbSIUZyBXZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWelcomeText", argTypes, term6122, args);
    }

};


