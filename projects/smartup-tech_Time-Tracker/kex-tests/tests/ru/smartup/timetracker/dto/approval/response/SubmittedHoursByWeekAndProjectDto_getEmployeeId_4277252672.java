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

public class SubmittedHoursByWeekAndProjectDto_getEmployeeId_4277252672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995;

    public SubmittedHoursByWeekAndProjectDto_getEmployeeId_4277252672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1097 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term1096 = ((Class) term1097).getDeclaredField((String) "SUBMITTED");
        ((Field) term1096).setAccessible(true);
        Object enum2 = ((Field) term1096).get((Object) null);
        term995 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term1050 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term995, term995.getClass(), "trackUnitId", 5270370404989704783L);
        setIntField(term995, term995.getClass(), "employeeId", 1484323161);
        setField(term995, term995.getClass(), "firstName", "hRNSzYYIrc");
        setField(term995, term995.getClass(), "lastName", "RMFIsYGgne");
        setLongField(term995, term995.getClass(), "taskId", 7411271909051562686L);
        setField(term995, term995.getClass(), "taskName", "NRdvgJlhkX");
        setFloatField(term995, term995.getClass(), "hours", 0.3455959F);
        setField(term995, term995.getClass(), "status", enum2);
        setBooleanField(term995, term995.getClass(), "billable", false);
        setIntField(term1050, term1050.getClass(), "year", 2021);
        setShortField(term1050, term1050.getClass(), "month", (short) 1);
        setShortField(term1050, term1050.getClass(), "day", (short) 18);
        setField(term995, term995.getClass(), "workDay", term1050);
        setField(term995, term995.getClass(), "comment", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term995, args);
    }

};


