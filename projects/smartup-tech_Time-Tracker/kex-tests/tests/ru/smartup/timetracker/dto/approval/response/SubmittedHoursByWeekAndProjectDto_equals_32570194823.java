package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class SubmittedHoursByWeekAndProjectDto_equals_32570194823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11373;
     Object term11443;

    public SubmittedHoursByWeekAndProjectDto_equals_32570194823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11475 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term11474 = ((Class) term11475).getDeclaredField((String) "REJECTED");
        ((Field) term11474).setAccessible(true);
        Object enum24 = ((Field) term11474).get((Object) null);
        term11373 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term11427 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term11373, term11373.getClass(), "trackUnitId", -4443169559037975007L);
        setIntField(term11373, term11373.getClass(), "employeeId", -1007160944);
        setField(term11373, term11373.getClass(), "firstName", "XqgfKFvPSD");
        setField(term11373, term11373.getClass(), "lastName", "JiVRgTZvKc");
        setLongField(term11373, term11373.getClass(), "taskId", -3842548265506930260L);
        setField(term11373, term11373.getClass(), "taskName", "XPKmummaqg");
        setFloatField(term11373, term11373.getClass(), "hours", 0.76550204F);
        setField(term11373, term11373.getClass(), "status", enum24);
        setBooleanField(term11373, term11373.getClass(), "billable", true);
        setIntField(term11427, term11427.getClass(), "year", 2012);
        setShortField(term11427, term11427.getClass(), "month", (short) 9);
        setShortField(term11427, term11427.getClass(), "day", (short) 11);
        setField(term11373, term11373.getClass(), "workDay", term11427);
        setField(term11373, term11373.getClass(), "comment", "BKLfkLiZTH");
        term11443 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11443;
        callMethod(klass, "equals", argTypes, term11373, args);
    }

};


