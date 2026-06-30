package ru.smartup.timetracker.dto.project.response;

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
import static ru.smartup.timetracker.dto.project.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TaskInProjectDto_isArchived_11448725944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11142;

    public TaskInProjectDto_isArchived_11448725944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11142 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term11142, term11142.getClass(), "id", -8400487765614892086L);
        setField(term11142, term11142.getClass(), "name", "OWKQODBLzb");
        setBooleanField(term11142, term11142.getClass(), "billable", false);
        setBooleanField(term11142, term11142.getClass(), "isArchived", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchived", argTypes, term11142, args);
    }

};


