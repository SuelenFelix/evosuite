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

public class SubmittedWorkDaysForEmployeesDto_getTaskId_10898663288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15272;

    public SubmittedWorkDaysForEmployeesDto_getTaskId_10898663288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15272 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15298 = newInstance(Class.forName("java.util.Date"));
        setIntField(term15272, term15272.getClass(), "employeeId", 493620644);
        setField(term15272, term15272.getClass(), "firstName", "zUlRdimJtU");
        setField(term15272, term15272.getClass(), "lastName", "vwbEQQNQrx");
        setLongField(term15298, term15298.getClass(), "fastTime", 1332871705432L);
        setField(term15298, term15298.getClass(), "cdate", null);
        setField(term15272, term15272.getClass(), "trackUnitWorkDay", term15298);
        setIntField(term15272, term15272.getClass(), "projectId", 1328271830);
        setField(term15272, term15272.getClass(), "projectName", "xtftXXMbem");
        setLongField(term15272, term15272.getClass(), "trackUnitId", -4023935540989049732L);
        setLongField(term15272, term15272.getClass(), "taskId", 855932984568615096L);
        setField(term15272, term15272.getClass(), "taskName", "cudZvLMQon");
        setFloatField(term15272, term15272.getClass(), "trackUnitHours", 0.8823181F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term15272, args);
    }

};


