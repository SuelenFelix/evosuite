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

public class CategoryEntity_getDescription_3103136042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16255;

    public CategoryEntity_getDescription_3103136042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16256 = new Long(-6587807377747738663L);
        term16255 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16294 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16255, term16255.getClass(), "categoryId", term16256);
        setField(term16255, term16255.getClass(), "name", "ABPtcyCzkR");
        setField(term16255, term16255.getClass(), "description", "QgHhxMyKvr");
        setField(term16255, term16255.getClass(), "imageUrl", "VGiXZZTWRO");
        setIntField(term16294, term16294.getClass(), "nanos", 658000000);
        setLongField(term16294, term16294.getClass(), "fastTime", 1456363915000L);
        setField(term16294, term16294.getClass(), "cdate", null);
        setField(term16255, term16255.getClass(), "createTimestamp", term16294);
        setBooleanField(term16255, term16255.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term16255, args);
    }

};


