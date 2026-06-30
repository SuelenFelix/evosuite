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

public class CategoryEntity_getCreateTimestamp_21274321314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16401;

    public CategoryEntity_getCreateTimestamp_21274321314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16402 = new Long(8166095254618543564L);
        term16401 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16440 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16401, term16401.getClass(), "categoryId", term16402);
        setField(term16401, term16401.getClass(), "name", "EgSgEFIyyN");
        setField(term16401, term16401.getClass(), "description", "iAOFcXaLSf");
        setField(term16401, term16401.getClass(), "imageUrl", "EHoNUaeyvT");
        setIntField(term16440, term16440.getClass(), "nanos", 973000000);
        setLongField(term16440, term16440.getClass(), "fastTime", 1862647013000L);
        setField(term16440, term16440.getClass(), "cdate", null);
        setField(term16401, term16401.getClass(), "createTimestamp", term16440);
        setBooleanField(term16401, term16401.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term16401, args);
    }

};


