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

public class CategoryEntity_isSoftDeleted_3187781225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16474;

    public CategoryEntity_isSoftDeleted_3187781225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16475 = new Long(-4598158870068953328L);
        term16474 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16513 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16474, term16474.getClass(), "categoryId", term16475);
        setField(term16474, term16474.getClass(), "name", "ZwKmasCVIy");
        setField(term16474, term16474.getClass(), "description", "pxokrVaeMd");
        setField(term16474, term16474.getClass(), "imageUrl", "ujxmmZZcbT");
        setIntField(term16513, term16513.getClass(), "nanos", 379000000);
        setLongField(term16513, term16513.getClass(), "fastTime", 1299420278000L);
        setField(term16513, term16513.getClass(), "cdate", null);
        setField(term16474, term16474.getClass(), "createTimestamp", term16513);
        setBooleanField(term16474, term16474.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSoftDeleted", argTypes, term16474, args);
    }

};


