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

public class ActivityEntity_getActivityId_13500126881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6811;

    public ActivityEntity_getActivityId_13500126881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6812 = new Long(-5963439350418910964L);
        term6811 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term6850 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term6811, term6811.getClass(), "activityId", term6812);
        setField(term6811, term6811.getClass(), "name", "FjOiNAfBOc");
        setField(term6811, term6811.getClass(), "content", "iCCsaLHohG");
        setField(term6811, term6811.getClass(), "imageUrl", "NJhGgctbdj");
        setIntField(term6850, term6850.getClass(), "nanos", 999000000);
        setLongField(term6850, term6850.getClass(), "fastTime", 1689418010000L);
        setField(term6850, term6850.getClass(), "cdate", null);
        setField(term6811, term6811.getClass(), "createTimestamp", term6850);
        setBooleanField(term6811, term6811.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivityId", argTypes, term6811, args);
    }

};


