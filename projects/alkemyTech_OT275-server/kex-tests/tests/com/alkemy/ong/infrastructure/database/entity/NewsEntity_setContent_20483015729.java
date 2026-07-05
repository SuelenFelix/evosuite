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

public class NewsEntity_setContent_20483015729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1339;

    public NewsEntity_setContent_20483015729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1340 = new Long(-4920224193275732920L);
        Long term1379 = new Long(8428634514691209827L);
        term1339 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term1378 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term1417 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1421 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1339, term1339.getClass(), "newsId", term1340);
        setField(term1339, term1339.getClass(), "name", "YRHGsAkhxb");
        setField(term1339, term1339.getClass(), "content", "ffYhPOzlUs");
        setField(term1339, term1339.getClass(), "imageUrl", "MLqYREekMl");
        setField(term1378, term1378.getClass(), "categoryId", term1379);
        setField(term1378, term1378.getClass(), "name", "ytSBIKXogI");
        setField(term1378, term1378.getClass(), "description", "nHXjMycHlU");
        setField(term1378, term1378.getClass(), "imageUrl", "ieCtQFdkii");
        setIntField(term1417, term1417.getClass(), "nanos", 825000000);
        setLongField(term1417, term1417.getClass(), "fastTime", 1668558429000L);
        setField(term1417, term1417.getClass(), "cdate", null);
        setField(term1378, term1378.getClass(), "createTimestamp", term1417);
        setBooleanField(term1378, term1378.getClass(), "softDeleted", false);
        setField(term1339, term1339.getClass(), "category", term1378);
        setIntField(term1421, term1421.getClass(), "nanos", 647000000);
        setLongField(term1421, term1421.getClass(), "fastTime", 1725111417000L);
        setField(term1421, term1421.getClass(), "cdate", null);
        setField(term1339, term1339.getClass(), "createTimestamp", term1421);
        setBooleanField(term1339, term1339.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dEnhdmILtU";
        callMethod(klass, "setContent", argTypes, term1339, args);
    }

};


