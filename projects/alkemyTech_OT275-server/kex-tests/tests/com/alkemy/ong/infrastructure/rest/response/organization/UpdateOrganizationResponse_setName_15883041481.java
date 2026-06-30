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

public class UpdateOrganizationResponse_setName_15883041481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2571;

    public UpdateOrganizationResponse_setName_15883041481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2571 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse"));
        Object term2632 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.SocialMediaResponse"));
        setField(term2571, term2571.getClass(), "name", "ZkMALXpEAZ");
        setField(term2571, term2571.getClass(), "imageUrl", "tXfQjSqDzN");
        setField(term2571, term2571.getClass(), "address", "BjugTaMcxJ");
        setField(term2571, term2571.getClass(), "phone", "vGiuZVPJNH");
        setField(term2571, term2571.getClass(), "email", "tlzpzIjMib");
        setField(term2632, term2632.getClass(), "facebookUrl", "AZdLeSugwv");
        setField(term2632, term2632.getClass(), "linkedInUrl", "RMsXuyzKJV");
        setField(term2632, term2632.getClass(), "instagramUrl", "FwPbDZcHmB");
        setField(term2571, term2571.getClass(), "socialMedia", term2632);
        setField(term2571, term2571.getClass(), "aboutUsText", "hOncybyCAH");
        setField(term2571, term2571.getClass(), "welcomeText", "QduALnDSVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.organization.UpdateOrganizationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "izPpKDErnQ";
        callMethod(klass, "setName", argTypes, term2571, args);
    }

};


