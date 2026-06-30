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

public class SubmittedHoursByWeekAndProjectDto_setTaskName_81137867317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8122;

    public SubmittedHoursByWeekAndProjectDto_setTaskName_81137867317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8235 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term8234 = ((Class) term8235).getDeclaredField((String) "APPROVED");
        ((Field) term8234).setAccessible(true);
        Object enum17 = ((Field) term8234).get((Object) null);
        term8122 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term8176 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8122, term8122.getClass(), "trackUnitId", 6617340557564669657L);
        setIntField(term8122, term8122.getClass(), "employeeId", 1622346318);
        setField(term8122, term8122.getClass(), "firstName", "whBvTVIIlC");
        setField(term8122, term8122.getClass(), "lastName", "IgRJUzaCwW");
        setLongField(term8122, term8122.getClass(), "taskId", 1439298019805881866L);
        setField(term8122, term8122.getClass(), "taskName", "JUmudUmaaV");
        setFloatField(term8122, term8122.getClass(), "hours", 0.6608425F);
        setField(term8122, term8122.getClass(), "status", enum17);
        setBooleanField(term8122, term8122.getClass(), "billable", true);
        setIntField(term8176, term8176.getClass(), "year", 2015);
        setShortField(term8176, term8176.getClass(), "month", (short) 7);
        setShortField(term8176, term8176.getClass(), "day", (short) 24);
        setField(term8122, term8122.getClass(), "workDay", term8176);
        setField(term8122, term8122.getClass(), "comment", "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HqBOwkVqjD";
        callMethod(klass, "setTaskName", argTypes, term8122, args);
    }

};


