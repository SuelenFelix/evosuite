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

public class SubmittedHoursByWeekAndProjectDto_setComment_42981974822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10880;

    public SubmittedHoursByWeekAndProjectDto_setComment_42981974822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10993 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term10992 = ((Class) term10993).getDeclaredField((String) "REJECTED");
        ((Field) term10992).setAccessible(true);
        Object enum23 = ((Field) term10992).get((Object) null);
        term10880 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term10934 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term10880, term10880.getClass(), "trackUnitId", -2170847986967241072L);
        setIntField(term10880, term10880.getClass(), "employeeId", -117576464);
        setField(term10880, term10880.getClass(), "firstName", "xOcJIiQQDu");
        setField(term10880, term10880.getClass(), "lastName", "GVizqqzXpy");
        setLongField(term10880, term10880.getClass(), "taskId", 4044358158040652353L);
        setField(term10880, term10880.getClass(), "taskName", "JqXGgAhZPl");
        setFloatField(term10880, term10880.getClass(), "hours", 0.97262454F);
        setField(term10880, term10880.getClass(), "status", enum23);
        setBooleanField(term10880, term10880.getClass(), "billable", true);
        setIntField(term10934, term10934.getClass(), "year", 2025);
        setShortField(term10934, term10934.getClass(), "month", (short) 4);
        setShortField(term10934, term10934.getClass(), "day", (short) 8);
        setField(term10880, term10880.getClass(), "workDay", term10934);
        setField(term10880, term10880.getClass(), "comment", "jiKYgYHqIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DfISiziTgG";
        callMethod(klass, "setComment", argTypes, term10880, args);
    }

};


