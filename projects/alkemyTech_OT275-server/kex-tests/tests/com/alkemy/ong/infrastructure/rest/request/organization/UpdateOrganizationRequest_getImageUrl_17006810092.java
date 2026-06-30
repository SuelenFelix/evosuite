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

public class UpdateOrganizationRequest_getImageUrl_17006810092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;

    public UpdateOrganizationRequest_getImageUrl_17006810092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term284 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term223, term223.getClass(), "name", "NRdvgJlhkX");
        setField(term223, term223.getClass(), "imageUrl", "uuaPigETmJ");
        setField(term223, term223.getClass(), "address", "MxlszYVzRf");
        setField(term223, term223.getClass(), "phone", "LQFpaHEwXR");
        setField(term223, term223.getClass(), "email", "oVcInYnLWB");
        setField(term284, term284.getClass(), "facebookUrl", "aJlieCFVtF");
        setField(term284, term284.getClass(), "linkedInUrl", "ZiaGIbnzTs");
        setField(term284, term284.getClass(), "instagramUrl", "tbcdzjIfER");
        setField(term223, term223.getClass(), "socialMedia", term284);
        setField(term223, term223.getClass(), "aboutUsText", "HyxfbSQYBe");
        setField(term223, term223.getClass(), "welcomeText", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term223, args);
    }

};


