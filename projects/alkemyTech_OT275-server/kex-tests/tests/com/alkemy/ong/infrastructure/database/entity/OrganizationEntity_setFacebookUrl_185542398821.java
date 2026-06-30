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
import java.lang.Long;
import java.lang.Object;

public class OrganizationEntity_setFacebookUrl_185542398821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13853;

    public OrganizationEntity_setFacebookUrl_185542398821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13854 = new Long(3620247240684476031L);
        term13853 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term13976 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term13853, term13853.getClass(), "organizationId", term13854);
        setField(term13853, term13853.getClass(), "name", "EEYmuwyVDP");
        setField(term13853, term13853.getClass(), "imageUrl", "EWFbEDAVrE");
        setField(term13853, term13853.getClass(), "address", "EMiMtYgfvr");
        setField(term13853, term13853.getClass(), "phone", "OyYyYYnJuF");
        setField(term13853, term13853.getClass(), "email", "aYLvcxZohT");
        setField(term13853, term13853.getClass(), "facebookUrl", "mnHyQbMyld");
        setField(term13853, term13853.getClass(), "linkedInUrl", "KHtaDOIcJZ");
        setField(term13853, term13853.getClass(), "instagramUrl", "vgdwrCZczl");
        setField(term13853, term13853.getClass(), "welcomeText", "gKMNrpKBpu");
        setField(term13853, term13853.getClass(), "aboutUsText", "ZbHJVEqcoa");
        setIntField(term13976, term13976.getClass(), "nanos", 233000000);
        setLongField(term13976, term13976.getClass(), "fastTime", 1316961637000L);
        setField(term13976, term13976.getClass(), "cdate", null);
        setField(term13853, term13853.getClass(), "createTimestamp", term13976);
        setBooleanField(term13853, term13853.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "awDQVEVIKi";
        callMethod(klass, "setFacebookUrl", argTypes, term13853, args);
    }

};


