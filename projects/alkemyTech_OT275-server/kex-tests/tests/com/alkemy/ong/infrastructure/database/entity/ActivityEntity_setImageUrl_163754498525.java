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

public class ActivityEntity_setImageUrl_163754498525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7851;

    public ActivityEntity_setImageUrl_163754498525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7851 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        setField(term7851, term7851.getClass(), "activityId", null);
        setField(term7851, term7851.getClass(), "name", null);
        setField(term7851, term7851.getClass(), "content", null);
        setField(term7851, term7851.getClass(), "imageUrl", null);
        setField(term7851, term7851.getClass(), "createTimestamp", null);
        setBooleanField(term7851, term7851.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImageUrl", argTypes, term7851, args);
    }

};


