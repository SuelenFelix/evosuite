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

public class CategoryEntity_setCategoryId_12967649426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16547;
     Object term16590;

    public CategoryEntity_setCategoryId_12967649426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16548 = new Long(138235087558060686L);
        term16547 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16586 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16547, term16547.getClass(), "categoryId", term16548);
        setField(term16547, term16547.getClass(), "name", "BOvgwHfoHQ");
        setField(term16547, term16547.getClass(), "description", "hPpFNeDBIb");
        setField(term16547, term16547.getClass(), "imageUrl", "DNOtiLPAIY");
        setIntField(term16586, term16586.getClass(), "nanos", 231000000);
        setLongField(term16586, term16586.getClass(), "fastTime", 1476959357000L);
        setField(term16586, term16586.getClass(), "cdate", null);
        setField(term16547, term16547.getClass(), "createTimestamp", term16586);
        setBooleanField(term16547, term16547.getClass(), "softDeleted", false);
        term16590 = new Long(5381386339318883012L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term16590;
        callMethod(klass, "setCategoryId", argTypes, term16547, args);
    }

};


