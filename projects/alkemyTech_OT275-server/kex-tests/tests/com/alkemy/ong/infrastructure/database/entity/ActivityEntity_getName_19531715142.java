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

public class ActivityEntity_getName_19531715142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6884;

    public ActivityEntity_getName_19531715142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6885 = new Long(9013624480170062917L);
        term6884 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term6923 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term6884, term6884.getClass(), "activityId", term6885);
        setField(term6884, term6884.getClass(), "name", "MYWYUeLGOp");
        setField(term6884, term6884.getClass(), "content", "tsTGdgQYUL");
        setField(term6884, term6884.getClass(), "imageUrl", "TtGbVmKcnX");
        setIntField(term6923, term6923.getClass(), "nanos", 79000000);
        setLongField(term6923, term6923.getClass(), "fastTime", 1570703521000L);
        setField(term6923, term6923.getClass(), "cdate", null);
        setField(term6884, term6884.getClass(), "createTimestamp", term6923);
        setBooleanField(term6884, term6884.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6884, args);
    }

};


