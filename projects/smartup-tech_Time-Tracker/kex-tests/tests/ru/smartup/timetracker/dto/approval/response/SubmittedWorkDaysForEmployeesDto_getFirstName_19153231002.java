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

public class SubmittedWorkDaysForEmployeesDto_getFirstName_19153231002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14696;

    public SubmittedWorkDaysForEmployeesDto_getFirstName_19153231002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14696 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term14722 = newInstance(Class.forName("java.util.Date"));
        setIntField(term14696, term14696.getClass(), "employeeId", -1016503459);
        setField(term14696, term14696.getClass(), "firstName", "WHcwFgsGFC");
        setField(term14696, term14696.getClass(), "lastName", "HzqpegHiRq");
        setLongField(term14722, term14722.getClass(), "fastTime", 1762147441299L);
        setField(term14722, term14722.getClass(), "cdate", null);
        setField(term14696, term14696.getClass(), "trackUnitWorkDay", term14722);
        setIntField(term14696, term14696.getClass(), "projectId", -1968847291);
        setField(term14696, term14696.getClass(), "projectName", "jwsfVjMoJT");
        setLongField(term14696, term14696.getClass(), "trackUnitId", -900457279156388404L);
        setLongField(term14696, term14696.getClass(), "taskId", 1084801489398441516L);
        setField(term14696, term14696.getClass(), "taskName", "ZfdXfCCFDf");
        setFloatField(term14696, term14696.getClass(), "trackUnitHours", 0.63972145F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term14696, args);
    }

};


