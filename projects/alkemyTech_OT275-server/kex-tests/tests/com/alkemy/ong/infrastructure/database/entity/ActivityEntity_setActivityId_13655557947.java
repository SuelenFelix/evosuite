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

public class ActivityEntity_setActivityId_13655557947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7249;
     Object term7292;

    public ActivityEntity_setActivityId_13655557947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7250 = new Long(-1983291584002806658L);
        term7249 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term7288 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7249, term7249.getClass(), "activityId", term7250);
        setField(term7249, term7249.getClass(), "name", "PXdVZyoJyC");
        setField(term7249, term7249.getClass(), "content", "vLerpqavFM");
        setField(term7249, term7249.getClass(), "imageUrl", "qnvxzwuGKX");
        setIntField(term7288, term7288.getClass(), "nanos", 992000000);
        setLongField(term7288, term7288.getClass(), "fastTime", 1825598044000L);
        setField(term7288, term7288.getClass(), "cdate", null);
        setField(term7249, term7249.getClass(), "createTimestamp", term7288);
        setBooleanField(term7249, term7249.getClass(), "softDeleted", false);
        term7292 = new Long(5946780097489996391L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7292;
        callMethod(klass, "setActivityId", argTypes, term7249, args);
    }

};


