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

public class MemberEntity_getImageUrl_7231332125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4620;

    public MemberEntity_getImageUrl_7231332125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4621 = new Long(7994303628307559416L);
        term4620 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term4695 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term4620, term4620.getClass(), "memberId", term4621);
        setField(term4620, term4620.getClass(), "name", "kNqaJKIATy");
        setField(term4620, term4620.getClass(), "facebookUrl", "vKQukfbJUd");
        setField(term4620, term4620.getClass(), "instagramUrl", "lFRJFUMVbx");
        setField(term4620, term4620.getClass(), "linkedInUrl", "sZdUNdggUW");
        setField(term4620, term4620.getClass(), "imageUrl", "OqbwYQfvAe");
        setField(term4620, term4620.getClass(), "description", "tRxZafjqIx");
        setIntField(term4695, term4695.getClass(), "nanos", 65000000);
        setLongField(term4695, term4695.getClass(), "fastTime", 1535827649000L);
        setField(term4695, term4695.getClass(), "cdate", null);
        setField(term4620, term4620.getClass(), "createTimestamp", term4695);
        setBooleanField(term4620, term4620.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term4620, args);
    }

};


