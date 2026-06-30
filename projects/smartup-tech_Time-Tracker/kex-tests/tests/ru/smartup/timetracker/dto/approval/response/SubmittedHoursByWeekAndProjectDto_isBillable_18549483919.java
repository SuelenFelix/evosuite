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

public class SubmittedHoursByWeekAndProjectDto_isBillable_18549483919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4296;

    public SubmittedHoursByWeekAndProjectDto_isBillable_18549483919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4397 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term4396 = ((Class) term4397).getDeclaredField((String) "APPROVED");
        ((Field) term4396).setAccessible(true);
        Object enum9 = ((Field) term4396).get((Object) null);
        term4296 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term4350 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term4296, term4296.getClass(), "trackUnitId", -6573104506744284592L);
        setIntField(term4296, term4296.getClass(), "employeeId", -1339778481);
        setField(term4296, term4296.getClass(), "firstName", "xrwlQZdwCp");
        setField(term4296, term4296.getClass(), "lastName", "IDCWpPLRkE");
        setLongField(term4296, term4296.getClass(), "taskId", -4920224193275732920L);
        setField(term4296, term4296.getClass(), "taskName", "nyiiPDVjAc");
        setFloatField(term4296, term4296.getClass(), "hours", 0.6880585F);
        setField(term4296, term4296.getClass(), "status", enum9);
        setBooleanField(term4296, term4296.getClass(), "billable", true);
        setIntField(term4350, term4350.getClass(), "year", 2017);
        setShortField(term4350, term4350.getClass(), "month", (short) 7);
        setShortField(term4350, term4350.getClass(), "day", (short) 22);
        setField(term4296, term4296.getClass(), "workDay", term4350);
        setField(term4296, term4296.getClass(), "comment", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBillable", argTypes, term4296, args);
    }

};


