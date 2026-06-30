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

public class Task_isArchived_18830597875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100235;

    public Task_isArchived_18830597875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100235 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100252 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100255 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100235, term100235.getClass(), "id", 5381386339318883012L);
        setField(term100235, term100235.getClass(), "name", "VGiXZZTWRO");
        setIntField(term100235, term100235.getClass(), "projectId", -1518419301);
        setBooleanField(term100235, term100235.getClass(), "billable", true);
        setBooleanField(term100235, term100235.getClass(), "isArchived", false);
        setIntField(term100252, term100252.getClass(), "nanos", 666000000);
        setLongField(term100252, term100252.getClass(), "fastTime", 1285517574000L);
        setField(term100252, term100252.getClass(), "cdate", null);
        setField(term100235, term100235.getClass(), "createdDate", term100252);
        setIntField(term100255, term100255.getClass(), "nanos", 730000000);
        setLongField(term100255, term100255.getClass(), "fastTime", 1349587635000L);
        setField(term100255, term100255.getClass(), "cdate", null);
        setField(term100235, term100235.getClass(), "lastModifiedDate", term100255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchived", argTypes, term100235, args);
    }

};


