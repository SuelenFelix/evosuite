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

public class TrackedProjectTaskForEmployee_setEmployeeId_3576063876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22876;
     Object term22905;

    public TrackedProjectTaskForEmployee_setEmployeeId_3576063876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22876 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term22876, term22876.getClass(), "employeeId", -481533957);
        setIntField(term22876, term22876.getClass(), "projectId", 1240914516);
        setField(term22876, term22876.getClass(), "projectName", "UKAReurpHG");
        setLongField(term22876, term22876.getClass(), "taskId", -2068172595987555756L);
        setField(term22876, term22876.getClass(), "taskName", "WVRMUmrljA");
        setBooleanField(term22876, term22876.getClass(), "billable", true);
        term22905 = new Integer(-1465035361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22905;
        callMethod(klass, "setEmployeeId", argTypes, term22876, args);
    }

};


