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

public class ActivityEntity_setImageUrl_163754498510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7514;

    public ActivityEntity_setImageUrl_163754498510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7515 = new Long(4474998035090263139L);
        term7514 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term7553 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7514, term7514.getClass(), "activityId", term7515);
        setField(term7514, term7514.getClass(), "name", "WxYUTuqmIq");
        setField(term7514, term7514.getClass(), "content", "OeQLvhVERT");
        setField(term7514, term7514.getClass(), "imageUrl", "IlvgFINwIa");
        setIntField(term7553, term7553.getClass(), "nanos", 477000000);
        setLongField(term7553, term7553.getClass(), "fastTime", 1354724525000L);
        setField(term7553, term7553.getClass(), "cdate", null);
        setField(term7514, term7514.getClass(), "createTimestamp", term7553);
        setBooleanField(term7514, term7514.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GEJABPlHSI";
        callMethod(klass, "setImageUrl", argTypes, term7514, args);
    }

};


