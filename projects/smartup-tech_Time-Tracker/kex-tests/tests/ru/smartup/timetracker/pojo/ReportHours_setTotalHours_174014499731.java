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
import java.lang.Float;

public class ReportHours_setTotalHours_174014499731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21145;
     Object term21217;

    public ReportHours_setTotalHours_174014499731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21206 = new HashMap();
        term21145 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21145, term21145.getClass(), "projectId", -1371869594);
        setField(term21145, term21145.getClass(), "projectName", "wzsPSPcRdj");
        setLongField(term21145, term21145.getClass(), "taskId", -5892135042702373494L);
        setField(term21145, term21145.getClass(), "taskName", "kGMQdqJYyB");
        setIntField(term21145, term21145.getClass(), "employeeId", -2095575670);
        setField(term21145, term21145.getClass(), "employeeFirstName", "XJJNClzHRf");
        setField(term21145, term21145.getClass(), "employeeLastName", "HDaezxQfQR");
        setFloatField(term21145, term21145.getClass(), "billableHours", 0.110482514F);
        setFloatField(term21145, term21145.getClass(), "billableHoursFrozen", 0.61427236F);
        setFloatField(term21145, term21145.getClass(), "billableHoursNotFrozen", 0.94188213F);
        setFloatField(term21145, term21145.getClass(), "unbillableHours", 0.43556267F);
        setFloatField(term21145, term21145.getClass(), "unbillableHoursFrozen", 0.8789557F);
        setFloatField(term21145, term21145.getClass(), "unbillableHoursNotFrozen", 0.8414608F);
        setFloatField(term21145, term21145.getClass(), "totalHours", 0.78664905F);
        setFloatField(term21145, term21145.getClass(), "totalHoursFrozen", 0.78593165F);
        setFloatField(term21145, term21145.getClass(), "totalHoursNotFrozen", 0.98989093F);
        setField(term21145, term21145.getClass(), "workHoursMap", term21206);
        term21217 = new Float(0.64287424F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term21217;
        callMethod(klass, "setTotalHours", argTypes, term21145, args);
    }

};


