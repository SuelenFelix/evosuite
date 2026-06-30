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

public class CategoryEntity_setName_16930450417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16622;

    public CategoryEntity_setName_16930450417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16623 = new Long(-1333707622307134180L);
        term16622 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16661 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16622, term16622.getClass(), "categoryId", term16623);
        setField(term16622, term16622.getClass(), "name", "FnEkAHBfyV");
        setField(term16622, term16622.getClass(), "description", "VfmNFpEuax");
        setField(term16622, term16622.getClass(), "imageUrl", "ANHjlWPmZG");
        setIntField(term16661, term16661.getClass(), "nanos", 453000000);
        setLongField(term16661, term16661.getClass(), "fastTime", 1386170097000L);
        setField(term16661, term16661.getClass(), "cdate", null);
        setField(term16622, term16622.getClass(), "createTimestamp", term16661);
        setBooleanField(term16622, term16622.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SibzENsyyy";
        callMethod(klass, "setName", argTypes, term16622, args);
    }

};


