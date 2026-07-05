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

public class CategoryEntity_setSoftDeleted_113783860411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16983;
     Object term17026;

    public CategoryEntity_setSoftDeleted_113783860411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16984 = new Long(-8603648071751666348L);
        term16983 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term17022 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16983, term16983.getClass(), "categoryId", term16984);
        setField(term16983, term16983.getClass(), "name", "WkLpmqoQxy");
        setField(term16983, term16983.getClass(), "description", "XiNoscmYhd");
        setField(term16983, term16983.getClass(), "imageUrl", "asMqnMNrZp");
        setIntField(term17022, term17022.getClass(), "nanos", 222000000);
        setLongField(term17022, term17022.getClass(), "fastTime", 1816268547000L);
        setField(term17022, term17022.getClass(), "cdate", null);
        setField(term16983, term16983.getClass(), "createTimestamp", term17022);
        setBooleanField(term16983, term16983.getClass(), "softDeleted", false);
        term17026 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17026;
        callMethod(klass, "setSoftDeleted", argTypes, term16983, args);
    }

};


