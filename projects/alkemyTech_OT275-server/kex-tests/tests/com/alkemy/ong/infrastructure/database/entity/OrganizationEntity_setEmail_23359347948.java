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

public class OrganizationEntity_setEmail_23359347948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15595;

    public OrganizationEntity_setEmail_23359347948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15595 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        setField(term15595, term15595.getClass(), "organizationId", null);
        setField(term15595, term15595.getClass(), "name", null);
        setField(term15595, term15595.getClass(), "imageUrl", null);
        setField(term15595, term15595.getClass(), "address", null);
        setField(term15595, term15595.getClass(), "phone", null);
        setField(term15595, term15595.getClass(), "email", null);
        setField(term15595, term15595.getClass(), "facebookUrl", null);
        setField(term15595, term15595.getClass(), "linkedInUrl", null);
        setField(term15595, term15595.getClass(), "instagramUrl", null);
        setField(term15595, term15595.getClass(), "welcomeText", null);
        setField(term15595, term15595.getClass(), "aboutUsText", null);
        setField(term15595, term15595.getClass(), "createTimestamp", null);
        setBooleanField(term15595, term15595.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmail", argTypes, term15595, args);
    }

};


