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

public class MemberEntity_getDescription_4775058246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4759;

    public MemberEntity_getDescription_4775058246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4760 = new Long(2443640364875054177L);
        term4759 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity"));
        Object term4834 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term4759, term4759.getClass(), "memberId", term4760);
        setField(term4759, term4759.getClass(), "name", "DhjNLmRMCu");
        setField(term4759, term4759.getClass(), "facebookUrl", "PgPzMSEjjX");
        setField(term4759, term4759.getClass(), "instagramUrl", "wzsPSPcRdj");
        setField(term4759, term4759.getClass(), "linkedInUrl", "kGMQdqJYyB");
        setField(term4759, term4759.getClass(), "imageUrl", "XJJNClzHRf");
        setField(term4759, term4759.getClass(), "description", "HDaezxQfQR");
        setIntField(term4834, term4834.getClass(), "nanos", 543000000);
        setLongField(term4834, term4834.getClass(), "fastTime", 1345912703000L);
        setField(term4834, term4834.getClass(), "cdate", null);
        setField(term4759, term4759.getClass(), "createTimestamp", term4834);
        setBooleanField(term4759, term4759.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.MemberEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term4759, args);
    }

};


