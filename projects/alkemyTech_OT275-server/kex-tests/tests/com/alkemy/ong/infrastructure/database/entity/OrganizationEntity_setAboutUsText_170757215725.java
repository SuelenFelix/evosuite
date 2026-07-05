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

public class OrganizationEntity_setAboutUsText_170757215725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14849;

    public OrganizationEntity_setAboutUsText_170757215725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14850 = new Long(-6432617521836576658L);
        term14849 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term14972 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term14849, term14849.getClass(), "organizationId", term14850);
        setField(term14849, term14849.getClass(), "name", "VePIumgrrU");
        setField(term14849, term14849.getClass(), "imageUrl", "DPwIqlszZo");
        setField(term14849, term14849.getClass(), "address", "mNgDshwZNc");
        setField(term14849, term14849.getClass(), "phone", "pDqgDbJoFw");
        setField(term14849, term14849.getClass(), "email", "iVOvTzOxwt");
        setField(term14849, term14849.getClass(), "facebookUrl", "BjZQdecXvB");
        setField(term14849, term14849.getClass(), "linkedInUrl", "iUkOOQhEkw");
        setField(term14849, term14849.getClass(), "instagramUrl", "wmVoFoUVmU");
        setField(term14849, term14849.getClass(), "welcomeText", "lLiSiPCciB");
        setField(term14849, term14849.getClass(), "aboutUsText", "PsMKIIEwdR");
        setIntField(term14972, term14972.getClass(), "nanos", 491000000);
        setLongField(term14972, term14972.getClass(), "fastTime", 1676460842000L);
        setField(term14972, term14972.getClass(), "cdate", null);
        setField(term14849, term14849.getClass(), "createTimestamp", term14972);
        setBooleanField(term14849, term14849.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RbQmXqfXAT";
        callMethod(klass, "setAboutUsText", argTypes, term14849, args);
    }

};


