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

public class OrganizationEntity_getPhone_16997935616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10336;

    public OrganizationEntity_getPhone_16997935616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10337 = new Long(1215116475929634177L);
        term10336 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term10459 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term10336, term10336.getClass(), "organizationId", term10337);
        setField(term10336, term10336.getClass(), "name", "YkZtEtthvz");
        setField(term10336, term10336.getClass(), "imageUrl", "dwlZSxlXOo");
        setField(term10336, term10336.getClass(), "address", "lKrEAkypza");
        setField(term10336, term10336.getClass(), "phone", "KtuuNAqGCQ");
        setField(term10336, term10336.getClass(), "email", "OGQsfjmReM");
        setField(term10336, term10336.getClass(), "facebookUrl", "YsUtbngnRO");
        setField(term10336, term10336.getClass(), "linkedInUrl", "JisaWUxcNb");
        setField(term10336, term10336.getClass(), "instagramUrl", "NxgmYPzWCI");
        setField(term10336, term10336.getClass(), "welcomeText", "SqjyKmayBx");
        setField(term10336, term10336.getClass(), "aboutUsText", "XjDhvToxJy");
        setIntField(term10459, term10459.getClass(), "nanos", 351000000);
        setLongField(term10459, term10459.getClass(), "fastTime", 1510264279000L);
        setField(term10459, term10459.getClass(), "cdate", null);
        setField(term10336, term10336.getClass(), "createTimestamp", term10459);
        setBooleanField(term10336, term10336.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term10336, args);
    }

};


