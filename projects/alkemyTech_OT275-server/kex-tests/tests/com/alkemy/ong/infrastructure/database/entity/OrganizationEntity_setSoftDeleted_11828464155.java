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
import java.lang.Boolean;

public class OrganizationEntity_setSoftDeleted_11828464155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15609;
     Object term15611;

    public OrganizationEntity_setSoftDeleted_11828464155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15609 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        setField(term15609, term15609.getClass(), "organizationId", null);
        setField(term15609, term15609.getClass(), "name", null);
        setField(term15609, term15609.getClass(), "imageUrl", null);
        setField(term15609, term15609.getClass(), "address", null);
        setField(term15609, term15609.getClass(), "phone", null);
        setField(term15609, term15609.getClass(), "email", null);
        setField(term15609, term15609.getClass(), "facebookUrl", null);
        setField(term15609, term15609.getClass(), "linkedInUrl", null);
        setField(term15609, term15609.getClass(), "instagramUrl", null);
        setField(term15609, term15609.getClass(), "welcomeText", null);
        setField(term15609, term15609.getClass(), "aboutUsText", null);
        setField(term15609, term15609.getClass(), "createTimestamp", null);
        setBooleanField(term15609, term15609.getClass(), "softDeleted", false);
        term15611 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term15611;
        callMethod(klass, "setSoftDeleted", argTypes, term15609, args);
    }

};


