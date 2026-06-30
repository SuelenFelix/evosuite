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

public class SubmittedWorkDaysForEmployees_getProjectId_2535374225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56371;

    public SubmittedWorkDaysForEmployees_getProjectId_2535374225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56371 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        Object term56397 = newInstance(Class.forName("java.util.Date"));
        setIntField(term56371, term56371.getClass(), "employeeId", 729658803);
        setField(term56371, term56371.getClass(), "firstName", "MRFLbEGYKG");
        setField(term56371, term56371.getClass(), "lastName", "BYrGukTyof");
        setLongField(term56397, term56397.getClass(), "fastTime", 1359786657069L);
        setField(term56397, term56397.getClass(), "cdate", null);
        setField(term56371, term56371.getClass(), "trackUnitWorkDay", term56397);
        setIntField(term56371, term56371.getClass(), "projectId", 114754804);
        setField(term56371, term56371.getClass(), "projectName", "jiCGTTzKGB");
        setLongField(term56371, term56371.getClass(), "trackUnitId", -4023935540989049732L);
        setLongField(term56371, term56371.getClass(), "taskId", 855932984568615096L);
        setField(term56371, term56371.getClass(), "taskName", "MqICFYzDJj");
        setFloatField(term56371, term56371.getClass(), "trackUnitHours", 0.5179319F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term56371, args);
    }

};


