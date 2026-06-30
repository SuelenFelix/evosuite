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

public class TrackedProjectTaskForEmployee_setProjectName_14147939538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22978;

    public TrackedProjectTaskForEmployee_setProjectName_14147939538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22978 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term22978, term22978.getClass(), "employeeId", 1114000454);
        setIntField(term22978, term22978.getClass(), "projectId", -556405712);
        setField(term22978, term22978.getClass(), "projectName", "SIODFGaQhr");
        setLongField(term22978, term22978.getClass(), "taskId", -6645965768855543712L);
        setField(term22978, term22978.getClass(), "taskName", "qYzsiuXOgS");
        setBooleanField(term22978, term22978.getClass(), "billable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bxrCBbrrct";
        callMethod(klass, "setProjectName", argTypes, term22978, args);
    }

};


