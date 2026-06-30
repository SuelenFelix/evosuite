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

public class SubmittedHoursByWeekAndProjectDto_setWorkDay_1235339921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10405;
     Object term10475;

    public SubmittedHoursByWeekAndProjectDto_setWorkDay_1235339921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10510 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term10509 = ((Class) term10510).getDeclaredField((String) "APPROVED");
        ((Field) term10509).setAccessible(true);
        Object enum22 = ((Field) term10509).get((Object) null);
        term10405 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term10459 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term10405, term10405.getClass(), "trackUnitId", 4784595517102746672L);
        setIntField(term10405, term10405.getClass(), "employeeId", -2068769794);
        setField(term10405, term10405.getClass(), "firstName", "TimdotUuNC");
        setField(term10405, term10405.getClass(), "lastName", "PkWMRdJcBb");
        setLongField(term10405, term10405.getClass(), "taskId", -7612550318181586304L);
        setField(term10405, term10405.getClass(), "taskName", "jSpAteRute");
        setFloatField(term10405, term10405.getClass(), "hours", 0.51832694F);
        setField(term10405, term10405.getClass(), "status", enum22);
        setBooleanField(term10405, term10405.getClass(), "billable", true);
        setIntField(term10459, term10459.getClass(), "year", 2027);
        setShortField(term10459, term10459.getClass(), "month", (short) 3);
        setShortField(term10459, term10459.getClass(), "day", (short) 14);
        setField(term10405, term10405.getClass(), "workDay", term10459);
        setField(term10405, term10405.getClass(), "comment", "swZVeJAxjt");
        term10475 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term10475, term10475.getClass(), "year", 2018);
        setShortField(term10475, term10475.getClass(), "month", (short) 9);
        setShortField(term10475, term10475.getClass(), "day", (short) 27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term10475;
        callMethod(klass, "setWorkDay", argTypes, term10405, args);
    }

};


