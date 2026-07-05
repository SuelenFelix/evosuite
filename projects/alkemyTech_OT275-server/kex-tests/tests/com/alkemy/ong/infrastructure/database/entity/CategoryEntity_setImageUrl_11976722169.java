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

public class CategoryEntity_setImageUrl_11976722169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16812;

    public CategoryEntity_setImageUrl_11976722169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16813 = new Long(1457594663983990440L);
        term16812 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term16851 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term16812, term16812.getClass(), "categoryId", term16813);
        setField(term16812, term16812.getClass(), "name", "XildIRoZHG");
        setField(term16812, term16812.getClass(), "description", "lEcrFlxJXH");
        setField(term16812, term16812.getClass(), "imageUrl", "VNdDwXMYxR");
        setIntField(term16851, term16851.getClass(), "nanos", 282000000);
        setLongField(term16851, term16851.getClass(), "fastTime", 1851886086000L);
        setField(term16851, term16851.getClass(), "cdate", null);
        setField(term16812, term16812.getClass(), "createTimestamp", term16851);
        setBooleanField(term16812, term16812.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bVbexZPmwW";
        callMethod(klass, "setImageUrl", argTypes, term16812, args);
    }

};


