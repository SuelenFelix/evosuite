package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class ReportHours_getEmployeeLastName_13869956147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18351;

    public ReportHours_getEmployeeLastName_13869956147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18412 = new HashMap();
        term18351 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term18351, term18351.getClass(), "projectId", 1134449235);
        setField(term18351, term18351.getClass(), "projectName", "JUmudUmaaV");
        setLongField(term18351, term18351.getClass(), "taskId", 4872422362414183754L);
        setField(term18351, term18351.getClass(), "taskName", "KoyGrUJeJW");
        setIntField(term18351, term18351.getClass(), "employeeId", -883034806);
        setField(term18351, term18351.getClass(), "employeeFirstName", "HqBOwkVqjD");
        setField(term18351, term18351.getClass(), "employeeLastName", "MAcUBcBckh");
        setFloatField(term18351, term18351.getClass(), "billableHours", 0.9571234F);
        setFloatField(term18351, term18351.getClass(), "billableHoursFrozen", 0.114929974F);
        setFloatField(term18351, term18351.getClass(), "billableHoursNotFrozen", 0.30926234F);
        setFloatField(term18351, term18351.getClass(), "unbillableHours", 0.37161416F);
        setFloatField(term18351, term18351.getClass(), "unbillableHoursFrozen", 0.022591352F);
        setFloatField(term18351, term18351.getClass(), "unbillableHoursNotFrozen", 0.6805867F);
        setFloatField(term18351, term18351.getClass(), "totalHours", 0.51208574F);
        setFloatField(term18351, term18351.getClass(), "totalHoursFrozen", 0.28528106F);
        setFloatField(term18351, term18351.getClass(), "totalHoursNotFrozen", 0.30827713F);
        setField(term18351, term18351.getClass(), "workHoursMap", term18412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeLastName", argTypes, term18351, args);
    }

};


