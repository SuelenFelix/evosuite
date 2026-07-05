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

public class OrganizationEntity_getAddress_212335542333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15565;

    public OrganizationEntity_getAddress_212335542333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15565 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        setField(term15565, term15565.getClass(), "organizationId", null);
        setField(term15565, term15565.getClass(), "name", null);
        setField(term15565, term15565.getClass(), "imageUrl", null);
        setField(term15565, term15565.getClass(), "address", null);
        setField(term15565, term15565.getClass(), "phone", null);
        setField(term15565, term15565.getClass(), "email", null);
        setField(term15565, term15565.getClass(), "facebookUrl", null);
        setField(term15565, term15565.getClass(), "linkedInUrl", null);
        setField(term15565, term15565.getClass(), "instagramUrl", null);
        setField(term15565, term15565.getClass(), "welcomeText", null);
        setField(term15565, term15565.getClass(), "aboutUsText", null);
        setField(term15565, term15565.getClass(), "createTimestamp", null);
        setBooleanField(term15565, term15565.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term15565, args);
    }

};


