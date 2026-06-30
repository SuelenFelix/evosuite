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

public class ReportHoursForEmployeesDto_getEmployeeFirstName_8539989976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1769;

    public ReportHoursForEmployeesDto_getEmployeeFirstName_8539989976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1830 = new HashMap();
        term1769 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term1769, term1769.getClass(), "projectId", -469968304);
        setField(term1769, term1769.getClass(), "projectName", "UoYtihxVaS");
        setLongField(term1769, term1769.getClass(), "taskId", 7411271909051562686L);
        setField(term1769, term1769.getClass(), "taskName", "JDswTTCZHV");
        setIntField(term1769, term1769.getClass(), "employeeId", -1145578966);
        setField(term1769, term1769.getClass(), "employeeFirstName", "onpbIeEKoi");
        setField(term1769, term1769.getClass(), "employeeLastName", "YRHGsAkhxb");
        setFloatField(term1769, term1769.getClass(), "billableHours", 0.64287424F);
        setFloatField(term1769, term1769.getClass(), "billableHoursFrozen", 0.9712829F);
        setFloatField(term1769, term1769.getClass(), "billableHoursNotFrozen", 0.65841657F);
        setFloatField(term1769, term1769.getClass(), "unbillableHours", 0.09628683F);
        setFloatField(term1769, term1769.getClass(), "unbillableHoursFrozen", 0.4426849F);
        setFloatField(term1769, term1769.getClass(), "unbillableHoursNotFrozen", 0.27164584F);
        setFloatField(term1769, term1769.getClass(), "totalHours", 0.75073326F);
        setFloatField(term1769, term1769.getClass(), "totalHoursFrozen", 0.6590957F);
        setFloatField(term1769, term1769.getClass(), "totalHoursNotFrozen", 0.0074937344F);
        setField(term1769, term1769.getClass(), "workHoursMap", term1830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeFirstName", argTypes, term1769, args);
    }

};


