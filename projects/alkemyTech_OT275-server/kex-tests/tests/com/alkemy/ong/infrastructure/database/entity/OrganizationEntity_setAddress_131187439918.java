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

public class OrganizationEntity_setAddress_131187439918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13106;

    public OrganizationEntity_setAddress_131187439918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13107 = new Long(-900457279156388404L);
        term13106 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term13229 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term13106, term13106.getClass(), "organizationId", term13107);
        setField(term13106, term13106.getClass(), "name", "QZBHZqZope");
        setField(term13106, term13106.getClass(), "imageUrl", "VBUahCvyxC");
        setField(term13106, term13106.getClass(), "address", "MlzTkzKMCX");
        setField(term13106, term13106.getClass(), "phone", "UqKUbMyPMJ");
        setField(term13106, term13106.getClass(), "email", "QpYltHAdyY");
        setField(term13106, term13106.getClass(), "facebookUrl", "lbmSGBwIiV");
        setField(term13106, term13106.getClass(), "linkedInUrl", "DAxyHoTLzZ");
        setField(term13106, term13106.getClass(), "instagramUrl", "fhZgTouhCC");
        setField(term13106, term13106.getClass(), "welcomeText", "wrikqJwXvL");
        setField(term13106, term13106.getClass(), "aboutUsText", "UiWhvbypdr");
        setIntField(term13229, term13229.getClass(), "nanos", 327000000);
        setLongField(term13229, term13229.getClass(), "fastTime", 1511272814000L);
        setField(term13229, term13229.getClass(), "cdate", null);
        setField(term13106, term13106.getClass(), "createTimestamp", term13229);
        setBooleanField(term13106, term13106.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CgleElJNje";
        callMethod(klass, "setAddress", argTypes, term13106, args);
    }

};


