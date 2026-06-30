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

public class SubmittedWorkDaysForEmployees_getTaskName_2623173719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56755;

    public SubmittedWorkDaysForEmployees_getTaskName_2623173719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56755 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        Object term56781 = newInstance(Class.forName("java.util.Date"));
        setIntField(term56755, term56755.getClass(), "employeeId", 389427431);
        setField(term56755, term56755.getClass(), "firstName", "GLbyDfbNZI");
        setField(term56755, term56755.getClass(), "lastName", "oNLcCYDAsO");
        setLongField(term56781, term56781.getClass(), "fastTime", 1461996881310L);
        setField(term56781, term56781.getClass(), "cdate", null);
        setField(term56755, term56755.getClass(), "trackUnitWorkDay", term56781);
        setIntField(term56755, term56755.getClass(), "projectId", -1945706126);
        setField(term56755, term56755.getClass(), "projectName", "CNqMxLvtcJ");
        setLongField(term56755, term56755.getClass(), "trackUnitId", -2924531382671518368L);
        setLongField(term56755, term56755.getClass(), "taskId", -3948863953565024517L);
        setField(term56755, term56755.getClass(), "taskName", "ktbqerIaKW");
        setFloatField(term56755, term56755.getClass(), "trackUnitHours", 0.18580896F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term56755, args);
    }

};


