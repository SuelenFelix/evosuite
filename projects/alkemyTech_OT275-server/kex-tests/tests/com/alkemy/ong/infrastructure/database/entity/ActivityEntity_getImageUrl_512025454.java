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

public class ActivityEntity_getImageUrl_512025454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7030;

    public ActivityEntity_getImageUrl_512025454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7031 = new Long(50358265865610362L);
        term7030 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term7069 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7030, term7030.getClass(), "activityId", term7031);
        setField(term7030, term7030.getClass(), "name", "vKitydDVnM");
        setField(term7030, term7030.getClass(), "content", "urCiQnUFBM");
        setField(term7030, term7030.getClass(), "imageUrl", "EKjQdtKxAM");
        setIntField(term7069, term7069.getClass(), "nanos", 343000000);
        setLongField(term7069, term7069.getClass(), "fastTime", 1264027000000L);
        setField(term7069, term7069.getClass(), "cdate", null);
        setField(term7030, term7030.getClass(), "createTimestamp", term7069);
        setBooleanField(term7030, term7030.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term7030, args);
    }

};


