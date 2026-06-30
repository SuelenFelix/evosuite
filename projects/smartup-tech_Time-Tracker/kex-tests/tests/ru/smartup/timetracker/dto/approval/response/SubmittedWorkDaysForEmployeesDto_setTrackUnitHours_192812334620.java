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
import java.lang.Float;

public class SubmittedWorkDaysForEmployeesDto_setTrackUnitHours_192812334620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16522;
     Object term16578;

    public SubmittedWorkDaysForEmployeesDto_setTrackUnitHours_192812334620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16522 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16548 = newInstance(Class.forName("java.util.Date"));
        setIntField(term16522, term16522.getClass(), "employeeId", -1465035361);
        setField(term16522, term16522.getClass(), "firstName", "NzBMMhkhpT");
        setField(term16522, term16522.getClass(), "lastName", "qCpEbQDHdF");
        setLongField(term16548, term16548.getClass(), "fastTime", 1570714321079L);
        setField(term16548, term16548.getClass(), "cdate", null);
        setField(term16522, term16522.getClass(), "trackUnitWorkDay", term16548);
        setIntField(term16522, term16522.getClass(), "projectId", 1090617576);
        setField(term16522, term16522.getClass(), "projectName", "AHbZyFOmlo");
        setLongField(term16522, term16522.getClass(), "trackUnitId", 1195529027276497124L);
        setLongField(term16522, term16522.getClass(), "taskId", -2783999800714825789L);
        setField(term16522, term16522.getClass(), "taskName", "TwfWVQGiIj");
        setFloatField(term16522, term16522.getClass(), "trackUnitHours", 0.93741155F);
        term16578 = new Float(0.71813905F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term16578;
        callMethod(klass, "setTrackUnitHours", argTypes, term16522, args);
    }

};


