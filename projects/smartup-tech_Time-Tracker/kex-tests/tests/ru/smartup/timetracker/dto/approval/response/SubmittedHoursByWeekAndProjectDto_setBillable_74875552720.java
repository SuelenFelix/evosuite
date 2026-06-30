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
import java.lang.Boolean;

public class SubmittedHoursByWeekAndProjectDto_setBillable_74875552720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9932;
     Object term10002;

    public SubmittedHoursByWeekAndProjectDto_setBillable_74875552720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10035 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term10034 = ((Class) term10035).getDeclaredField((String) "REJECTED");
        ((Field) term10034).setAccessible(true);
        Object enum21 = ((Field) term10034).get((Object) null);
        term9932 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term9986 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term9932, term9932.getClass(), "trackUnitId", -6292278961887936280L);
        setIntField(term9932, term9932.getClass(), "employeeId", -6029667);
        setField(term9932, term9932.getClass(), "firstName", "bWWfajKbEX");
        setField(term9932, term9932.getClass(), "lastName", "cAPeiZHKGJ");
        setLongField(term9932, term9932.getClass(), "taskId", -6645965768855543712L);
        setField(term9932, term9932.getClass(), "taskName", "LvJFtLBaxj");
        setFloatField(term9932, term9932.getClass(), "hours", 0.9985961F);
        setField(term9932, term9932.getClass(), "status", enum21);
        setBooleanField(term9932, term9932.getClass(), "billable", true);
        setIntField(term9986, term9986.getClass(), "year", 2019);
        setShortField(term9986, term9986.getClass(), "month", (short) 2);
        setShortField(term9986, term9986.getClass(), "day", (short) 20);
        setField(term9932, term9932.getClass(), "workDay", term9986);
        setField(term9932, term9932.getClass(), "comment", "PHvxnGHptP");
        term10002 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10002;
        callMethod(klass, "setBillable", argTypes, term9932, args);
    }

};


