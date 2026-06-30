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

public class SubmittedHoursByWeekAndProjectDto_setLastName_178108525015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7160;

    public SubmittedHoursByWeekAndProjectDto_setLastName_178108525015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7272 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term7271 = ((Class) term7272).getDeclaredField((String) "CREATED");
        ((Field) term7271).setAccessible(true);
        Object enum15 = ((Field) term7271).get((Object) null);
        term7160 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term7213 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term7160, term7160.getClass(), "trackUnitId", -5892135042702373494L);
        setIntField(term7160, term7160.getClass(), "employeeId", -1685132342);
        setField(term7160, term7160.getClass(), "firstName", "dEnhdmILtU");
        setField(term7160, term7160.getClass(), "lastName", "hoicvmsovO");
        setLongField(term7160, term7160.getClass(), "taskId", 5262507301787091109L);
        setField(term7160, term7160.getClass(), "taskName", "eqJfYWRaEL");
        setFloatField(term7160, term7160.getClass(), "hours", 0.13906479F);
        setField(term7160, term7160.getClass(), "status", enum15);
        setBooleanField(term7160, term7160.getClass(), "billable", false);
        setIntField(term7213, term7213.getClass(), "year", 2029);
        setShortField(term7213, term7213.getClass(), "month", (short) 1);
        setShortField(term7213, term7213.getClass(), "day", (short) 20);
        setField(term7160, term7160.getClass(), "workDay", term7213);
        setField(term7160, term7160.getClass(), "comment", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "setLastName", argTypes, term7160, args);
    }

};


