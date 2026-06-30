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
import java.lang.Long;

public class TrackedProjectTaskForEmployee_setTaskId_4126464689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23049;
     Object term23078;

    public TrackedProjectTaskForEmployee_setTaskId_4126464689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23049 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee"));
        setIntField(term23049, term23049.getClass(), "employeeId", -1772434990);
        setIntField(term23049, term23049.getClass(), "projectId", -1845499264);
        setField(term23049, term23049.getClass(), "projectName", "CKWpJaaaxX");
        setLongField(term23049, term23049.getClass(), "taskId", 4784595517102746672L);
        setField(term23049, term23049.getClass(), "taskName", "UBRmXJmfrt");
        setBooleanField(term23049, term23049.getClass(), "billable", true);
        term23078 = new Long(-7612550318181586304L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackedProjectTaskForEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term23078;
        callMethod(klass, "setTaskId", argTypes, term23049, args);
    }

};


