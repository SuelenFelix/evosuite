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
import java.lang.Float;

public class SubmittedHoursByWeekAndProjectDto_setHours_181438967518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8615;
     Object term8686;

    public SubmittedHoursByWeekAndProjectDto_setHours_181438967518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8719 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term8718 = ((Class) term8719).getDeclaredField((String) "SUBMITTED");
        ((Field) term8718).setAccessible(true);
        Object enum18 = ((Field) term8718).get((Object) null);
        term8615 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term8670 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8615, term8615.getClass(), "trackUnitId", -8708192233349544946L);
        setIntField(term8615, term8615.getClass(), "employeeId", 1048535127);
        setField(term8615, term8615.getClass(), "firstName", "MAcUBcBckh");
        setField(term8615, term8615.getClass(), "lastName", "oVgzLbrsFr");
        setLongField(term8615, term8615.getClass(), "taskId", 5907001541142728739L);
        setField(term8615, term8615.getClass(), "taskName", "vQVyKLdtaz");
        setFloatField(term8615, term8615.getClass(), "hours", 0.37773192F);
        setField(term8615, term8615.getClass(), "status", enum18);
        setBooleanField(term8615, term8615.getClass(), "billable", false);
        setIntField(term8670, term8670.getClass(), "year", 2022);
        setShortField(term8670, term8670.getClass(), "month", (short) 11);
        setShortField(term8670, term8670.getClass(), "day", (short) 16);
        setField(term8615, term8615.getClass(), "workDay", term8670);
        setField(term8615, term8615.getClass(), "comment", "OWKQODBLzb");
        term8686 = new Float(0.24413109F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term8686;
        callMethod(klass, "setHours", argTypes, term8615, args);
    }

};


