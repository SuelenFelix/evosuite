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

public class TestimonialEntity_getName_9750557609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3026;

    public TestimonialEntity_getName_9750557609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3027 = new Long(-2068172595987555756L);
        term3026 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term3065 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term3026, term3026.getClass(), "testimonialId", term3027);
        setField(term3026, term3026.getClass(), "name", "XOiDvlDhdc");
        setField(term3026, term3026.getClass(), "imageUrl", "AdxvLJhNLe");
        setField(term3026, term3026.getClass(), "content", "lHfTrWKMPk");
        setIntField(term3065, term3065.getClass(), "nanos", 50000000);
        setLongField(term3065, term3065.getClass(), "fastTime", 1822693844000L);
        setField(term3065, term3065.getClass(), "cdate", null);
        setField(term3026, term3026.getClass(), "createTimestamp", term3065);
        setBooleanField(term3026, term3026.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3026, args);
    }

};


