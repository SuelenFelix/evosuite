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
import java.lang.Object;

public class TrackUnitProjectTask_setTaskName_198682697313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55674;

    public TrackUnitProjectTask_setTaskName_198682697313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55674 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55677 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55674, term55674.getClass(), "employeeId", 663292551);
        setLongField(term55674, term55674.getClass(), "trackUnitId", 5671808784468963649L);
        setLongField(term55677, term55677.getClass(), "fastTime", 1450865259896L);
        setField(term55677, term55677.getClass(), "cdate", null);
        setField(term55674, term55674.getClass(), "trackUnitWorkDay", term55677);
        setIntField(term55674, term55674.getClass(), "projectId", -1885090354);
        setField(term55674, term55674.getClass(), "projectName", "bxyfeicqrK");
        setLongField(term55674, term55674.getClass(), "taskId", 2297097306706899827L);
        setField(term55674, term55674.getClass(), "taskName", "vBnWPlsZMk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fIZsWucfXz";
        callMethod(klass, "setTaskName", argTypes, term55674, args);
    }

};


