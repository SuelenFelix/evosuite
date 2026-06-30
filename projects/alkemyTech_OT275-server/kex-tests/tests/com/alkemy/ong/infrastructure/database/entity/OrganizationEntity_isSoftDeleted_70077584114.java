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

public class OrganizationEntity_isSoftDeleted_70077584114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12152;

    public OrganizationEntity_isSoftDeleted_70077584114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12153 = new Long(-4822736661741380518L);
        term12152 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term12275 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term12152, term12152.getClass(), "organizationId", term12153);
        setField(term12152, term12152.getClass(), "name", "VoghngXfsK");
        setField(term12152, term12152.getClass(), "imageUrl", "GbahCBMvct");
        setField(term12152, term12152.getClass(), "address", "iiHBhsNFgk");
        setField(term12152, term12152.getClass(), "phone", "HknsTajwxJ");
        setField(term12152, term12152.getClass(), "email", "XtiurrVYKw");
        setField(term12152, term12152.getClass(), "facebookUrl", "rsumfoDNHa");
        setField(term12152, term12152.getClass(), "linkedInUrl", "ceCWHUTQUM");
        setField(term12152, term12152.getClass(), "instagramUrl", "LrqwfrKKtS");
        setField(term12152, term12152.getClass(), "welcomeText", "ZUdnQXfzCI");
        setField(term12152, term12152.getClass(), "aboutUsText", "EULDrUNQvw");
        setIntField(term12275, term12275.getClass(), "nanos", 305000000);
        setLongField(term12275, term12275.getClass(), "fastTime", 1584125791000L);
        setField(term12275, term12275.getClass(), "cdate", null);
        setField(term12152, term12152.getClass(), "createTimestamp", term12275);
        setBooleanField(term12152, term12152.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSoftDeleted", argTypes, term12152, args);
    }

};


