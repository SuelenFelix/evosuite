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

public class SubmittedWorkDaysForEmployees_getTrackUnitWorkDay_2741329764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56275;

    public SubmittedWorkDaysForEmployees_getTrackUnitWorkDay_2741329764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56275 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        Object term56301 = newInstance(Class.forName("java.util.Date"));
        setIntField(term56275, term56275.getClass(), "employeeId", -1970452551);
        setField(term56275, term56275.getClass(), "firstName", "BWxJSgKHRT");
        setField(term56275, term56275.getClass(), "lastName", "AGXoIndFnm");
        setLongField(term56301, term56301.getClass(), "fastTime", 1415426053422L);
        setField(term56301, term56301.getClass(), "cdate", null);
        setField(term56275, term56275.getClass(), "trackUnitWorkDay", term56301);
        setIntField(term56275, term56275.getClass(), "projectId", -1896376975);
        setField(term56275, term56275.getClass(), "projectName", "mwmFMNEzkK");
        setLongField(term56275, term56275.getClass(), "trackUnitId", 7489064039921396098L);
        setLongField(term56275, term56275.getClass(), "taskId", 6843866297465638866L);
        setField(term56275, term56275.getClass(), "taskName", "kVAmKknVln");
        setFloatField(term56275, term56275.getClass(), "trackUnitHours", 0.4054746F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitWorkDay", argTypes, term56275, args);
    }

};


