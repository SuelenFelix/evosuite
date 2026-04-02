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
import java.lang.Boolean;

public class TestimonialEntity_setSoftDeleted_13000272457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2878;
     Object term2921;

    public TestimonialEntity_setSoftDeleted_13000272457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2879 = new Long(5907001541142728739L);
        term2878 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term2917 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2878, term2878.getClass(), "testimonialId", term2879);
        setField(term2878, term2878.getClass(), "name", "XylxrMBraH");
        setField(term2878, term2878.getClass(), "imageUrl", "pORebkoRdD");
        setField(term2878, term2878.getClass(), "content", "mXGCWJDOqA");
        setIntField(term2917, term2917.getClass(), "nanos", 888000000);
        setLongField(term2917, term2917.getClass(), "fastTime", 1464410989000L);
        setField(term2917, term2917.getClass(), "cdate", null);
        setField(term2878, term2878.getClass(), "createTimestamp", term2917);
        setBooleanField(term2878, term2878.getClass(), "softDeleted", true);
        term2921 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2921;
        callMethod(klass, "setSoftDeleted", argTypes, term2878, args);
    }

};


