package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Task_getCreatedDate_9560247856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100268;

    public Task_getCreatedDate_9560247856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100268 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100285 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100288 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100268, term100268.getClass(), "id", -1333707622307134180L);
        setField(term100268, term100268.getClass(), "name", "MlPtwXnJOJ");
        setIntField(term100268, term100268.getClass(), "projectId", 674879025);
        setBooleanField(term100268, term100268.getClass(), "billable", true);
        setBooleanField(term100268, term100268.getClass(), "isArchived", true);
        setIntField(term100285, term100285.getClass(), "nanos", 619000000);
        setLongField(term100285, term100285.getClass(), "fastTime", 1665688084000L);
        setField(term100285, term100285.getClass(), "cdate", null);
        setField(term100268, term100268.getClass(), "createdDate", term100285);
        setIntField(term100288, term100288.getClass(), "nanos", 156000000);
        setLongField(term100288, term100288.getClass(), "fastTime", 1336444825000L);
        setField(term100288, term100288.getClass(), "cdate", null);
        setField(term100268, term100268.getClass(), "lastModifiedDate", term100288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term100268, args);
    }

};


