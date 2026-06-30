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

public class ActivityEntity_setCreateTimestamp_193058505011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7609;
     Object term7652;

    public ActivityEntity_setCreateTimestamp_193058505011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7610 = new Long(2848819812340321742L);
        term7609 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term7648 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7609, term7609.getClass(), "activityId", term7610);
        setField(term7609, term7609.getClass(), "name", "aQFUvuaYxd");
        setField(term7609, term7609.getClass(), "content", "zNFLXMifnS");
        setField(term7609, term7609.getClass(), "imageUrl", "HHQcYMSBVc");
        setIntField(term7648, term7648.getClass(), "nanos", 422000000);
        setLongField(term7648, term7648.getClass(), "fastTime", 1415415253000L);
        setField(term7648, term7648.getClass(), "cdate", null);
        setField(term7609, term7609.getClass(), "createTimestamp", term7648);
        setBooleanField(term7609, term7609.getClass(), "softDeleted", true);
        term7652 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term7652, term7652.getClass(), "nanos", 69000000);
        setLongField(term7652, term7652.getClass(), "fastTime", 1359775857000L);
        setField(term7652, term7652.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term7652;
        callMethod(klass, "setCreateTimestamp", argTypes, term7609, args);
    }

};


