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

public class CategoryEntity_getImageUrl_15109526403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16328;

    public CategoryEntity_getImageUrl_15109526403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16329 = new Long(-6301101997917060727L);
        term16328 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16367 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16328, term16328.getClass(), "categoryId", term16329);
        setField(term16328, term16328.getClass(), "name", "MlPtwXnJOJ");
        setField(term16328, term16328.getClass(), "description", "DbfiyFeaTe");
        setField(term16328, term16328.getClass(), "imageUrl", "dQxXGBtDLZ");
        setIntField(term16367, term16367.getClass(), "nanos", 660000000);
        setLongField(term16367, term16367.getClass(), "fastTime", 1340898768000L);
        setField(term16367, term16367.getClass(), "cdate", null);
        setField(term16328, term16328.getClass(), "createTimestamp", term16367);
        setBooleanField(term16328, term16328.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term16328, args);
    }

};


