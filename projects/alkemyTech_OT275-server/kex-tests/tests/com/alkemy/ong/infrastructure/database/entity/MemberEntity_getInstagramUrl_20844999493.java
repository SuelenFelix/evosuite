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

public class MemberEntity_getInstagramUrl_20844999493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4342;

    public MemberEntity_getInstagramUrl_20844999493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4343 = new Long(3892018155439224435L);
        term4342 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term4417 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term4342, term4342.getClass(), "memberId", term4343);
        setField(term4342, term4342.getClass(), "name", "lihXWlGDxk");
        setField(term4342, term4342.getClass(), "facebookUrl", "JmcmxoGhIK");
        setField(term4342, term4342.getClass(), "instagramUrl", "jXzmYyrnnT");
        setField(term4342, term4342.getClass(), "linkedInUrl", "igCAtimmYB");
        setField(term4342, term4342.getClass(), "imageUrl", "DyiXbeYIaN");
        setField(term4342, term4342.getClass(), "description", "VGizxZnyHX");
        setIntField(term4417, term4417.getClass(), "nanos", 666000000);
        setLongField(term4417, term4417.getClass(), "fastTime", 1395468691000L);
        setField(term4417, term4417.getClass(), "cdate", null);
        setField(term4342, term4342.getClass(), "createTimestamp", term4417);
        setBooleanField(term4342, term4342.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstagramUrl", argTypes, term4342, args);
    }

};


