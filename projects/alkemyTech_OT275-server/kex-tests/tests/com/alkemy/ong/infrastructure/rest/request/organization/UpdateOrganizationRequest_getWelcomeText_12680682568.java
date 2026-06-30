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

public class UpdateOrganizationRequest_getWelcomeText_12680682568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555;

    public UpdateOrganizationRequest_getWelcomeText_12680682568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1555 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term1616 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1555, term1555.getClass(), "name", "whBvTVIIlC");
        setField(term1555, term1555.getClass(), "imageUrl", "IgRJUzaCwW");
        setField(term1555, term1555.getClass(), "address", "JUmudUmaaV");
        setField(term1555, term1555.getClass(), "phone", "KoyGrUJeJW");
        setField(term1555, term1555.getClass(), "email", "HqBOwkVqjD");
        setField(term1616, term1616.getClass(), "facebookUrl", "MAcUBcBckh");
        setField(term1616, term1616.getClass(), "linkedInUrl", "oVgzLbrsFr");
        setField(term1616, term1616.getClass(), "instagramUrl", "vQVyKLdtaz");
        setField(term1555, term1555.getClass(), "socialMedia", term1616);
        setField(term1555, term1555.getClass(), "aboutUsText", "OWKQODBLzb");
        setField(term1555, term1555.getClass(), "welcomeText", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWelcomeText", argTypes, term1555, args);
    }

};


