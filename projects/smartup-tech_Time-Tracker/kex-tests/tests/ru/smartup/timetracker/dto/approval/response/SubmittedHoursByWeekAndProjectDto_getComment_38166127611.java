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

public class SubmittedHoursByWeekAndProjectDto_getComment_38166127611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5242;

    public SubmittedHoursByWeekAndProjectDto_getComment_38166127611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5343 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term5342 = ((Class) term5343).getDeclaredField((String) "REJECTED");
        ((Field) term5342).setAccessible(true);
        Object enum11 = ((Field) term5342).get((Object) null);
        term5242 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term5296 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term5242, term5242.getClass(), "trackUnitId", 8059786003080744426L);
        setIntField(term5242, term5242.getClass(), "employeeId", -522618178);
        setField(term5242, term5242.getClass(), "firstName", "BndsHwAFMv");
        setField(term5242, term5242.getClass(), "lastName", "GzFkzHGYFt");
        setLongField(term5242, term5242.getClass(), "taskId", -4365849114644724155L);
        setField(term5242, term5242.getClass(), "taskName", "tShwQLRGNe");
        setFloatField(term5242, term5242.getClass(), "hours", 0.8783184F);
        setField(term5242, term5242.getClass(), "status", enum11);
        setBooleanField(term5242, term5242.getClass(), "billable", true);
        setIntField(term5296, term5296.getClass(), "year", 2020);
        setShortField(term5296, term5296.getClass(), "month", (short) 5);
        setShortField(term5296, term5296.getClass(), "day", (short) 14);
        setField(term5242, term5242.getClass(), "workDay", term5296);
        setField(term5242, term5242.getClass(), "comment", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComment", argTypes, term5242, args);
    }

};


