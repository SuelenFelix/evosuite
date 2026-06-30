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

public class OrganizationEntity_getEmail_6572618957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10563;

    public OrganizationEntity_getEmail_6572618957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10564 = new Long(1597484336218508869L);
        term10563 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term10686 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term10563, term10563.getClass(), "organizationId", term10564);
        setField(term10563, term10563.getClass(), "name", "nxSTJflLQy");
        setField(term10563, term10563.getClass(), "imageUrl", "FlHzxEfFzI");
        setField(term10563, term10563.getClass(), "address", "aSATgQUpoe");
        setField(term10563, term10563.getClass(), "phone", "VkPSXewZfB");
        setField(term10563, term10563.getClass(), "email", "ubodzJoMGW");
        setField(term10563, term10563.getClass(), "facebookUrl", "weddIktxOA");
        setField(term10563, term10563.getClass(), "linkedInUrl", "uSlMeISsDD");
        setField(term10563, term10563.getClass(), "instagramUrl", "WdCiTDUKqn");
        setField(term10563, term10563.getClass(), "welcomeText", "PSizQDoxxe");
        setField(term10563, term10563.getClass(), "aboutUsText", "mKaHyMybrK");
        setIntField(term10686, term10686.getClass(), "nanos", 58000000);
        setLongField(term10686, term10686.getClass(), "fastTime", 1335378452000L);
        setField(term10686, term10686.getClass(), "cdate", null);
        setField(term10563, term10563.getClass(), "createTimestamp", term10686);
        setBooleanField(term10563, term10563.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term10563, args);
    }

};


