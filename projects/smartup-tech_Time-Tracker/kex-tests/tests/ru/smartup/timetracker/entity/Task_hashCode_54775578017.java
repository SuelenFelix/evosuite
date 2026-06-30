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

public class Task_hashCode_54775578017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100669;

    public Task_hashCode_54775578017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100669 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100686 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100689 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100669, term100669.getClass(), "id", 4266570509071948633L);
        setField(term100669, term100669.getClass(), "name", "FnEkAHBfyV");
        setIntField(term100669, term100669.getClass(), "projectId", 1302807565);
        setBooleanField(term100669, term100669.getClass(), "billable", true);
        setBooleanField(term100669, term100669.getClass(), "isArchived", true);
        setIntField(term100686, term100686.getClass(), "nanos", 594000000);
        setLongField(term100686, term100686.getClass(), "fastTime", 1706789644000L);
        setField(term100686, term100686.getClass(), "cdate", null);
        setField(term100669, term100669.getClass(), "createdDate", term100686);
        setIntField(term100689, term100689.getClass(), "nanos", 25000000);
        setLongField(term100689, term100689.getClass(), "fastTime", 1828797368000L);
        setField(term100689, term100689.getClass(), "cdate", null);
        setField(term100669, term100669.getClass(), "lastModifiedDate", term100689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term100669, args);
    }

};


