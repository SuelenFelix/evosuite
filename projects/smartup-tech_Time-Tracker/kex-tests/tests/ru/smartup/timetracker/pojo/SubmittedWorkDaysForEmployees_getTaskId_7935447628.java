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

public class SubmittedWorkDaysForEmployees_getTaskId_7935447628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56659;

    public SubmittedWorkDaysForEmployees_getTaskId_7935447628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56659 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        Object term56685 = newInstance(Class.forName("java.util.Date"));
        setIntField(term56659, term56659.getClass(), "employeeId", -1882480155);
        setField(term56659, term56659.getClass(), "firstName", "UxgSdhxPCH");
        setField(term56659, term56659.getClass(), "lastName", "DAujxZPHJC");
        setLongField(term56685, term56685.getClass(), "fastTime", 1491181740539L);
        setField(term56685, term56685.getClass(), "cdate", null);
        setField(term56659, term56659.getClass(), "trackUnitWorkDay", term56685);
        setIntField(term56659, term56659.getClass(), "projectId", -1410220680);
        setField(term56659, term56659.getClass(), "projectName", "IlBhdrCvHq");
        setLongField(term56659, term56659.getClass(), "trackUnitId", -7115418542247301000L);
        setLongField(term56659, term56659.getClass(), "taskId", 8034714140377562739L);
        setField(term56659, term56659.getClass(), "taskName", "OirVUQhauU");
        setFloatField(term56659, term56659.getClass(), "trackUnitHours", 0.96599394F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term56659, args);
    }

};


