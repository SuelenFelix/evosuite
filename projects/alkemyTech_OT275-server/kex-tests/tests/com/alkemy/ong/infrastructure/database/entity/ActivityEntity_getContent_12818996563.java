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

public class ActivityEntity_getContent_12818996563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6957;

    public ActivityEntity_getContent_12818996563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6958 = new Long(7862575738391801707L);
        term6957 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term6996 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term6957, term6957.getClass(), "activityId", term6958);
        setField(term6957, term6957.getClass(), "name", "GJVkUrCVdD");
        setField(term6957, term6957.getClass(), "content", "zNdorvdUgu");
        setField(term6957, term6957.getClass(), "imageUrl", "oPxuZbkYio");
        setIntField(term6996, term6996.getClass(), "nanos", 53000000);
        setLongField(term6996, term6996.getClass(), "fastTime", 1531320602000L);
        setField(term6996, term6996.getClass(), "cdate", null);
        setField(term6957, term6957.getClass(), "createTimestamp", term6996);
        setBooleanField(term6957, term6957.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term6957, args);
    }

};


