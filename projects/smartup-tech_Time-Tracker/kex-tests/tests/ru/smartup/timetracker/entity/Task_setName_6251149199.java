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

public class Task_setName_6251149199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100369;

    public Task_setName_6251149199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100369 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100386 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100389 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100369, term100369.getClass(), "id", -8603648071751666348L);
        setField(term100369, term100369.getClass(), "name", "EgSgEFIyyN");
        setIntField(term100369, term100369.getClass(), "projectId", -1698809299);
        setBooleanField(term100369, term100369.getClass(), "billable", true);
        setBooleanField(term100369, term100369.getClass(), "isArchived", true);
        setIntField(term100386, term100386.getClass(), "nanos", 59000000);
        setLongField(term100386, term100386.getClass(), "fastTime", 1429693308000L);
        setField(term100386, term100386.getClass(), "cdate", null);
        setField(term100369, term100369.getClass(), "createdDate", term100386);
        setIntField(term100389, term100389.getClass(), "nanos", 241000000);
        setLongField(term100389, term100389.getClass(), "fastTime", 1781526634000L);
        setField(term100389, term100389.getClass(), "cdate", null);
        setField(term100369, term100369.getClass(), "lastModifiedDate", term100389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iAOFcXaLSf";
        callMethod(klass, "setName", argTypes, term100369, args);
    }

};


