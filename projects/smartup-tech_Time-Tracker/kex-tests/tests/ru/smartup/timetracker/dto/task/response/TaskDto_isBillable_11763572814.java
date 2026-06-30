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

public class TaskDto_isBillable_11763572814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942;

    public TaskDto_isBillable_11763572814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term959 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term962 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term942, term942.getClass(), "id", -4920224193275732920L);
        setField(term942, term942.getClass(), "name", "Ghbwtircqb");
        setIntField(term942, term942.getClass(), "projectId", -1087774327);
        setBooleanField(term942, term942.getClass(), "billable", true);
        setBooleanField(term942, term942.getClass(), "isArchived", true);
        setIntField(term959, term959.getClass(), "nanos", 389000000);
        setLongField(term959, term959.getClass(), "fastTime", 1429013051000L);
        setField(term959, term959.getClass(), "cdate", null);
        setField(term942, term942.getClass(), "createdDate", term959);
        setIntField(term962, term962.getClass(), "nanos", 288000000);
        setLongField(term962, term962.getClass(), "fastTime", 1495346663000L);
        setField(term962, term962.getClass(), "cdate", null);
        setField(term942, term942.getClass(), "lastModifiedDate", term962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBillable", argTypes, term942, args);
    }

};


