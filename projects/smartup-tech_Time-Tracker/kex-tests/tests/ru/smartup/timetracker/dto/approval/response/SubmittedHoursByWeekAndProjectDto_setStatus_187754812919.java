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

public class SubmittedHoursByWeekAndProjectDto_setStatus_187754812919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9092;
     Object enum20;

    public SubmittedHoursByWeekAndProjectDto_setStatus_187754812919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9204 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term9203 = ((Class) term9204).getDeclaredField((String) "CREATED");
        ((Field) term9203).setAccessible(true);
        Object enum19 = ((Field) term9203).get((Object) null);
        term9092 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term9145 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term9092, term9092.getClass(), "trackUnitId", 4178434741742309755L);
        setIntField(term9092, term9092.getClass(), "employeeId", -655067527);
        setField(term9092, term9092.getClass(), "firstName", "wGmYcqUkgE");
        setField(term9092, term9092.getClass(), "lastName", "idgaQsnJpQ");
        setLongField(term9092, term9092.getClass(), "taskId", -2068172595987555756L);
        setField(term9092, term9092.getClass(), "taskName", "VgZnGoIFwQ");
        setFloatField(term9092, term9092.getClass(), "hours", 0.8474802F);
        setField(term9092, term9092.getClass(), "status", enum19);
        setBooleanField(term9092, term9092.getClass(), "billable", false);
        setIntField(term9145, term9145.getClass(), "year", 2024);
        setShortField(term9145, term9145.getClass(), "month", (short) 8);
        setShortField(term9145, term9145.getClass(), "day", (short) 31);
        setField(term9092, term9092.getClass(), "workDay", term9145);
        setField(term9092, term9092.getClass(), "comment", "jUbSRrkrYZ");
        Class<? extends Object> term9572 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term9571 = ((Class) term9572).getDeclaredField((String) "REJECTED");
        ((Field) term9571).setAccessible(true);
        enum20 = ((Field) term9571).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Object[] args = new Object[1];
        args[0] = enum20;
        callMethod(klass, "setStatus", argTypes, term9092, args);
    }

};


