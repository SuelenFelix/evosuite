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

public class TestimonialEntity_setContent_14485343865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2707;

    public TestimonialEntity_setContent_14485343865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2708 = new Long(1439298019805881866L);
        term2707 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term2746 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2707, term2707.getClass(), "testimonialId", term2708);
        setField(term2707, term2707.getClass(), "name", "eVpkWxjuki");
        setField(term2707, term2707.getClass(), "imageUrl", "SJiQaLvSKv");
        setField(term2707, term2707.getClass(), "content", "OEXDRUKcFl");
        setIntField(term2746, term2746.getClass(), "nanos", 101000000);
        setLongField(term2746, term2746.getClass(), "fastTime", 1488715102000L);
        setField(term2746, term2746.getClass(), "cdate", null);
        setField(term2707, term2707.getClass(), "createTimestamp", term2746);
        setBooleanField(term2707, term2707.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RYdKCNNMBR";
        callMethod(klass, "setContent", argTypes, term2707, args);
    }

};


