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

public class OrganizationEntity_setWelcomeText_93787017052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15603;

    public OrganizationEntity_setWelcomeText_93787017052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15603 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        setField(term15603, term15603.getClass(), "organizationId", null);
        setField(term15603, term15603.getClass(), "name", null);
        setField(term15603, term15603.getClass(), "imageUrl", null);
        setField(term15603, term15603.getClass(), "address", null);
        setField(term15603, term15603.getClass(), "phone", null);
        setField(term15603, term15603.getClass(), "email", null);
        setField(term15603, term15603.getClass(), "facebookUrl", null);
        setField(term15603, term15603.getClass(), "linkedInUrl", null);
        setField(term15603, term15603.getClass(), "instagramUrl", null);
        setField(term15603, term15603.getClass(), "welcomeText", null);
        setField(term15603, term15603.getClass(), "aboutUsText", null);
        setField(term15603, term15603.getClass(), "createTimestamp", null);
        setBooleanField(term15603, term15603.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWelcomeText", argTypes, term15603, args);
    }

};


