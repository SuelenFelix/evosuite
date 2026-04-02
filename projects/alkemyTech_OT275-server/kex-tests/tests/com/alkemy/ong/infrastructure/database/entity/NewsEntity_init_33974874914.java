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
import java.lang.Boolean;

public class NewsEntity_init_33974874914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2191;
     Object term2229;
     Object term2272;
     Object term2275;

    public NewsEntity_init_33974874914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2191 = new Long(6855071767938501807L);
        Long term2230 = new Long(-5892135042702373494L);
        term2229 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term2268 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2229, term2229.getClass(), "categoryId", term2230);
        setField(term2229, term2229.getClass(), "name", "JqXGgAhZPl");
        setField(term2229, term2229.getClass(), "description", "jiKYgYHqIS");
        setField(term2229, term2229.getClass(), "imageUrl", "DfISiziTgG");
        setIntField(term2268, term2268.getClass(), "nanos", 764000000);
        setLongField(term2268, term2268.getClass(), "fastTime", 1496849028000L);
        setField(term2268, term2268.getClass(), "cdate", null);
        setField(term2229, term2229.getClass(), "createTimestamp", term2268);
        setBooleanField(term2229, term2229.getClass(), "softDeleted", true);
        term2272 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term2272, term2272.getClass(), "nanos", 367000000);
        setLongField(term2272, term2272.getClass(), "fastTime", 1691857668000L);
        setField(term2272, term2272.getClass(), "cdate", null);
        term2275 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        argTypes[5] = Class.forName("java.sql.Timestamp");
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term2191;
        args[1] = "swZVeJAxjt";
        args[2] = "xOcJIiQQDu";
        args[3] = "GVizqqzXpy";
        args[4] = term2229;
        args[5] = term2272;
        args[6] = term2275;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


