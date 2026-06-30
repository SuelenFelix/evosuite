package ru.smartup.timetracker.dto.report.response;

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
import static ru.smartup.timetracker.dto.report.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Long;

public class ReportHoursForEmployeesDto_setTaskId_194643140920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3361;
     Object term3433;

    public ReportHoursForEmployeesDto_setTaskId_194643140920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3422 = new HashMap();
        term3361 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term3361, term3361.getClass(), "projectId", -1588772968);
        setField(term3361, term3361.getClass(), "projectName", "XOiDvlDhdc");
        setLongField(term3361, term3361.getClass(), "taskId", -4920224193275732920L);
        setField(term3361, term3361.getClass(), "taskName", "AdxvLJhNLe");
        setIntField(term3361, term3361.getClass(), "employeeId", -93135961);
        setField(term3361, term3361.getClass(), "employeeFirstName", "lHfTrWKMPk");
        setField(term3361, term3361.getClass(), "employeeLastName", "JDaAnsVTGV");
        setFloatField(term3361, term3361.getClass(), "billableHours", 0.17828572F);
        setFloatField(term3361, term3361.getClass(), "billableHoursFrozen", 0.6034811F);
        setFloatField(term3361, term3361.getClass(), "billableHoursNotFrozen", 0.17829382F);
        setFloatField(term3361, term3361.getClass(), "unbillableHours", 0.7008533F);
        setFloatField(term3361, term3361.getClass(), "unbillableHoursFrozen", 0.5479958F);
        setFloatField(term3361, term3361.getClass(), "unbillableHoursNotFrozen", 0.22069949F);
        setFloatField(term3361, term3361.getClass(), "totalHours", 0.3483938F);
        setFloatField(term3361, term3361.getClass(), "totalHoursFrozen", 0.5929208F);
        setFloatField(term3361, term3361.getClass(), "totalHoursNotFrozen", 0.010071814F);
        setField(term3361, term3361.getClass(), "workHoursMap", term3422);
        term3433 = new Long(8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3433;
        callMethod(klass, "setTaskId", argTypes, term3361, args);
    }

};


