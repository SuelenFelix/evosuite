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

public class CategoryEntity_setDescription_2072627888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16717;

    public CategoryEntity_setDescription_2072627888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16718 = new Long(-4360569253593381888L);
        term16717 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16756 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16717, term16717.getClass(), "categoryId", term16718);
        setField(term16717, term16717.getClass(), "name", "mrqGHotaef");
        setField(term16717, term16717.getClass(), "description", "UbZGBpQZQW");
        setField(term16717, term16717.getClass(), "imageUrl", "SvGTualQPa");
        setIntField(term16756, term16756.getClass(), "nanos", 439000000);
        setLongField(term16756, term16756.getClass(), "fastTime", 1546759187000L);
        setField(term16756, term16756.getClass(), "cdate", null);
        setField(term16717, term16717.getClass(), "createTimestamp", term16756);
        setBooleanField(term16717, term16717.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mdxcgZwsaP";
        callMethod(klass, "setDescription", argTypes, term16717, args);
    }

};


