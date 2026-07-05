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

public class ActivityEntity_setContent_4704186329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7419;

    public ActivityEntity_setContent_4704186329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7420 = new Long(2701184207686293431L);
        term7419 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term7458 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7419, term7419.getClass(), "activityId", term7420);
        setField(term7419, term7419.getClass(), "name", "QSrDQfEsTR");
        setField(term7419, term7419.getClass(), "content", "PsqusYmejD");
        setField(term7419, term7419.getClass(), "imageUrl", "NTWMiBEaDF");
        setIntField(term7458, term7458.getClass(), "nanos", 774000000);
        setLongField(term7458, term7458.getClass(), "fastTime", 1597410965000L);
        setField(term7458, term7458.getClass(), "cdate", null);
        setField(term7419, term7419.getClass(), "createTimestamp", term7458);
        setBooleanField(term7419, term7419.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPBstwKFVr";
        callMethod(klass, "setContent", argTypes, term7419, args);
    }

};


