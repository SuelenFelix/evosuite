package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TrackUnitProjectTask_setProjectId_211759386426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55855;
     Object term55860;

    public TrackUnitProjectTask_setProjectId_211759386426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55855 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        setIntField(term55855, term55855.getClass(), "employeeId", 0);
        setLongField(term55855, term55855.getClass(), "trackUnitId", 0L);
        setField(term55855, term55855.getClass(), "trackUnitWorkDay", null);
        setIntField(term55855, term55855.getClass(), "projectId", 0);
        setField(term55855, term55855.getClass(), "projectName", null);
        setLongField(term55855, term55855.getClass(), "taskId", 0L);
        setField(term55855, term55855.getClass(), "taskName", null);
        term55860 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55860;
        callMethod(klass, "setProjectId", argTypes, term55855, args);
    }

};


