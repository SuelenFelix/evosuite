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

public class OrganizationEntity_getAboutUsText_181062297312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11698;

    public OrganizationEntity_getAboutUsText_181062297312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11699 = new Long(-4924950707540628022L);
        term11698 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term11821 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term11698, term11698.getClass(), "organizationId", term11699);
        setField(term11698, term11698.getClass(), "name", "MRFLbEGYKG");
        setField(term11698, term11698.getClass(), "imageUrl", "BYrGukTyof");
        setField(term11698, term11698.getClass(), "address", "jiCGTTzKGB");
        setField(term11698, term11698.getClass(), "phone", "MqICFYzDJj");
        setField(term11698, term11698.getClass(), "email", "YgQvdcBQKw");
        setField(term11698, term11698.getClass(), "facebookUrl", "FiYYLuailz");
        setField(term11698, term11698.getClass(), "linkedInUrl", "XebAeSnCKZ");
        setField(term11698, term11698.getClass(), "instagramUrl", "GeddnXjHGy");
        setField(term11698, term11698.getClass(), "welcomeText", "vLTbaoAxBm");
        setField(term11698, term11698.getClass(), "aboutUsText", "BXTjEyEZxD");
        setIntField(term11821, term11821.getClass(), "nanos", 357000000);
        setLongField(term11821, term11821.getClass(), "fastTime", 1830742277000L);
        setField(term11821, term11821.getClass(), "cdate", null);
        setField(term11698, term11698.getClass(), "createTimestamp", term11821);
        setBooleanField(term11698, term11698.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAboutUsText", argTypes, term11698, args);
    }

};


