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

public class TaskDto_getId_2775723571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843;

    public TaskDto_getId_2775723571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term843 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term860 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term863 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term843, term843.getClass(), "id", -316468845751588286L);
        setField(term843, term843.getClass(), "name", "AijpHYOFuy");
        setIntField(term843, term843.getClass(), "projectId", -73683645);
        setBooleanField(term843, term843.getClass(), "billable", false);
        setBooleanField(term843, term843.getClass(), "isArchived", false);
        setIntField(term860, term860.getClass(), "nanos", 244000000);
        setLongField(term860, term860.getClass(), "fastTime", 1345860612000L);
        setField(term860, term860.getClass(), "cdate", null);
        setField(term843, term843.getClass(), "createdDate", term860);
        setIntField(term863, term863.getClass(), "nanos", 369000000);
        setLongField(term863, term863.getClass(), "fastTime", 1480427551000L);
        setField(term863, term863.getClass(), "cdate", null);
        setField(term843, term843.getClass(), "lastModifiedDate", term863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term843, args);
    }

};


