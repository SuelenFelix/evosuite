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

public class SubmittedHoursByWeekAndProjectDto_getStatus_18057590878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3821;

    public SubmittedHoursByWeekAndProjectDto_getStatus_18057590878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3923 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term3922 = ((Class) term3923).getDeclaredField((String) "SUBMITTED");
        ((Field) term3922).setAccessible(true);
        Object enum8 = ((Field) term3922).get((Object) null);
        term3821 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term3876 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3821, term3821.getClass(), "trackUnitId", -316468845751588286L);
        setIntField(term3821, term3821.getClass(), "employeeId", 1227103734);
        setField(term3821, term3821.getClass(), "firstName", "AijpHYOFuy");
        setField(term3821, term3821.getClass(), "lastName", "SbAoxhfrkn");
        setLongField(term3821, term3821.getClass(), "taskId", 5127676408959197577L);
        setField(term3821, term3821.getClass(), "taskName", "kuTXqwMtDB");
        setFloatField(term3821, term3821.getClass(), "hours", 0.2857073F);
        setField(term3821, term3821.getClass(), "status", enum8);
        setBooleanField(term3821, term3821.getClass(), "billable", false);
        setIntField(term3876, term3876.getClass(), "year", 2022);
        setShortField(term3876, term3876.getClass(), "month", (short) 2);
        setShortField(term3876, term3876.getClass(), "day", (short) 25);
        setField(term3821, term3821.getClass(), "workDay", term3876);
        setField(term3821, term3821.getClass(), "comment", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term3821, args);
    }

};


