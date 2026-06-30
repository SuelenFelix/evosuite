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

public class SubmittedHoursByWeekAndProjectDto_toString_63374441726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12788;

    public SubmittedHoursByWeekAndProjectDto_toString_63374441726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12888 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term12887 = ((Class) term12888).getDeclaredField((String) "CREATED");
        ((Field) term12887).setAccessible(true);
        Object enum27 = ((Field) term12887).get((Object) null);
        term12788 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto"));
        Object term12841 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term12788, term12788.getClass(), "trackUnitId", -2644215923136513282L);
        setIntField(term12788, term12788.getClass(), "employeeId", 865208305);
        setField(term12788, term12788.getClass(), "firstName", "ZVecLZMLHF");
        setField(term12788, term12788.getClass(), "lastName", "fztQhjqwdP");
        setLongField(term12788, term12788.getClass(), "taskId", -1468719814009985452L);
        setField(term12788, term12788.getClass(), "taskName", "eVpkWxjuki");
        setFloatField(term12788, term12788.getClass(), "hours", 0.20144695F);
        setField(term12788, term12788.getClass(), "status", enum27);
        setBooleanField(term12788, term12788.getClass(), "billable", false);
        setIntField(term12841, term12841.getClass(), "year", 2025);
        setShortField(term12841, term12841.getClass(), "month", (short) 2);
        setShortField(term12841, term12841.getClass(), "day", (short) 13);
        setField(term12788, term12788.getClass(), "workDay", term12841);
        setField(term12788, term12788.getClass(), "comment", "SJiQaLvSKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12788, args);
    }

};


