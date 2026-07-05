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

public class CategoryEntity_getCategoryId_2826338720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16109;

    public CategoryEntity_getCategoryId_2826338720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16110 = new Long(-2924531382671518368L);
        term16109 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16148 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16109, term16109.getClass(), "categoryId", term16110);
        setField(term16109, term16109.getClass(), "name", "BcENaQFYSd");
        setField(term16109, term16109.getClass(), "description", "POPYycoDBy");
        setField(term16109, term16109.getClass(), "imageUrl", "LuWMOXdAPA");
        setIntField(term16148, term16148.getClass(), "nanos", 88000000);
        setLongField(term16148, term16148.getClass(), "fastTime", 1709168090000L);
        setField(term16148, term16148.getClass(), "cdate", null);
        setField(term16109, term16109.getClass(), "createTimestamp", term16148);
        setBooleanField(term16109, term16109.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryId", argTypes, term16109, args);
    }

};


