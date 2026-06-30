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

public class ReportHoursForEmployeesDto_getUnbillableHours_103182408411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2329;

    public ReportHoursForEmployeesDto_getUnbillableHours_103182408411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2390 = new HashMap();
        term2329 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term2329, term2329.getClass(), "projectId", -1968847291);
        setField(term2329, term2329.getClass(), "projectName", "vQVyKLdtaz");
        setLongField(term2329, term2329.getClass(), "taskId", -2813493605142626659L);
        setField(term2329, term2329.getClass(), "taskName", "OWKQODBLzb");
        setIntField(term2329, term2329.getClass(), "employeeId", 579005622);
        setField(term2329, term2329.getClass(), "employeeFirstName", "wGmYcqUkgE");
        setField(term2329, term2329.getClass(), "employeeLastName", "idgaQsnJpQ");
        setFloatField(term2329, term2329.getClass(), "billableHours", 0.016047299F);
        setFloatField(term2329, term2329.getClass(), "billableHoursFrozen", 0.94859296F);
        setFloatField(term2329, term2329.getClass(), "billableHoursNotFrozen", 0.4054746F);
        setFloatField(term2329, term2329.getClass(), "unbillableHours", 0.5179319F);
        setFloatField(term2329, term2329.getClass(), "unbillableHoursFrozen", 0.73743176F);
        setFloatField(term2329, term2329.getClass(), "unbillableHoursNotFrozen", 0.25025773F);
        setFloatField(term2329, term2329.getClass(), "totalHours", 0.96599394F);
        setFloatField(term2329, term2329.getClass(), "totalHoursFrozen", 0.18580896F);
        setFloatField(term2329, term2329.getClass(), "totalHoursNotFrozen", 0.12414467F);
        setField(term2329, term2329.getClass(), "workHoursMap", term2390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnbillableHours", argTypes, term2329, args);
    }

};


