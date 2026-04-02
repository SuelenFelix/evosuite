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

public class TestimonialEntity_getTestimonialId_5198012188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2953;

    public TestimonialEntity_getTestimonialId_5198012188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2954 = new Long(4178434741742309755L);
        term2953 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term2992 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2953, term2953.getClass(), "testimonialId", term2954);
        setField(term2953, term2953.getClass(), "name", "dpNsDgfPso");
        setField(term2953, term2953.getClass(), "imageUrl", "hCWPJQKpdc");
        setField(term2953, term2953.getClass(), "content", "WzMEhMXkKx");
        setIntField(term2992, term2992.getClass(), "nanos", 488000000);
        setLongField(term2992, term2992.getClass(), "fastTime", 1405268389000L);
        setField(term2992, term2992.getClass(), "cdate", null);
        setField(term2953, term2953.getClass(), "createTimestamp", term2992);
        setBooleanField(term2953, term2953.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestimonialId", argTypes, term2953, args);
    }

};


