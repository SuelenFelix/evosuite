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

public class CategoryEntity_getName_8820456871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16182;

    public CategoryEntity_getName_8820456871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16183 = new Long(-3948863953565024517L);
        term16182 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16221 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16182, term16182.getClass(), "categoryId", term16183);
        setField(term16182, term16182.getClass(), "name", "blSffTnsOv");
        setField(term16182, term16182.getClass(), "description", "qbUMcIvEXH");
        setField(term16182, term16182.getClass(), "imageUrl", "TVxGTjeDcu");
        setIntField(term16221, term16221.getClass(), "nanos", 220000000);
        setLongField(term16221, term16221.getClass(), "fastTime", 1644765329000L);
        setField(term16221, term16221.getClass(), "cdate", null);
        setField(term16182, term16182.getClass(), "createTimestamp", term16221);
        setBooleanField(term16182, term16182.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term16182, args);
    }

};


