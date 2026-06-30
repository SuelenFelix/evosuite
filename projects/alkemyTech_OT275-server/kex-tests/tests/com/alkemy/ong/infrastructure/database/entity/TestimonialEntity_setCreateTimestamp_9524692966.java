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

public class TestimonialEntity_setCreateTimestamp_9524692966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2802;
     Object term2845;

    public TestimonialEntity_setCreateTimestamp_9524692966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2803 = new Long(-8708192233349544946L);
        term2802 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term2841 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2802, term2802.getClass(), "testimonialId", term2803);
        setField(term2802, term2802.getClass(), "name", "yGtHPyvYiQ");
        setField(term2802, term2802.getClass(), "imageUrl", "MvRIxilFMJ");
        setField(term2802, term2802.getClass(), "content", "iNwOJRBEjp");
        setIntField(term2841, term2841.getClass(), "nanos", 361000000);
        setLongField(term2841, term2841.getClass(), "fastTime", 1311549317000L);
        setField(term2841, term2841.getClass(), "cdate", null);
        setField(term2802, term2802.getClass(), "createTimestamp", term2841);
        setBooleanField(term2802, term2802.getClass(), "softDeleted", true);
        term2845 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term2845, term2845.getClass(), "nanos", 842000000);
        setLongField(term2845, term2845.getClass(), "fastTime", 1595506783000L);
        setField(term2845, term2845.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term2845;
        callMethod(klass, "setCreateTimestamp", argTypes, term2802, args);
    }

};


