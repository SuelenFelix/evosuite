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

public class SubmittedHoursByWeekAndProjectDto_canEqual_112986457724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11845;
     Object term11916;

    public SubmittedHoursByWeekAndProjectDto_canEqual_112986457724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11948 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term11947 = ((Class) term11948).getDeclaredField((String) "SUBMITTED");
        ((Field) term11947).setAccessible(true);
        Object enum25 = ((Field) term11947).get((Object) null);
        term11845 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term11900 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term11845, term11845.getClass(), "trackUnitId", -5788180182343976541L);
        setIntField(term11845, term11845.getClass(), "employeeId", 1135664017);
        setField(term11845, term11845.getClass(), "firstName", "SPpkrGcPRr");
        setField(term11845, term11845.getClass(), "lastName", "sEccwbJKYE");
        setLongField(term11845, term11845.getClass(), "taskId", 2936323121573284007L);
        setField(term11845, term11845.getClass(), "taskName", "AWRooQKkdW");
        setFloatField(term11845, term11845.getClass(), "hours", 0.26441735F);
        setField(term11845, term11845.getClass(), "status", enum25);
        setBooleanField(term11845, term11845.getClass(), "billable", false);
        setIntField(term11900, term11900.getClass(), "year", 2017);
        setShortField(term11900, term11900.getClass(), "month", (short) 8);
        setShortField(term11900, term11900.getClass(), "day", (short) 7);
        setField(term11845, term11845.getClass(), "workDay", term11900);
        setField(term11845, term11845.getClass(), "comment", "vjxIhXHxGR");
        term11916 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11916;
        callMethod(klass, "canEqual", argTypes, term11845, args);
    }

};


