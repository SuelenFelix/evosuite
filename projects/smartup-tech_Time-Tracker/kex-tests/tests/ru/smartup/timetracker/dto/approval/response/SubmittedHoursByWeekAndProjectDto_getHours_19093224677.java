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

public class SubmittedHoursByWeekAndProjectDto_getHours_19093224677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3350;

    public SubmittedHoursByWeekAndProjectDto_getHours_19093224677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3451 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term3450 = ((Class) term3451).getDeclaredField((String) "APPROVED");
        ((Field) term3450).setAccessible(true);
        Object enum7 = ((Field) term3450).get((Object) null);
        term3350 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term3404 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3350, term3350.getClass(), "trackUnitId", -5476826692763582090L);
        setIntField(term3350, term3350.getClass(), "employeeId", -2038273078);
        setField(term3350, term3350.getClass(), "firstName", "IoAlmYsBwc");
        setField(term3350, term3350.getClass(), "lastName", "TEParAifyi");
        setLongField(term3350, term3350.getClass(), "taskId", -872011222785455006L);
        setField(term3350, term3350.getClass(), "taskName", "OWDIEULEFu");
        setFloatField(term3350, term3350.getClass(), "hours", 0.5254275F);
        setField(term3350, term3350.getClass(), "status", enum7);
        setBooleanField(term3350, term3350.getClass(), "billable", true);
        setIntField(term3404, term3404.getClass(), "year", 2017);
        setShortField(term3404, term3404.getClass(), "month", (short) 5);
        setShortField(term3404, term3404.getClass(), "day", (short) 21);
        setField(term3350, term3350.getClass(), "workDay", term3404);
        setField(term3350, term3350.getClass(), "comment", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term3350, args);
    }

};


