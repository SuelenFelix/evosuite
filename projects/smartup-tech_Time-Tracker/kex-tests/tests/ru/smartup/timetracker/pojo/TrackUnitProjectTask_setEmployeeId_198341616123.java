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

public class TrackUnitProjectTask_setEmployeeId_198341616123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55836;
     Object term55841;

    public TrackUnitProjectTask_setEmployeeId_198341616123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55836 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        setIntField(term55836, term55836.getClass(), "employeeId", 0);
        setLongField(term55836, term55836.getClass(), "trackUnitId", 0L);
        setField(term55836, term55836.getClass(), "trackUnitWorkDay", null);
        setIntField(term55836, term55836.getClass(), "projectId", 0);
        setField(term55836, term55836.getClass(), "projectName", null);
        setLongField(term55836, term55836.getClass(), "taskId", 0L);
        setField(term55836, term55836.getClass(), "taskName", null);
        term55841 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55841;
        callMethod(klass, "setEmployeeId", argTypes, term55836, args);
    }

};


