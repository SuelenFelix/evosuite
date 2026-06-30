package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ActivityEntityMapper_toDomain_6722559061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435;
     Object term436;

    public ActivityEntityMapper_toDomain_6722559061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.ActivityEntityMapper"));
        Long term437 = new Long(-7237588299778557629L);
        term436 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity"));
        Object term475 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term436, term436.getClass(), "activityId", term437);
        setField(term436, term436.getClass(), "name", "dWRymuLBtr");
        setField(term436, term436.getClass(), "content", "AijpHYOFuy");
        setField(term436, term436.getClass(), "imageUrl", "SbAoxhfrkn");
        setIntField(term475, term475.getClass(), "nanos", 244000000);
        setLongField(term475, term475.getClass(), "fastTime", 1345860612000L);
        setField(term475, term475.getClass(), "cdate", null);
        setField(term436, term436.getClass(), "createTimestamp", term475);
        setBooleanField(term436, term436.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.ActivityEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.database.entity.ActivityEntity");
        Object[] args = new Object[1];
        args[0] = term436;
        callMethod(klass, "toDomain", argTypes, term435, args);
    }

};


