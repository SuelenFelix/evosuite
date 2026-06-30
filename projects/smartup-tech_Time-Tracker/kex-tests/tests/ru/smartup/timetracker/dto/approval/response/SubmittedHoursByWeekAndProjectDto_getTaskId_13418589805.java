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

public class SubmittedHoursByWeekAndProjectDto_getTaskId_13418589805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2408;

    public SubmittedHoursByWeekAndProjectDto_getTaskId_13418589805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2509 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term2508 = ((Class) term2509).getDeclaredField((String) "REJECTED");
        ((Field) term2508).setAccessible(true);
        Object enum5 = ((Field) term2508).get((Object) null);
        term2408 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term2462 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2408, term2408.getClass(), "trackUnitId", -2813493605142626659L);
        setIntField(term2408, term2408.getClass(), "employeeId", -616727354);
        setField(term2408, term2408.getClass(), "firstName", "hNxWaHcfhY");
        setField(term2408, term2408.getClass(), "lastName", "RkybSrpybU");
        setLongField(term2408, term2408.getClass(), "taskId", -8885298608300233488L);
        setField(term2408, term2408.getClass(), "taskName", "xOEqzGAmDU");
        setFloatField(term2408, term2408.getClass(), "hours", 0.8564069F);
        setField(term2408, term2408.getClass(), "status", enum5);
        setBooleanField(term2408, term2408.getClass(), "billable", true);
        setIntField(term2462, term2462.getClass(), "year", 2018);
        setShortField(term2462, term2462.getClass(), "month", (short) 1);
        setShortField(term2462, term2462.getClass(), "day", (short) 13);
        setField(term2408, term2408.getClass(), "workDay", term2462);
        setField(term2408, term2408.getClass(), "comment", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term2408, args);
    }

};


