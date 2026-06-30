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
import java.lang.Long;

public class TrackUnitProjectTask_setTrackUnitId_45694496224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55843;
     Object term55848;

    public TrackUnitProjectTask_setTrackUnitId_45694496224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55843 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        setIntField(term55843, term55843.getClass(), "employeeId", 0);
        setLongField(term55843, term55843.getClass(), "trackUnitId", 0L);
        setField(term55843, term55843.getClass(), "trackUnitWorkDay", null);
        setIntField(term55843, term55843.getClass(), "projectId", 0);
        setField(term55843, term55843.getClass(), "projectName", null);
        setLongField(term55843, term55843.getClass(), "taskId", 0L);
        setField(term55843, term55843.getClass(), "taskName", null);
        term55848 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term55848;
        callMethod(klass, "setTrackUnitId", argTypes, term55843, args);
    }

};


