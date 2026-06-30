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

public class TaskDto_setLastModifiedDate_17099828714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1305;
     Object term1328;

    public TaskDto_setLastModifiedDate_17099828714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1305 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto"));
        Object term1322 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1325 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1305, term1305.getClass(), "id", 6855071767938501807L);
        setField(term1305, term1305.getClass(), "name", "tShwQLRGNe");
        setIntField(term1305, term1305.getClass(), "projectId", -1016503459);
        setBooleanField(term1305, term1305.getClass(), "billable", true);
        setBooleanField(term1305, term1305.getClass(), "isArchived", true);
        setIntField(term1322, term1322.getClass(), "nanos", 956000000);
        setLongField(term1322, term1322.getClass(), "fastTime", 1739406992000L);
        setField(term1322, term1322.getClass(), "cdate", null);
        setField(term1305, term1305.getClass(), "createdDate", term1322);
        setIntField(term1325, term1325.getClass(), "nanos", 573000000);
        setLongField(term1325, term1325.getClass(), "fastTime", 1329629467000L);
        setField(term1325, term1325.getClass(), "cdate", null);
        setField(term1305, term1305.getClass(), "lastModifiedDate", term1325);
        term1328 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term1328, term1328.getClass(), "nanos", 718000000);
        setLongField(term1328, term1328.getClass(), "fastTime", 1334842304000L);
        setField(term1328, term1328.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term1328;
        callMethod(klass, "setLastModifiedDate", argTypes, term1305, args);
    }

};


