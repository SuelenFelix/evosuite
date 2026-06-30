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

public class MemberEntity_getCreateTimestamp_13396127037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4898;

    public MemberEntity_getCreateTimestamp_13396127037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4899 = new Long(-1610676979013636850L);
        term4898 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term4973 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term4898, term4898.getClass(), "memberId", term4899);
        setField(term4898, term4898.getClass(), "name", "iikZEapDlu");
        setField(term4898, term4898.getClass(), "facebookUrl", "nhoHrZfnIN");
        setField(term4898, term4898.getClass(), "instagramUrl", "ZkMALXpEAZ");
        setField(term4898, term4898.getClass(), "linkedInUrl", "tXfQjSqDzN");
        setField(term4898, term4898.getClass(), "imageUrl", "BjugTaMcxJ");
        setField(term4898, term4898.getClass(), "description", "vGiuZVPJNH");
        setIntField(term4973, term4973.getClass(), "nanos", 277000000);
        setLongField(term4973, term4973.getClass(), "fastTime", 1838346979000L);
        setField(term4973, term4973.getClass(), "cdate", null);
        setField(term4898, term4898.getClass(), "createTimestamp", term4973);
        setBooleanField(term4898, term4898.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term4898, args);
    }

};


