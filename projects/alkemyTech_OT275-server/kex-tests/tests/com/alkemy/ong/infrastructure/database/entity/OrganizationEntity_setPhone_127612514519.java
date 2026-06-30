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

public class OrganizationEntity_setPhone_127612514519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13355;

    public OrganizationEntity_setPhone_127612514519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13356 = new Long(1084801489398441516L);
        term13355 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term13478 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term13355, term13355.getClass(), "organizationId", term13356);
        setField(term13355, term13355.getClass(), "name", "ZrchvNGMtd");
        setField(term13355, term13355.getClass(), "imageUrl", "WaEcyVlcIx");
        setField(term13355, term13355.getClass(), "address", "ONcbPCQnHd");
        setField(term13355, term13355.getClass(), "phone", "AobDaplFLl");
        setField(term13355, term13355.getClass(), "email", "pDkMNnAGgv");
        setField(term13355, term13355.getClass(), "facebookUrl", "PaCpFXGzdX");
        setField(term13355, term13355.getClass(), "linkedInUrl", "FftYCNbnks");
        setField(term13355, term13355.getClass(), "instagramUrl", "lJoltmsadS");
        setField(term13355, term13355.getClass(), "welcomeText", "mvfDtZNEHr");
        setField(term13355, term13355.getClass(), "aboutUsText", "bvSgmFUDOU");
        setIntField(term13478, term13478.getClass(), "nanos", 597000000);
        setLongField(term13478, term13478.getClass(), "fastTime", 1758762464000L);
        setField(term13478, term13478.getClass(), "cdate", null);
        setField(term13355, term13355.getClass(), "createTimestamp", term13478);
        setBooleanField(term13355, term13355.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XMHwbfiHRl";
        callMethod(klass, "setPhone", argTypes, term13355, args);
    }

};


