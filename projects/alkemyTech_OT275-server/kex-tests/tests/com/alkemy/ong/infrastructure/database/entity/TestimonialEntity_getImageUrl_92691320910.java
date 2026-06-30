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

public class TestimonialEntity_getImageUrl_92691320910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3099;

    public TestimonialEntity_getImageUrl_92691320910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3100 = new Long(-6292278961887936280L);
        term3099 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term3138 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3099, term3099.getClass(), "testimonialId", term3100);
        setField(term3099, term3099.getClass(), "name", "JDaAnsVTGV");
        setField(term3099, term3099.getClass(), "imageUrl", "mLUZFTfjle");
        setField(term3099, term3099.getClass(), "content", "xIeFjkHkOe");
        setIntField(term3138, term3138.getClass(), "nanos", 298000000);
        setLongField(term3138, term3138.getClass(), "fastTime", 1678166815000L);
        setField(term3138, term3138.getClass(), "cdate", null);
        setField(term3099, term3099.getClass(), "createTimestamp", term3138);
        setBooleanField(term3099, term3099.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term3099, args);
    }

};


