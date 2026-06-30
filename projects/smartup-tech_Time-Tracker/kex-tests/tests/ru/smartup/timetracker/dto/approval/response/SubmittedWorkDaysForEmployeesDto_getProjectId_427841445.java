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

public class SubmittedWorkDaysForEmployeesDto_getProjectId_427841445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14984;

    public SubmittedWorkDaysForEmployeesDto_getProjectId_427841445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14984 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term15010 = newInstance(Class.forName("java.util.Date"));
        setIntField(term14984, term14984.getClass(), "employeeId", -1786399638);
        setField(term14984, term14984.getClass(), "firstName", "VeDtgDzGAN");
        setField(term14984, term14984.getClass(), "lastName", "aWYOWZFyaX");
        setLongField(term15010, term15010.getClass(), "fastTime", 1535838449065L);
        setField(term15010, term15010.getClass(), "cdate", null);
        setField(term14984, term14984.getClass(), "trackUnitWorkDay", term15010);
        setIntField(term14984, term14984.getClass(), "projectId", 2055867847);
        setField(term14984, term14984.getClass(), "projectName", "BRIVNtfUWU");
        setLongField(term14984, term14984.getClass(), "trackUnitId", -1804015692891701666L);
        setLongField(term14984, term14984.getClass(), "taskId", -6432617521836576658L);
        setField(term14984, term14984.getClass(), "taskName", "DbiCVtPPCT");
        setFloatField(term14984, term14984.getClass(), "trackUnitHours", 0.8704517F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term14984, args);
    }

};


