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

public class SubmittedHoursByWeekAndProjectDto_getFirstName_520811123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1470;

    public SubmittedHoursByWeekAndProjectDto_getFirstName_520811123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1570 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term1569 = ((Class) term1570).getDeclaredField((String) "CREATED");
        ((Field) term1569).setAccessible(true);
        Object enum3 = ((Field) term1569).get((Object) null);
        term1470 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term1523 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1470, term1470.getClass(), "trackUnitId", 4872422362414183754L);
        setIntField(term1470, term1470.getClass(), "employeeId", 391863371);
        setField(term1470, term1470.getClass(), "firstName", "MxlszYVzRf");
        setField(term1470, term1470.getClass(), "lastName", "LQFpaHEwXR");
        setLongField(term1470, term1470.getClass(), "taskId", 6811161968424632369L);
        setField(term1470, term1470.getClass(), "taskName", "oVcInYnLWB");
        setFloatField(term1470, term1470.getClass(), "hours", 0.09123778F);
        setField(term1470, term1470.getClass(), "status", enum3);
        setBooleanField(term1470, term1470.getClass(), "billable", false);
        setIntField(term1523, term1523.getClass(), "year", 2020);
        setShortField(term1523, term1523.getClass(), "month", (short) 11);
        setShortField(term1523, term1523.getClass(), "day", (short) 22);
        setField(term1470, term1470.getClass(), "workDay", term1523);
        setField(term1470, term1470.getClass(), "comment", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term1470, args);
    }

};


