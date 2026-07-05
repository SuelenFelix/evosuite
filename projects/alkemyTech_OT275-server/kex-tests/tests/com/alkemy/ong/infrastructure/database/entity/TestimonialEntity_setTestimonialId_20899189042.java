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

public class TestimonialEntity_setTestimonialId_20899189042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2442;
     Object term2485;

    public TestimonialEntity_setTestimonialId_20899189042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2443 = new Long(-6823727938421990489L);
        term2442 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term2481 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2442, term2442.getClass(), "testimonialId", term2443);
        setField(term2442, term2442.getClass(), "name", "BKLfkLiZTH");
        setField(term2442, term2442.getClass(), "imageUrl", "SPpkrGcPRr");
        setField(term2442, term2442.getClass(), "content", "sEccwbJKYE");
        setIntField(term2481, term2481.getClass(), "nanos", 918000000);
        setLongField(term2481, term2481.getClass(), "fastTime", 1659983392000L);
        setField(term2481, term2481.getClass(), "cdate", null);
        setField(term2442, term2442.getClass(), "createTimestamp", term2481);
        setBooleanField(term2442, term2442.getClass(), "softDeleted", true);
        term2485 = new Long(-484994522244390100L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2485;
        callMethod(klass, "setTestimonialId", argTypes, term2442, args);
    }

};


