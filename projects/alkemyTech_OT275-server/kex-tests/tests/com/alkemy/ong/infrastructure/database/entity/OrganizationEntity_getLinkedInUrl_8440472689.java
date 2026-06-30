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

public class OrganizationEntity_getLinkedInUrl_8440472689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11017;

    public OrganizationEntity_getLinkedInUrl_8440472689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11018 = new Long(-6950146046121430355L);
        term11017 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term11140 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term11017, term11017.getClass(), "organizationId", term11018);
        setField(term11017, term11017.getClass(), "name", "jqrVEUvYEz");
        setField(term11017, term11017.getClass(), "imageUrl", "QITgiBrmfj");
        setField(term11017, term11017.getClass(), "address", "pXxkiXgQnq");
        setField(term11017, term11017.getClass(), "phone", "tKmrUDURku");
        setField(term11017, term11017.getClass(), "email", "JeZbrwZmsP");
        setField(term11017, term11017.getClass(), "facebookUrl", "bxyfeicqrK");
        setField(term11017, term11017.getClass(), "linkedInUrl", "vBnWPlsZMk");
        setField(term11017, term11017.getClass(), "instagramUrl", "fIZsWucfXz");
        setField(term11017, term11017.getClass(), "welcomeText", "IApvtmfhnq");
        setField(term11017, term11017.getClass(), "aboutUsText", "VSaNnhMpRc");
        setIntField(term11140, term11140.getClass(), "nanos", 821000000);
        setLongField(term11140, term11140.getClass(), "fastTime", 1319530954000L);
        setField(term11140, term11140.getClass(), "cdate", null);
        setField(term11017, term11017.getClass(), "createTimestamp", term11140);
        setBooleanField(term11017, term11017.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLinkedInUrl", argTypes, term11017, args);
    }

};


