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

public class TrackUnitProjectTask_getTaskName_4004845336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55285;

    public TrackUnitProjectTask_getTaskName_4004845336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55285 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55288 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55285, term55285.getClass(), "employeeId", 11724947);
        setLongField(term55285, term55285.getClass(), "trackUnitId", 1368340889161782793L);
        setLongField(term55288, term55288.getClass(), "fastTime", 1263744156294L);
        setField(term55288, term55288.getClass(), "cdate", null);
        setField(term55285, term55285.getClass(), "trackUnitWorkDay", term55288);
        setIntField(term55285, term55285.getClass(), "projectId", 1953277050);
        setField(term55285, term55285.getClass(), "projectName", "AyrEXuGrEj");
        setLongField(term55285, term55285.getClass(), "taskId", -5786861555969446503L);
        setField(term55285, term55285.getClass(), "taskName", "yevIIoVYHq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term55285, args);
    }

};


