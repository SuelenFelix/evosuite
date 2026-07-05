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

public class ActivityEntity_isSoftDeleted_11409719736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7176;

    public ActivityEntity_isSoftDeleted_11409719736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7177 = new Long(6005241913654469005L);
        term7176 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term7215 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7176, term7176.getClass(), "activityId", term7177);
        setField(term7176, term7176.getClass(), "name", "DPskuFUobI");
        setField(term7176, term7176.getClass(), "content", "wBGfLpNNiZ");
        setField(term7176, term7176.getClass(), "imageUrl", "yUGCjlqgJE");
        setIntField(term7215, term7215.getClass(), "nanos", 847000000);
        setLongField(term7215, term7215.getClass(), "fastTime", 1467772254000L);
        setField(term7215, term7215.getClass(), "cdate", null);
        setField(term7176, term7176.getClass(), "createTimestamp", term7215);
        setBooleanField(term7176, term7176.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSoftDeleted", argTypes, term7176, args);
    }

};


