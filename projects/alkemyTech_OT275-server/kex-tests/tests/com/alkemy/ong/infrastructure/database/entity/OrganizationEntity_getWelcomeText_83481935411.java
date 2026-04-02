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

public class OrganizationEntity_getWelcomeText_83481935411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11471;

    public OrganizationEntity_getWelcomeText_83481935411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11472 = new Long(-6342139649364011743L);
        term11471 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term11594 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term11471, term11471.getClass(), "organizationId", term11472);
        setField(term11471, term11471.getClass(), "name", "ckQLZGFjMX");
        setField(term11471, term11471.getClass(), "imageUrl", "qphdrqUtNx");
        setField(term11471, term11471.getClass(), "address", "bwlLFAfNWx");
        setField(term11471, term11471.getClass(), "phone", "JWodNQzjjV");
        setField(term11471, term11471.getClass(), "email", "CAgxWjhxNf");
        setField(term11471, term11471.getClass(), "facebookUrl", "goAoCMhKBu");
        setField(term11471, term11471.getClass(), "linkedInUrl", "BWxJSgKHRT");
        setField(term11471, term11471.getClass(), "instagramUrl", "AGXoIndFnm");
        setField(term11471, term11471.getClass(), "welcomeText", "mwmFMNEzkK");
        setField(term11471, term11471.getClass(), "aboutUsText", "kVAmKknVln");
        setIntField(term11594, term11594.getClass(), "nanos", 670000000);
        setLongField(term11594, term11594.getClass(), "fastTime", 1714964502000L);
        setField(term11594, term11594.getClass(), "cdate", null);
        setField(term11471, term11471.getClass(), "createTimestamp", term11594);
        setBooleanField(term11471, term11471.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWelcomeText", argTypes, term11471, args);
    }

};


