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

public class TaskInProjectDto_hashCode_128594297324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11452;

    public TaskInProjectDto_hashCode_128594297324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11452 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term11452, term11452.getClass(), "id", 0L);
        setField(term11452, term11452.getClass(), "name", null);
        setBooleanField(term11452, term11452.getClass(), "billable", false);
        setBooleanField(term11452, term11452.getClass(), "isArchived", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term11452, args);
    }

};


