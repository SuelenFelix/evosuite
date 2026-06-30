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

public class UpdateOrganizationRequest_getEmail_14456257155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889;

    public UpdateOrganizationRequest_getEmail_14456257155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term950 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term889, term889.getClass(), "name", "wSQxaModmm");
        setField(term889, term889.getClass(), "imageUrl", "UlajhuVLaP");
        setField(term889, term889.getClass(), "address", "gGSMzuGICf");
        setField(term889, term889.getClass(), "phone", "hxCBltsObl");
        setField(term889, term889.getClass(), "email", "BndsHwAFMv");
        setField(term950, term950.getClass(), "facebookUrl", "GzFkzHGYFt");
        setField(term950, term950.getClass(), "linkedInUrl", "tShwQLRGNe");
        setField(term950, term950.getClass(), "instagramUrl", "LvtrsXUliU");
        setField(term889, term889.getClass(), "socialMedia", term950);
        setField(term889, term889.getClass(), "aboutUsText", "xLbjWUgOIL");
        setField(term889, term889.getClass(), "welcomeText", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term889, args);
    }

};


