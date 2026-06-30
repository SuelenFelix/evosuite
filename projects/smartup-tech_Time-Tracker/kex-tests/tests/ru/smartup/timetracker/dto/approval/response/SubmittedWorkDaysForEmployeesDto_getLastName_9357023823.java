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

public class SubmittedWorkDaysForEmployeesDto_getLastName_9357023823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14792;

    public SubmittedWorkDaysForEmployeesDto_getLastName_9357023823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14792 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term14818 = newInstance(Class.forName("java.util.Date"));
        setIntField(term14792, term14792.getClass(), "employeeId", 579005622);
        setField(term14792, term14792.getClass(), "firstName", "MwwjNtdOFT");
        setField(term14792, term14792.getClass(), "lastName", "VYkqXKVlAJ");
        setLongField(term14818, term14818.getClass(), "fastTime", 1395479491666L);
        setField(term14818, term14818.getClass(), "cdate", null);
        setField(term14792, term14792.getClass(), "trackUnitWorkDay", term14818);
        setIntField(term14792, term14792.getClass(), "projectId", -14890619);
        setField(term14792, term14792.getClass(), "projectName", "XkIoWJRNwN");
        setLongField(term14792, term14792.getClass(), "trackUnitId", 6273754186658578034L);
        setLongField(term14792, term14792.getClass(), "taskId", 3620247240684476031L);
        setField(term14792, term14792.getClass(), "taskName", "aNWLJdrZMq");
        setFloatField(term14792, term14792.getClass(), "trackUnitHours", 0.3357792F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term14792, args);
    }

};


