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

public class SubmittedWorkDaysForEmployees_getTrackUnitId_20336715567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56563;

    public SubmittedWorkDaysForEmployees_getTrackUnitId_20336715567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56563 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        Object term56589 = newInstance(Class.forName("java.util.Date"));
        setIntField(term56563, term56563.getClass(), "employeeId", 497269071);
        setField(term56563, term56563.getClass(), "firstName", "vLTbaoAxBm");
        setField(term56563, term56563.getClass(), "lastName", "BXTjEyEZxD");
        setLongField(term56589, term56589.getClass(), "fastTime", 1291280367982L);
        setField(term56589, term56589.getClass(), "cdate", null);
        setField(term56563, term56563.getClass(), "trackUnitWorkDay", term56589);
        setIntField(term56563, term56563.getClass(), "projectId", -1899301124);
        setField(term56563, term56563.getClass(), "projectName", "oKhVzOKUFW");
        setLongField(term56563, term56563.getClass(), "trackUnitId", 8802866251294305945L);
        setLongField(term56563, term56563.getClass(), "taskId", 4513004407927379358L);
        setField(term56563, term56563.getClass(), "taskName", "mNHyqmOAFy");
        setFloatField(term56563, term56563.getClass(), "trackUnitHours", 0.25025773F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitId", argTypes, term56563, args);
    }

};


