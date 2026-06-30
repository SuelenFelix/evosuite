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

public class SubmittedHoursByWeekAndProjectDto_getTrackUnitId_1258919981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520;

    public SubmittedHoursByWeekAndProjectDto_getTrackUnitId_1258919981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term622 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term621 = ((Class) term622).getDeclaredField((String) "SUBMITTED");
        ((Field) term621).setAccessible(true);
        Object enum1 = ((Field) term621).get((Object) null);
        term520 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term575 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term520, term520.getClass(), "trackUnitId", -8257434502486459194L);
        setIntField(term520, term520.getClass(), "employeeId", 1162663216);
        setField(term520, term520.getClass(), "firstName", "jJCZpVmanW");
        setField(term520, term520.getClass(), "lastName", "EGtDIRbSSb");
        setLongField(term520, term520.getClass(), "taskId", -8400487765614892086L);
        setField(term520, term520.getClass(), "taskName", "SzjVpOQTyS");
        setFloatField(term520, term520.getClass(), "hours", 0.2707036F);
        setField(term520, term520.getClass(), "status", enum1);
        setBooleanField(term520, term520.getClass(), "billable", false);
        setIntField(term575, term575.getClass(), "year", 2016);
        setShortField(term575, term575.getClass(), "month", (short) 11);
        setShortField(term575, term575.getClass(), "day", (short) 29);
        setField(term520, term520.getClass(), "workDay", term575);
        setField(term520, term520.getClass(), "comment", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitId", argTypes, term520, args);
    }

};


