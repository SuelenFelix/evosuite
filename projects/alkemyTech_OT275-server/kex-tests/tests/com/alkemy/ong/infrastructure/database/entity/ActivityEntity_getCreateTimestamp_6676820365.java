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

public class ActivityEntity_getCreateTimestamp_6676820365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7103;

    public ActivityEntity_getCreateTimestamp_6676820365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7104 = new Long(5510783420697225605L);
        term7103 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term7142 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term7103, term7103.getClass(), "activityId", term7104);
        setField(term7103, term7103.getClass(), "name", "TXZAIPQJHt");
        setField(term7103, term7103.getClass(), "content", "DIbeDHICho");
        setField(term7103, term7103.getClass(), "imageUrl", "dJGPlmSRnz");
        setIntField(term7142, term7142.getClass(), "nanos", 896000000);
        setLongField(term7142, term7142.getClass(), "fastTime", 1450854459000L);
        setField(term7142, term7142.getClass(), "cdate", null);
        setField(term7103, term7103.getClass(), "createTimestamp", term7142);
        setBooleanField(term7103, term7103.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term7103, args);
    }

};


