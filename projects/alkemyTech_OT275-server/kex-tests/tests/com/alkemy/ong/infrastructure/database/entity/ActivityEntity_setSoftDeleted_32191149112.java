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
import java.lang.Boolean;

public class ActivityEntity_setSoftDeleted_32191149112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7685;
     Object term7728;

    public ActivityEntity_setSoftDeleted_32191149112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7686 = new Long(-8876856890348836498L);
        term7685 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term7724 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7685, term7685.getClass(), "activityId", term7686);
        setField(term7685, term7685.getClass(), "name", "wdoqITnaAP");
        setField(term7685, term7685.getClass(), "content", "rIPMBcrNqB");
        setField(term7685, term7685.getClass(), "imageUrl", "UDaboHZHhz");
        setIntField(term7724, term7724.getClass(), "nanos", 309000000);
        setLongField(term7724, term7724.getClass(), "fastTime", 1589735951000L);
        setField(term7724, term7724.getClass(), "cdate", null);
        setField(term7685, term7685.getClass(), "createTimestamp", term7724);
        setBooleanField(term7685, term7685.getClass(), "softDeleted", false);
        term7728 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7728;
        callMethod(klass, "setSoftDeleted", argTypes, term7685, args);
    }

};


