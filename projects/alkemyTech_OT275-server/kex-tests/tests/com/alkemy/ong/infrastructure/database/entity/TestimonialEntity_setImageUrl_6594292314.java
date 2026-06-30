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

public class TestimonialEntity_setImageUrl_6594292314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2612;

    public TestimonialEntity_setImageUrl_6594292314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2613 = new Long(6617340557564669657L);
        term2612 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity"));
        Object term2651 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2612, term2612.getClass(), "testimonialId", term2613);
        setField(term2612, term2612.getClass(), "name", "xBsXSDjXYK");
        setField(term2612, term2612.getClass(), "imageUrl", "sEnIVFtZuQ");
        setField(term2612, term2612.getClass(), "content", "ZVecLZMLHF");
        setIntField(term2651, term2651.getClass(), "nanos", 366000000);
        setLongField(term2651, term2651.getClass(), "fastTime", 1304521299000L);
        setField(term2651, term2651.getClass(), "cdate", null);
        setField(term2612, term2612.getClass(), "createTimestamp", term2651);
        setBooleanField(term2612, term2612.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.TestimonialEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fztQhjqwdP";
        callMethod(klass, "setImageUrl", argTypes, term2612, args);
    }

};


