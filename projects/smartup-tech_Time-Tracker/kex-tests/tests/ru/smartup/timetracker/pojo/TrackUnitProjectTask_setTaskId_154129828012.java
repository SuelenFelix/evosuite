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
import java.lang.Long;

public class TrackUnitProjectTask_setTaskId_154129828012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55621;
     Object term55652;

    public TrackUnitProjectTask_setTaskId_154129828012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55621 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55624 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55621, term55621.getClass(), "employeeId", 1041916673);
        setLongField(term55621, term55621.getClass(), "trackUnitId", -4822736661741380518L);
        setLongField(term55624, term55624.getClass(), "fastTime", 1264037800343L);
        setField(term55624, term55624.getClass(), "cdate", null);
        setField(term55621, term55621.getClass(), "trackUnitWorkDay", term55624);
        setIntField(term55621, term55621.getClass(), "projectId", -601863069);
        setField(term55621, term55621.getClass(), "projectName", "tKmrUDURku");
        setLongField(term55621, term55621.getClass(), "taskId", -5386201758403679145L);
        setField(term55621, term55621.getClass(), "taskName", "JeZbrwZmsP");
        term55652 = new Long(-7268507582722666254L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term55652;
        callMethod(klass, "setTaskId", argTypes, term55621, args);
    }

};


