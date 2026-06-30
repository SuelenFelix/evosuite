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

public class TestimonialEntity_getCreateTimestamp_31043371812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3245;

    public TestimonialEntity_getCreateTimestamp_31043371812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3246 = new Long(4784595517102746672L);
        term3245 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term3284 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3245, term3245.getClass(), "testimonialId", term3246);
        setField(term3245, term3245.getClass(), "name", "xJgPlLxpgC");
        setField(term3245, term3245.getClass(), "imageUrl", "EYtfuJaxiM");
        setField(term3245, term3245.getClass(), "content", "gCWtLVKVVe");
        setIntField(term3284, term3284.getClass(), "nanos", 434000000);
        setLongField(term3284, term3284.getClass(), "fastTime", 1426008074000L);
        setField(term3284, term3284.getClass(), "cdate", null);
        setField(term3245, term3245.getClass(), "createTimestamp", term3284);
        setBooleanField(term3245, term3245.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term3245, args);
    }

};


