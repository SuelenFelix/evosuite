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

public class OrganizationEntity_getFacebookUrl_17523731728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10790;

    public OrganizationEntity_getFacebookUrl_17523731728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10791 = new Long(-685023850445639859L);
        term10790 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term10913 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term10790, term10790.getClass(), "organizationId", term10791);
        setField(term10790, term10790.getClass(), "name", "AyrEXuGrEj");
        setField(term10790, term10790.getClass(), "imageUrl", "yevIIoVYHq");
        setField(term10790, term10790.getClass(), "address", "UuYWMTqWTV");
        setField(term10790, term10790.getClass(), "phone", "DSFGlcaXUb");
        setField(term10790, term10790.getClass(), "email", "sHMXNUzNeM");
        setField(term10790, term10790.getClass(), "facebookUrl", "gPzGDOEPPw");
        setField(term10790, term10790.getClass(), "linkedInUrl", "rwKoAngzCu");
        setField(term10790, term10790.getClass(), "instagramUrl", "VUkRVwROTl");
        setField(term10790, term10790.getClass(), "welcomeText", "UDlkdccCRn");
        setField(term10790, term10790.getClass(), "aboutUsText", "McpzErOcYb");
        setIntField(term10913, term10913.getClass(), "nanos", 678000000);
        setLongField(term10913, term10913.getClass(), "fastTime", 1616822668000L);
        setField(term10913, term10913.getClass(), "cdate", null);
        setField(term10790, term10790.getClass(), "createTimestamp", term10913);
        setBooleanField(term10790, term10790.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFacebookUrl", argTypes, term10790, args);
    }

};


