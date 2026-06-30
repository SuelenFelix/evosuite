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
import java.lang.Object;
import java.lang.Long;

public class SubmittedWorkDaysForEmployeesDto_setTrackUnitId_9046462417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16208;
     Object term16264;

    public SubmittedWorkDaysForEmployeesDto_setTrackUnitId_9046462417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16208 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16234 = newInstance(Class.forName("java.util.Date"));
        setIntField(term16208, term16208.getClass(), "employeeId", 1375330971);
        setField(term16208, term16208.getClass(), "firstName", "QduALnDSVo");
        setField(term16208, term16208.getClass(), "lastName", "izPpKDErnQ");
        setLongField(term16234, term16234.getClass(), "fastTime", 1285661498273L);
        setField(term16234, term16234.getClass(), "cdate", null);
        setField(term16208, term16208.getClass(), "trackUnitWorkDay", term16234);
        setIntField(term16208, term16208.getClass(), "projectId", -478195677);
        setField(term16208, term16208.getClass(), "projectName", "NnpwZBUTvx");
        setLongField(term16208, term16208.getClass(), "trackUnitId", 1457594663983990440L);
        setLongField(term16208, term16208.getClass(), "taskId", 3452833434644634217L);
        setField(term16208, term16208.getClass(), "taskName", "tlQSNgTkQX");
        setFloatField(term16208, term16208.getClass(), "trackUnitHours", 0.5602794F);
        term16264 = new Long(-8603648071751666348L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term16264;
        callMethod(klass, "setTrackUnitId", argTypes, term16208, args);
    }

};


