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

public class OrganizationEntity_getName_190159965031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15561;

    public OrganizationEntity_getName_190159965031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15561 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        setField(term15561, term15561.getClass(), "organizationId", null);
        setField(term15561, term15561.getClass(), "name", null);
        setField(term15561, term15561.getClass(), "imageUrl", null);
        setField(term15561, term15561.getClass(), "address", null);
        setField(term15561, term15561.getClass(), "phone", null);
        setField(term15561, term15561.getClass(), "email", null);
        setField(term15561, term15561.getClass(), "facebookUrl", null);
        setField(term15561, term15561.getClass(), "linkedInUrl", null);
        setField(term15561, term15561.getClass(), "instagramUrl", null);
        setField(term15561, term15561.getClass(), "welcomeText", null);
        setField(term15561, term15561.getClass(), "aboutUsText", null);
        setField(term15561, term15561.getClass(), "createTimestamp", null);
        setBooleanField(term15561, term15561.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term15561, args);
    }

};


