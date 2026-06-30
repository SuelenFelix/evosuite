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

public class UpdateOrganizationRequest_getPhone_4030940494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667;

    public UpdateOrganizationRequest_getPhone_4030940494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term728 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term667, term667.getClass(), "name", "OWDIEULEFu");
        setField(term667, term667.getClass(), "imageUrl", "dWRymuLBtr");
        setField(term667, term667.getClass(), "address", "AijpHYOFuy");
        setField(term667, term667.getClass(), "phone", "SbAoxhfrkn");
        setField(term667, term667.getClass(), "email", "kuTXqwMtDB");
        setField(term728, term728.getClass(), "facebookUrl", "Ghbwtircqb");
        setField(term728, term728.getClass(), "linkedInUrl", "xrwlQZdwCp");
        setField(term728, term728.getClass(), "instagramUrl", "IDCWpPLRkE");
        setField(term667, term667.getClass(), "socialMedia", term728);
        setField(term667, term667.getClass(), "aboutUsText", "nyiiPDVjAc");
        setField(term667, term667.getClass(), "welcomeText", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term667, args);
    }

};


