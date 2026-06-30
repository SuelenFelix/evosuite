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

public class TaskInProjectDto_isBillable_4460206913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11116;

    public TaskInProjectDto_isBillable_4460206913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11116 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto"));
        setLongField(term11116, term11116.getClass(), "id", -8257434502486459194L);
        setField(term11116, term11116.getClass(), "name", "vQVyKLdtaz");
        setBooleanField(term11116, term11116.getClass(), "billable", true);
        setBooleanField(term11116, term11116.getClass(), "isArchived", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.TaskInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBillable", argTypes, term11116, args);
    }

};


