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

public class OrganizationEntity_getCreateTimestamp_110787816813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11925;

    public OrganizationEntity_getCreateTimestamp_110787816813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11926 = new Long(-4393710401270724527L);
        term11925 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term12048 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term11925, term11925.getClass(), "organizationId", term11926);
        setField(term11925, term11925.getClass(), "name", "oKhVzOKUFW");
        setField(term11925, term11925.getClass(), "imageUrl", "mNHyqmOAFy");
        setField(term11925, term11925.getClass(), "address", "UxgSdhxPCH");
        setField(term11925, term11925.getClass(), "phone", "DAujxZPHJC");
        setField(term11925, term11925.getClass(), "email", "IlBhdrCvHq");
        setField(term11925, term11925.getClass(), "facebookUrl", "OirVUQhauU");
        setField(term11925, term11925.getClass(), "linkedInUrl", "GLbyDfbNZI");
        setField(term11925, term11925.getClass(), "instagramUrl", "oNLcCYDAsO");
        setField(term11925, term11925.getClass(), "welcomeText", "CNqMxLvtcJ");
        setField(term11925, term11925.getClass(), "aboutUsText", "ktbqerIaKW");
        setIntField(term12048, term12048.getClass(), "nanos", 278000000);
        setLongField(term12048, term12048.getClass(), "fastTime", 1618583905000L);
        setField(term12048, term12048.getClass(), "cdate", null);
        setField(term11925, term11925.getClass(), "createTimestamp", term12048);
        setBooleanField(term11925, term11925.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term11925, args);
    }

};


