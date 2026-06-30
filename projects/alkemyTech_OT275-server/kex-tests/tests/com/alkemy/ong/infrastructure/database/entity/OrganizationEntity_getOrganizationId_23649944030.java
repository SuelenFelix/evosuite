package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OrganizationEntity_getOrganizationId_23649944030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15559;

    public OrganizationEntity_getOrganizationId_23649944030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15559 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        setField(term15559, term15559.getClass(), "organizationId", null);
        setField(term15559, term15559.getClass(), "name", null);
        setField(term15559, term15559.getClass(), "imageUrl", null);
        setField(term15559, term15559.getClass(), "address", null);
        setField(term15559, term15559.getClass(), "phone", null);
        setField(term15559, term15559.getClass(), "email", null);
        setField(term15559, term15559.getClass(), "facebookUrl", null);
        setField(term15559, term15559.getClass(), "linkedInUrl", null);
        setField(term15559, term15559.getClass(), "instagramUrl", null);
        setField(term15559, term15559.getClass(), "welcomeText", null);
        setField(term15559, term15559.getClass(), "aboutUsText", null);
        setField(term15559, term15559.getClass(), "createTimestamp", null);
        setBooleanField(term15559, term15559.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrganizationId", argTypes, term15559, args);
    }

};


