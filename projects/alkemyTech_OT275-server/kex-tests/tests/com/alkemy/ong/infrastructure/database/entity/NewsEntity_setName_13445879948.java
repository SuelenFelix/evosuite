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

public class NewsEntity_setName_13445879948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1171;

    public NewsEntity_setName_13445879948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1172 = new Long(5127676408959197577L);
        Long term1211 = new Long(-6573104506744284592L);
        term1171 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term1210 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term1249 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1253 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1171, term1171.getClass(), "newsId", term1172);
        setField(term1171, term1171.getClass(), "name", "xLbjWUgOIL");
        setField(term1171, term1171.getClass(), "content", "jDtqGUpnZN");
        setField(term1171, term1171.getClass(), "imageUrl", "nGKItKLYNC");
        setField(term1210, term1210.getClass(), "categoryId", term1211);
        setField(term1210, term1210.getClass(), "name", "UiUYnPrcCi");
        setField(term1210, term1210.getClass(), "description", "UoYtihxVaS");
        setField(term1210, term1210.getClass(), "imageUrl", "JDswTTCZHV");
        setIntField(term1249, term1249.getClass(), "nanos", 364000000);
        setLongField(term1249, term1249.getClass(), "fastTime", 1882628084000L);
        setField(term1249, term1249.getClass(), "cdate", null);
        setField(term1210, term1210.getClass(), "createTimestamp", term1249);
        setBooleanField(term1210, term1210.getClass(), "softDeleted", true);
        setField(term1171, term1171.getClass(), "category", term1210);
        setIntField(term1253, term1253.getClass(), "nanos", 580000000);
        setLongField(term1253, term1253.getClass(), "fastTime", 1437746523000L);
        setField(term1253, term1253.getClass(), "cdate", null);
        setField(term1171, term1171.getClass(), "createTimestamp", term1253);
        setBooleanField(term1171, term1171.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        callMethod(klass, "setName", argTypes, term1171, args);
    }

};


