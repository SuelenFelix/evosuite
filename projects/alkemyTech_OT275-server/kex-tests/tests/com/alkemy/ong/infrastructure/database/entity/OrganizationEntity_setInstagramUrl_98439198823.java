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

public class OrganizationEntity_setInstagramUrl_98439198823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14351;

    public OrganizationEntity_setInstagramUrl_98439198823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14352 = new Long(-1214968196781083707L);
        term14351 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term14474 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term14351, term14351.getClass(), "organizationId", term14352);
        setField(term14351, term14351.getClass(), "name", "hgFbWAUtsu");
        setField(term14351, term14351.getClass(), "imageUrl", "HqoTWlkbwF");
        setField(term14351, term14351.getClass(), "address", "CwNELDTAPP");
        setField(term14351, term14351.getClass(), "phone", "GSzQdbHLHw");
        setField(term14351, term14351.getClass(), "email", "IkfarsYNJO");
        setField(term14351, term14351.getClass(), "facebookUrl", "aZKOWhHMEh");
        setField(term14351, term14351.getClass(), "linkedInUrl", "YfkhviKZwl");
        setField(term14351, term14351.getClass(), "instagramUrl", "DcOhhAfJTI");
        setField(term14351, term14351.getClass(), "welcomeText", "gYTIkBFOoS");
        setField(term14351, term14351.getClass(), "aboutUsText", "xmzSoVgiED");
        setIntField(term14474, term14474.getClass(), "nanos", 13000000);
        setLongField(term14474, term14474.getClass(), "fastTime", 1655658011000L);
        setField(term14474, term14474.getClass(), "cdate", null);
        setField(term14351, term14351.getClass(), "createTimestamp", term14474);
        setBooleanField(term14351, term14351.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pdSvedKgPq";
        callMethod(klass, "setInstagramUrl", argTypes, term14351, args);
    }

};


