package ru.smartup.timetracker.dto.task.response;

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
import static ru.smartup.timetracker.dto.task.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TaskDto_canEqual_180845568716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1375;
     Object term1398;

    public TaskDto_canEqual_180845568716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1375 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1392 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1395 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1375, term1375.getClass(), "id", 5262507301787091109L);
        setField(term1375, term1375.getClass(), "name", "xLbjWUgOIL");
        setIntField(term1375, term1375.getClass(), "projectId", 579005622);
        setBooleanField(term1375, term1375.getClass(), "billable", true);
        setBooleanField(term1375, term1375.getClass(), "isArchived", true);
        setIntField(term1392, term1392.getClass(), "nanos", 632000000);
        setLongField(term1392, term1392.getClass(), "fastTime", 1442359734000L);
        setField(term1392, term1392.getClass(), "cdate", null);
        setField(term1375, term1375.getClass(), "createdDate", term1392);
        setIntField(term1395, term1395.getClass(), "nanos", 918000000);
        setLongField(term1395, term1395.getClass(), "fastTime", 1659983392000L);
        setField(term1395, term1395.getClass(), "cdate", null);
        setField(term1375, term1375.getClass(), "lastModifiedDate", term1395);
        term1398 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1398;
        callMethod(klass, "canEqual", argTypes, term1375, args);
    }

};


