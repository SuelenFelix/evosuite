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

public class SubmittedHoursByWeekAndProjectDto_getWorkDay_79438621510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4767;

    public SubmittedHoursByWeekAndProjectDto_getWorkDay_79438621510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4869 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term4868 = ((Class) term4869).getDeclaredField((String) "SUBMITTED");
        ((Field) term4868).setAccessible(true);
        Object enum10 = ((Field) term4868).get((Object) null);
        term4767 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term4822 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term4767, term4767.getClass(), "trackUnitId", 8428634514691209827L);
        setIntField(term4767, term4767.getClass(), "employeeId", 1725571209);
        setField(term4767, term4767.getClass(), "firstName", "wSQxaModmm");
        setField(term4767, term4767.getClass(), "lastName", "UlajhuVLaP");
        setLongField(term4767, term4767.getClass(), "taskId", -2585684163342970173L);
        setField(term4767, term4767.getClass(), "taskName", "gGSMzuGICf");
        setFloatField(term4767, term4767.getClass(), "hours", 0.40176582F);
        setField(term4767, term4767.getClass(), "status", enum10);
        setBooleanField(term4767, term4767.getClass(), "billable", false);
        setIntField(term4822, term4822.getClass(), "year", 2026);
        setShortField(term4822, term4822.getClass(), "month", (short) 12);
        setShortField(term4822, term4822.getClass(), "day", (short) 13);
        setField(term4767, term4767.getClass(), "workDay", term4822);
        setField(term4767, term4767.getClass(), "comment", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorkDay", argTypes, term4767, args);
    }

};


