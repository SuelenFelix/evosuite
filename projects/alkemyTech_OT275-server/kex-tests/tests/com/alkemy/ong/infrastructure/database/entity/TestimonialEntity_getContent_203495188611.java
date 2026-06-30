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

public class TestimonialEntity_getContent_203495188611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3172;

    public TestimonialEntity_getContent_203495188611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3173 = new Long(-6645965768855543712L);
        term3172 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term3211 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3172, term3172.getClass(), "testimonialId", term3173);
        setField(term3172, term3172.getClass(), "name", "SdCKLMIYnX");
        setField(term3172, term3172.getClass(), "imageUrl", "OJJtVNPyKZ");
        setField(term3172, term3172.getClass(), "content", "AKNapTAfmD");
        setIntField(term3211, term3211.getClass(), "nanos", 186000000);
        setLongField(term3211, term3211.getClass(), "fastTime", 1666065487000L);
        setField(term3211, term3211.getClass(), "cdate", null);
        setField(term3172, term3172.getClass(), "createTimestamp", term3211);
        setBooleanField(term3172, term3172.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term3172, args);
    }

};


