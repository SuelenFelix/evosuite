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

public class OrganizationEntity_getName_19015996503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9655;

    public OrganizationEntity_getName_19015996503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9656 = new Long(2354625302846375590L);
        term9655 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term9778 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term9655, term9655.getClass(), "organizationId", term9656);
        setField(term9655, term9655.getClass(), "name", "oKwCDqywym");
        setField(term9655, term9655.getClass(), "imageUrl", "zjZYTddemL");
        setField(term9655, term9655.getClass(), "address", "QtrylgCLiF");
        setField(term9655, term9655.getClass(), "phone", "orEuhCStGM");
        setField(term9655, term9655.getClass(), "email", "HhEaSXWvrY");
        setField(term9655, term9655.getClass(), "facebookUrl", "CVRGEomOth");
        setField(term9655, term9655.getClass(), "linkedInUrl", "vSeruUyNWX");
        setField(term9655, term9655.getClass(), "instagramUrl", "UkKvaeJfEC");
        setField(term9655, term9655.getClass(), "welcomeText", "WPxXsahPRq");
        setField(term9655, term9655.getClass(), "aboutUsText", "IENRuqmwUU");
        setIntField(term9778, term9778.getClass(), "nanos", 805000000);
        setLongField(term9778, term9778.getClass(), "fastTime", 1818957725000L);
        setField(term9778, term9778.getClass(), "cdate", null);
        setField(term9655, term9655.getClass(), "createTimestamp", term9778);
        setBooleanField(term9655, term9655.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term9655, args);
    }

};


