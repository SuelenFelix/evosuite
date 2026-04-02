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
import java.lang.Boolean;

public class OrganizationEntity_setSoftDeleted_11828464127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15328;
     Object term15455;

    public OrganizationEntity_setSoftDeleted_11828464127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15329 = new Long(148047808219672941L);
        term15328 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term15451 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term15328, term15328.getClass(), "organizationId", term15329);
        setField(term15328, term15328.getClass(), "name", "fLRqcTSfzF");
        setField(term15328, term15328.getClass(), "imageUrl", "EBYHwsuWAU");
        setField(term15328, term15328.getClass(), "address", "PtIjKpiSix");
        setField(term15328, term15328.getClass(), "phone", "NZdTuwSCIM");
        setField(term15328, term15328.getClass(), "email", "dDHcmzPAmP");
        setField(term15328, term15328.getClass(), "facebookUrl", "HEaTkWYBgv");
        setField(term15328, term15328.getClass(), "linkedInUrl", "MpJsPKLTIU");
        setField(term15328, term15328.getClass(), "instagramUrl", "IiNCZfdouL");
        setField(term15328, term15328.getClass(), "welcomeText", "AhOHzCsHKW");
        setField(term15328, term15328.getClass(), "aboutUsText", "UqgLPaaAHi");
        setIntField(term15451, term15451.getClass(), "nanos", 580000000);
        setLongField(term15451, term15451.getClass(), "fastTime", 1728446946000L);
        setField(term15451, term15451.getClass(), "cdate", null);
        setField(term15328, term15328.getClass(), "createTimestamp", term15451);
        setBooleanField(term15328, term15328.getClass(), "softDeleted", true);
        term15455 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term15455;
        callMethod(klass, "setSoftDeleted", argTypes, term15328, args);
    }

};


