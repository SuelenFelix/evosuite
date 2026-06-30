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
import java.lang.Long;

public class TrackedProjectTaskDto_setTaskId_11326864278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411;
     Object term439;

    public TrackedProjectTaskDto_setTaskId_11326864278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411 = newInstance(Class.forName("ru.smartup.timetracker.dto.task.response.TrackedProjectTaskDto"));
        setIntField(term411, term411.getClass(), "employeeId", 1622346318);
        setIntField(term411, term411.getClass(), "projectId", 1048535127);
        setField(term411, term411.getClass(), "projectName", "tbcdzjIfER");
        setLongField(term411, term411.getClass(), "taskId", -7237588299778557629L);
        setField(term411, term411.getClass(), "taskName", "HyxfbSQYBe");
        term439 = new Long(6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.task.response.TrackedProjectTaskDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term439;
        callMethod(klass, "setTaskId", argTypes, term411, args);
    }

};


