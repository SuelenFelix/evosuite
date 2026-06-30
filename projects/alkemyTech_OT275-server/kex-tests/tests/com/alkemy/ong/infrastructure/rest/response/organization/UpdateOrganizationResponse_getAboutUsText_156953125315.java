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

public class UpdateOrganizationResponse_getAboutUsText_156953125315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5900;

    public UpdateOrganizationResponse_getAboutUsText_156953125315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5900 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term5961 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term5900, term5900.getClass(), "name", "UPUbwyHQKN");
        setField(term5900, term5900.getClass(), "imageUrl", "lgQkrXANyI");
        setField(term5900, term5900.getClass(), "address", "MeTmRZXErV");
        setField(term5900, term5900.getClass(), "phone", "jNxbVmoZgq");
        setField(term5900, term5900.getClass(), "email", "PvmBHIXaMY");
        setField(term5961, term5961.getClass(), "facebookUrl", "hulYxtowxw");
        setField(term5961, term5961.getClass(), "linkedInUrl", "GNEmuHPNcU");
        setField(term5961, term5961.getClass(), "instagramUrl", "IoSfuKDFRe");
        setField(term5900, term5900.getClass(), "socialMedia", term5961);
        setField(term5900, term5900.getClass(), "aboutUsText", "AWYyZiNfsm");
        setField(term5900, term5900.getClass(), "welcomeText", "ITRRYiuDwH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAboutUsText", argTypes, term5900, args);
    }

};


