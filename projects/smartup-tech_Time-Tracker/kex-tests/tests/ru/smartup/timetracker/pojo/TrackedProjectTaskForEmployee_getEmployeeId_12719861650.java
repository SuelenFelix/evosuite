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

public class TrackedProjectTaskForEmployee_getEmployeeId_12719861650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22582;

    public TrackedProjectTaskForEmployee_getEmployeeId_12719861650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22582 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term22582, term22582.getClass(), "employeeId", 287287233);
        setIntField(term22582, term22582.getClass(), "projectId", 962840079);
        setField(term22582, term22582.getClass(), "projectName", "mfCpTPPQQm");
        setLongField(term22582, term22582.getClass(), "taskId", 1233889271256172047L);
        setField(term22582, term22582.getClass(), "taskName", "OcJCIDNIXA");
        setBooleanField(term22582, term22582.getClass(), "billable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term22582, args);
    }

};


