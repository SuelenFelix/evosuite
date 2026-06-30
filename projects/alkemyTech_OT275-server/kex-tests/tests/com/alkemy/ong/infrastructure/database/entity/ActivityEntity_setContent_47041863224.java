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

public class ActivityEntity_setContent_47041863224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7849;

    public ActivityEntity_setContent_47041863224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7849 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        setField(term7849, term7849.getClass(), "activityId", null);
        setField(term7849, term7849.getClass(), "name", null);
        setField(term7849, term7849.getClass(), "content", null);
        setField(term7849, term7849.getClass(), "imageUrl", null);
        setField(term7849, term7849.getClass(), "createTimestamp", null);
        setBooleanField(term7849, term7849.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContent", argTypes, term7849, args);
    }

};


