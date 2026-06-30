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

public class SubmittedWorkDaysForEmployees_getEmployeeId_17318382871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55987;

    public SubmittedWorkDaysForEmployees_getEmployeeId_17318382871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55987 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        Object term56013 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55987, term55987.getClass(), "employeeId", 1557431527);
        setField(term55987, term55987.getClass(), "firstName", "lRORwXipuk");
        setField(term55987, term55987.getClass(), "lastName", "fVdTcjgHdw");
        setLongField(term56013, term56013.getClass(), "fastTime", 1465782799700L);
        setField(term56013, term56013.getClass(), "cdate", null);
        setField(term55987, term55987.getClass(), "trackUnitWorkDay", term56013);
        setIntField(term55987, term55987.getClass(), "projectId", -1504890659);
        setField(term55987, term55987.getClass(), "projectName", "wwAwLLcLPp");
        setLongField(term55987, term55987.getClass(), "trackUnitId", 8313800941204938919L);
        setLongField(term55987, term55987.getClass(), "taskId", -1214968196781083707L);
        setField(term55987, term55987.getClass(), "taskName", "nHpMKOmlpQ");
        setFloatField(term55987, term55987.getClass(), "trackUnitHours", 0.5407563F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term55987, args);
    }

};


