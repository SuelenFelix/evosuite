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

public class TestimonialEntity_isSoftDeleted_211908772713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3318;

    public TestimonialEntity_isSoftDeleted_211908772713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3319 = new Long(-7612550318181586304L);
        term3318 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term3357 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3318, term3318.getClass(), "testimonialId", term3319);
        setField(term3318, term3318.getClass(), "name", "fWKJoSoCwE");
        setField(term3318, term3318.getClass(), "imageUrl", "wfaXBpWAUH");
        setField(term3318, term3318.getClass(), "content", "VMeAzAHwZj");
        setIntField(term3357, term3357.getClass(), "nanos", 487000000);
        setLongField(term3357, term3357.getClass(), "fastTime", 1632993975000L);
        setField(term3357, term3357.getClass(), "cdate", null);
        setField(term3318, term3318.getClass(), "createTimestamp", term3357);
        setBooleanField(term3318, term3318.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSoftDeleted", argTypes, term3318, args);
    }

};


