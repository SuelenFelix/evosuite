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

public class CategoryEntity_setCreateTimestamp_90463215110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16907;
     Object term16950;

    public CategoryEntity_setCreateTimestamp_90463215110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16908 = new Long(3452833434644634217L);
        term16907 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16946 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16907, term16907.getClass(), "categoryId", term16908);
        setField(term16907, term16907.getClass(), "name", "tvxYdqiyGc");
        setField(term16907, term16907.getClass(), "description", "ZEXFoMSKeG");
        setField(term16907, term16907.getClass(), "imageUrl", "HvxahUfZcJ");
        setIntField(term16946, term16946.getClass(), "nanos", 790000000);
        setLongField(term16946, term16946.getClass(), "fastTime", 1831731929000L);
        setField(term16946, term16946.getClass(), "cdate", null);
        setField(term16907, term16907.getClass(), "createTimestamp", term16946);
        setBooleanField(term16907, term16907.getClass(), "softDeleted", false);
        term16950 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term16950, term16950.getClass(), "nanos", 909000000);
        setLongField(term16950, term16950.getClass(), "fastTime", 1673365151000L);
        setField(term16950, term16950.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term16950;
        callMethod(klass, "setCreateTimestamp", argTypes, term16907, args);
    }

};


