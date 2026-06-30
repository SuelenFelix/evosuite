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

public class SubmittedHoursByWeekAndProjectDto_hashCode_12298472725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12321;

    public SubmittedHoursByWeekAndProjectDto_hashCode_12298472725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12421 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term12420 = ((Class) term12421).getDeclaredField((String) "CREATED");
        ((Field) term12420).setAccessible(true);
        Object enum26 = ((Field) term12420).get((Object) null);
        term12321 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term12374 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term12321, term12321.getClass(), "trackUnitId", -1154553077993834885L);
        setIntField(term12321, term12321.getClass(), "employeeId", 590364439);
        setField(term12321, term12321.getClass(), "firstName", "QXzGXbEXMu");
        setField(term12321, term12321.getClass(), "lastName", "qxSDVejjiY");
        setLongField(term12321, term12321.getClass(), "taskId", -2850532706972744550L);
        setField(term12321, term12321.getClass(), "taskName", "xBsXSDjXYK");
        setFloatField(term12321, term12321.getClass(), "hours", 0.13745493F);
        setField(term12321, term12321.getClass(), "status", enum26);
        setBooleanField(term12321, term12321.getClass(), "billable", false);
        setIntField(term12374, term12374.getClass(), "year", 2021);
        setShortField(term12374, term12374.getClass(), "month", (short) 9);
        setShortField(term12374, term12374.getClass(), "day", (short) 6);
        setField(term12321, term12321.getClass(), "workDay", term12374);
        setField(term12321, term12321.getClass(), "comment", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12321, args);
    }

};


