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

public class ActivityEntity_setName_2332949468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7324;

    public ActivityEntity_setName_2332949468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7325 = new Long(-8652538484981166496L);
        term7324 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term7363 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7324, term7324.getClass(), "activityId", term7325);
        setField(term7324, term7324.getClass(), "name", "EdPAvpluZg");
        setField(term7324, term7324.getClass(), "content", "DzHVBMqWtE");
        setField(term7324, term7324.getClass(), "imageUrl", "THZSpzBRYP");
        setIntField(term7363, term7363.getClass(), "nanos", 700000000);
        setLongField(term7363, term7363.getClass(), "fastTime", 1465771999000L);
        setField(term7363, term7363.getClass(), "cdate", null);
        setField(term7324, term7324.getClass(), "createTimestamp", term7363);
        setBooleanField(term7324, term7324.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfBIVGBQOE";
        callMethod(klass, "setName", argTypes, term7324, args);
    }

};


