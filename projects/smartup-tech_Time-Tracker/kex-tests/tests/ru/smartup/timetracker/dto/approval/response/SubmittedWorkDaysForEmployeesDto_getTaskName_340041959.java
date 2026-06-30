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

public class SubmittedWorkDaysForEmployeesDto_getTaskName_340041959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15368;

    public SubmittedWorkDaysForEmployeesDto_getTaskName_340041959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15368 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15394 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15368, term15368.getClass(), "employeeId", 1596070772);
        setField(term15368, term15368.getClass(), "firstName", "lihXWlGDxk");
        setField(term15368, term15368.getClass(), "lastName", "JmcmxoGhIK");
        setLongField(term15394, term15394.getClass(), "fastTime", 1597233967116L);
        setField(term15394, term15394.getClass(), "cdate", null);
        setField(term15368, term15368.getClass(), "trackUnitWorkDay", term15394);
        setIntField(term15368, term15368.getClass(), "projectId", 97029295);
        setField(term15368, term15368.getClass(), "projectName", "jXzmYyrnnT");
        setLongField(term15368, term15368.getClass(), "trackUnitId", -1616722610139554082L);
        setLongField(term15368, term15368.getClass(), "taskId", 7495904023107549024L);
        setField(term15368, term15368.getClass(), "taskName", "igCAtimmYB");
        setFloatField(term15368, term15368.getClass(), "trackUnitHours", 0.91971004F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term15368, args);
    }

};


