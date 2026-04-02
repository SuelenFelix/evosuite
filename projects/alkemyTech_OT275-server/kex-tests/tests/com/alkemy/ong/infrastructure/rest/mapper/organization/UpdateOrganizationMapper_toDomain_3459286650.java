package com.alkemy.ong.infrastructure.rest.mapper.organization;

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
import static com.alkemy.ong.infrastructure.rest.mapper.organization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UpdateOrganizationMapper_toDomain_3459286650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public UpdateOrganizationMapper_toDomain_3459286650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.UpdateOrganizationMapper"));
        Object term2 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.common.SocialMediaMapper"));
        setField(term1, term1.getClass(), "socialMediaMapper", term2);
        term3 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest"));
        Object term64 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term3, term3.getClass(), "name", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "imageUrl", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "address", "MuLcgQHgqz");
        setField(term3, term3.getClass(), "phone", "xxtlPwDYFs");
        setField(term3, term3.getClass(), "email", "jJCZpVmanW");
        setField(term64, term64.getClass(), "facebookUrl", "EGtDIRbSSb");
        setField(term64, term64.getClass(), "linkedInUrl", "SzjVpOQTyS");
        setField(term64, term64.getClass(), "instagramUrl", "MjGYSRKTNF");
        setField(term3, term3.getClass(), "socialMedia", term64);
        setField(term3, term3.getClass(), "aboutUsText", "hRNSzYYIrc");
        setField(term3, term3.getClass(), "welcomeText", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.organization.UpdateOrganizationMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.organization.UpdateOrganizationRequest");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "toDomain", argTypes, term1, args);
    }

};


