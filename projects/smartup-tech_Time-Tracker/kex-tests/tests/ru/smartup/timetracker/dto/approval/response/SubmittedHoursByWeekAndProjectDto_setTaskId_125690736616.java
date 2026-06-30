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
import java.lang.Long;

public class SubmittedHoursByWeekAndProjectDto_setTaskId_125690736616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7649;
     Object term7719;

    public SubmittedHoursByWeekAndProjectDto_setTaskId_125690736616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7752 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term7751 = ((Class) term7752).getDeclaredField((String) "APPROVED");
        ((Field) term7751).setAccessible(true);
        Object enum16 = ((Field) term7751).get((Object) null);
        term7649 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term7703 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term7649, term7649.getClass(), "trackUnitId", -6823727938421990489L);
        setIntField(term7649, term7649.getClass(), "employeeId", -1456670397);
        setField(term7649, term7649.getClass(), "firstName", "kBdSllIBVz");
        setField(term7649, term7649.getClass(), "lastName", "TJmVBGfTML");
        setLongField(term7649, term7649.getClass(), "taskId", -484994522244390100L);
        setField(term7649, term7649.getClass(), "taskName", "tPlsykYBqO");
        setFloatField(term7649, term7649.getClass(), "hours", 0.6076495F);
        setField(term7649, term7649.getClass(), "status", enum16);
        setBooleanField(term7649, term7649.getClass(), "billable", true);
        setIntField(term7703, term7703.getClass(), "year", 2029);
        setShortField(term7703, term7703.getClass(), "month", (short) 8);
        setShortField(term7703, term7703.getClass(), "day", (short) 28);
        setField(term7649, term7649.getClass(), "workDay", term7703);
        setField(term7649, term7649.getClass(), "comment", "bLPjGVBhlX");
        term7719 = new Long(1233889271256172047L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7719;
        callMethod(klass, "setTaskId", argTypes, term7649, args);
    }

};


