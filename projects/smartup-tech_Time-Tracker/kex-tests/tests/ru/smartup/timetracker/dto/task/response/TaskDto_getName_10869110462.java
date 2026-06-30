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

public class TaskDto_getName_10869110462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;

    public TaskDto_getName_10869110462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term876 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term893 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term896 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term876, term876.getClass(), "id", 5127676408959197577L);
        setField(term876, term876.getClass(), "name", "SbAoxhfrkn");
        setIntField(term876, term876.getClass(), "projectId", -226514366);
        setBooleanField(term876, term876.getClass(), "billable", false);
        setBooleanField(term876, term876.getClass(), "isArchived", false);
        setIntField(term893, term893.getClass(), "nanos", 830000000);
        setLongField(term893, term893.getClass(), "fastTime", 1610929382000L);
        setField(term893, term893.getClass(), "cdate", null);
        setField(term876, term876.getClass(), "createdDate", term893);
        setIntField(term896, term896.getClass(), "nanos", 837000000);
        setLongField(term896, term896.getClass(), "fastTime", 1606034835000L);
        setField(term896, term896.getClass(), "cdate", null);
        setField(term876, term876.getClass(), "lastModifiedDate", term896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term876, args);
    }

};


