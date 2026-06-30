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

public class SubmittedWorkDaysForEmployeesDto_getProjectName_11896581176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15080;

    public SubmittedWorkDaysForEmployeesDto_getProjectName_11896581176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15080 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15106 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15080, term15080.getClass(), "employeeId", -1048298087);
        setField(term15080, term15080.getClass(), "firstName", "WzFopsaDuG");
        setField(term15080, term15080.getClass(), "lastName", "PapWxkhEWe");
        setLongField(term15106, term15106.getClass(), "fastTime", 1345923503543L);
        setField(term15106, term15106.getClass(), "cdate", null);
        setField(term15080, term15080.getClass(), "trackUnitWorkDay", term15106);
        setIntField(term15080, term15080.getClass(), "projectId", 292681826);
        setField(term15080, term15080.getClass(), "projectName", "smnHEqRFRx");
        setLongField(term15080, term15080.getClass(), "trackUnitId", -2255965562447970862L);
        setLongField(term15080, term15080.getClass(), "taskId", 148047808219672941L);
        setField(term15080, term15080.getClass(), "taskName", "XYtryyobou");
        setFloatField(term15080, term15080.getClass(), "trackUnitHours", 0.5873228F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term15080, args);
    }

};


