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

public class TrackedProjectTaskForEmployee_setProjectId_2234286847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22927;
     Object term22956;

    public TrackedProjectTaskForEmployee_setProjectId_2234286847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22927 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term22927, term22927.getClass(), "employeeId", 1090617576);
        setIntField(term22927, term22927.getClass(), "projectId", -1547384488);
        setField(term22927, term22927.getClass(), "projectName", "NTlKJDDWlk");
        setLongField(term22927, term22927.getClass(), "taskId", -6292278961887936280L);
        setField(term22927, term22927.getClass(), "taskName", "vOuMEpOQAg");
        setBooleanField(term22927, term22927.getClass(), "billable", true);
        term22956 = new Integer(1442160736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22956;
        callMethod(klass, "setProjectId", argTypes, term22927, args);
    }

};


