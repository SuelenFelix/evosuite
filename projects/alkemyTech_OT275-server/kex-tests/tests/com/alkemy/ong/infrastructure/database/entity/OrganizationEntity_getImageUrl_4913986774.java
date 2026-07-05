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

public class OrganizationEntity_getImageUrl_4913986774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9882;

    public OrganizationEntity_getImageUrl_4913986774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9883 = new Long(7276637106827860087L);
        term9882 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity"));
        Object term10005 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term9882, term9882.getClass(), "organizationId", term9883);
        setField(term9882, term9882.getClass(), "name", "GsWxOwXvSu");
        setField(term9882, term9882.getClass(), "imageUrl", "bKBSncrMEZ");
        setField(term9882, term9882.getClass(), "address", "yeSXGqQExb");
        setField(term9882, term9882.getClass(), "phone", "uXYcXVYJZM");
        setField(term9882, term9882.getClass(), "email", "BJhjdJUhkz");
        setField(term9882, term9882.getClass(), "facebookUrl", "cdHYQDgUZR");
        setField(term9882, term9882.getClass(), "linkedInUrl", "KAORSSPSeV");
        setField(term9882, term9882.getClass(), "instagramUrl", "UimMMORkzd");
        setField(term9882, term9882.getClass(), "welcomeText", "huVIXUWLtI");
        setField(term9882, term9882.getClass(), "aboutUsText", "vhKzFyKPOT");
        setIntField(term10005, term10005.getClass(), "nanos", 801000000);
        setLongField(term10005, term10005.getClass(), "fastTime", 1603894986000L);
        setField(term10005, term10005.getClass(), "cdate", null);
        setField(term9882, term9882.getClass(), "createTimestamp", term10005);
        setBooleanField(term9882, term9882.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.OrganizationEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term9882, args);
    }

};


