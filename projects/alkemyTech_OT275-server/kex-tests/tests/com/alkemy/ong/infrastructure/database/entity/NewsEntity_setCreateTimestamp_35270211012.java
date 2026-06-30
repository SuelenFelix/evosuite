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

public class NewsEntity_setCreateTimestamp_35270211012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1894;
     Object term1980;

    public NewsEntity_setCreateTimestamp_35270211012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1895 = new Long(-7672528020740371001L);
        Long term1934 = new Long(-4502405999831680926L);
        term1894 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term1933 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term1972 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1976 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1894, term1894.getClass(), "newsId", term1895);
        setField(term1894, term1894.getClass(), "name", "OWKQODBLzb");
        setField(term1894, term1894.getClass(), "content", "wGmYcqUkgE");
        setField(term1894, term1894.getClass(), "imageUrl", "idgaQsnJpQ");
        setField(term1933, term1933.getClass(), "categoryId", term1934);
        setField(term1933, term1933.getClass(), "name", "VgZnGoIFwQ");
        setField(term1933, term1933.getClass(), "description", "jUbSRrkrYZ");
        setField(term1933, term1933.getClass(), "imageUrl", "bWWfajKbEX");
        setIntField(term1972, term1972.getClass(), "nanos", 899000000);
        setLongField(term1972, term1972.getClass(), "fastTime", 1502147353000L);
        setField(term1972, term1972.getClass(), "cdate", null);
        setField(term1933, term1933.getClass(), "createTimestamp", term1972);
        setBooleanField(term1933, term1933.getClass(), "softDeleted", false);
        setField(term1894, term1894.getClass(), "category", term1933);
        setIntField(term1976, term1976.getClass(), "nanos", 759000000);
        setLongField(term1976, term1976.getClass(), "fastTime", 1630941844000L);
        setField(term1976, term1976.getClass(), "cdate", null);
        setField(term1894, term1894.getClass(), "createTimestamp", term1976);
        setBooleanField(term1894, term1894.getClass(), "softDeleted", false);
        term1980 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term1980, term1980.getClass(), "nanos", 956000000);
        setLongField(term1980, term1980.getClass(), "fastTime", 1739406992000L);
        setField(term1980, term1980.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term1980;
        callMethod(klass, "setCreateTimestamp", argTypes, term1894, args);
    }

};


