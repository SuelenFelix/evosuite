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
import java.lang.Integer;

public class SubmittedWorkDaysForEmployeesDto_setEmployeeId_194507079711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15560;
     Object term15616;

    public SubmittedWorkDaysForEmployeesDto_setEmployeeId_194507079711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15560 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15586 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15560, term15560.getClass(), "employeeId", 1225272962);
        setField(term15560, term15560.getClass(), "firstName", "RbVQXSpxXy");
        setField(term15560, term15560.getClass(), "lastName", "YpJbIgJWWv");
        setLongField(term15586, term15586.getClass(), "fastTime", 1278177575793L);
        setField(term15586, term15586.getClass(), "cdate", null);
        setField(term15560, term15560.getClass(), "trackUnitWorkDay", term15586);
        setIntField(term15560, term15560.getClass(), "projectId", 1324040357);
        setField(term15560, term15560.getClass(), "projectName", "JppkknKVOw");
        setLongField(term15560, term15560.getClass(), "trackUnitId", -7115418542247301000L);
        setLongField(term15560, term15560.getClass(), "taskId", 8034714140377562739L);
        setField(term15560, term15560.getClass(), "taskName", "iljANwuEjk");
        setFloatField(term15560, term15560.getClass(), "trackUnitHours", 0.10338366F);
        term15616 = new Integer(-1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term15616;
        callMethod(klass, "setEmployeeId", argTypes, term15560, args);
    }

};


