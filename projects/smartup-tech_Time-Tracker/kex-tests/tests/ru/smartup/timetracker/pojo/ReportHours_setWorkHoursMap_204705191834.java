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
import java.util.LinkedHashMap;

public class ReportHours_setWorkHoursMap_204705191834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21487;
     Object term21559;

    public ReportHours_setWorkHoursMap_204705191834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21548 = new HashMap();
        term21487 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term21487, term21487.getClass(), "projectId", -112921587);
        setField(term21487, term21487.getClass(), "projectName", "QduALnDSVo");
        setLongField(term21487, term21487.getClass(), "taskId", -484994522244390100L);
        setField(term21487, term21487.getClass(), "taskName", "izPpKDErnQ");
        setIntField(term21487, term21487.getClass(), "employeeId", 933028652);
        setField(term21487, term21487.getClass(), "employeeFirstName", "NnpwZBUTvx");
        setField(term21487, term21487.getClass(), "employeeLastName", "tlQSNgTkQX");
        setFloatField(term21487, term21487.getClass(), "billableHours", 0.6826852F);
        setFloatField(term21487, term21487.getClass(), "billableHoursFrozen", 0.5725602F);
        setFloatField(term21487, term21487.getClass(), "billableHoursNotFrozen", 0.6730242F);
        setFloatField(term21487, term21487.getClass(), "unbillableHours", 0.5310967F);
        setFloatField(term21487, term21487.getClass(), "unbillableHoursFrozen", 0.13481039F);
        setFloatField(term21487, term21487.getClass(), "unbillableHoursNotFrozen", 0.6054109F);
        setFloatField(term21487, term21487.getClass(), "totalHours", 0.34141678F);
        setFloatField(term21487, term21487.getClass(), "totalHoursFrozen", 0.916524F);
        setFloatField(term21487, term21487.getClass(), "totalHoursNotFrozen", 0.42916924F);
        setField(term21487, term21487.getClass(), "workHoursMap", term21548);
        term21559 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term21559;
        callMethod(klass, "setWorkHoursMap", argTypes, term21487, args);
    }

};


