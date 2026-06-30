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
import java.lang.Float;

public class ReportHoursForEmployeesDto_setTotalHours_100622592031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4675;
     Object term4747;

    public ReportHoursForEmployeesDto_setTotalHours_100622592031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4736 = new HashMap();
        term4675 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto"));
        setIntField(term4675, term4675.getClass(), "projectId", -556405712);
        setField(term4675, term4675.getClass(), "projectName", "VGizxZnyHX");
        setLongField(term4675, term4675.getClass(), "taskId", -5892135042702373494L);
        setField(term4675, term4675.getClass(), "taskName", "kVEZMHmRtR");
        setIntField(term4675, term4675.getClass(), "employeeId", -1772434990);
        setField(term4675, term4675.getClass(), "employeeFirstName", "ekxGuOYIwi");
        setField(term4675, term4675.getClass(), "employeeLastName", "RbVQXSpxXy");
        setFloatField(term4675, term4675.getClass(), "billableHours", 0.61838096F);
        setFloatField(term4675, term4675.getClass(), "billableHoursFrozen", 0.47210747F);
        setFloatField(term4675, term4675.getClass(), "billableHoursNotFrozen", 0.6520681F);
        setFloatField(term4675, term4675.getClass(), "unbillableHours", 0.83811766F);
        setFloatField(term4675, term4675.getClass(), "unbillableHoursFrozen", 0.026607692F);
        setFloatField(term4675, term4675.getClass(), "unbillableHoursNotFrozen", 0.230708F);
        setFloatField(term4675, term4675.getClass(), "totalHours", 0.14752114F);
        setFloatField(term4675, term4675.getClass(), "totalHoursFrozen", 0.43372667F);
        setFloatField(term4675, term4675.getClass(), "totalHoursNotFrozen", 0.74047095F);
        setField(term4675, term4675.getClass(), "workHoursMap", term4736);
        term4747 = new Float(0.11979389F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term4747;
        callMethod(klass, "setTotalHours", argTypes, term4675, args);
    }

};


