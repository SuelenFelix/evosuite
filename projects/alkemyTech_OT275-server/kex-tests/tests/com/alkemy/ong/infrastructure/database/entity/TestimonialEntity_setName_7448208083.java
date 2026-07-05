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

public class TestimonialEntity_setName_7448208083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2517;

    public TestimonialEntity_setName_7448208083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2518 = new Long(1233889271256172047L);
        term2517 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term2556 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2517, term2517.getClass(), "testimonialId", term2518);
        setField(term2517, term2517.getClass(), "name", "AWRooQKkdW");
        setField(term2517, term2517.getClass(), "imageUrl", "vjxIhXHxGR");
        setField(term2517, term2517.getClass(), "content", "QXzGXbEXMu");
        setIntField(term2556, term2556.getClass(), "nanos", 559000000);
        setLongField(term2556, term2556.getClass(), "fastTime", 1876862000000L);
        setField(term2556, term2556.getClass(), "cdate", null);
        setField(term2517, term2517.getClass(), "createTimestamp", term2556);
        setBooleanField(term2517, term2517.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qxSDVejjiY";
        callMethod(klass, "setName", argTypes, term2517, args);
    }

};


