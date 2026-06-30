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

public class ReportHours_getTotalHours_128534743914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19135;

    public ReportHours_getTotalHours_128534743914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19196 = new HashMap();
        term19135 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term19135, term19135.getClass(), "projectId", 590364439);
        setField(term19135, term19135.getClass(), "projectName", "sEnIVFtZuQ");
        setLongField(term19135, term19135.getClass(), "taskId", 2535595959091595249L);
        setField(term19135, term19135.getClass(), "taskName", "ZVecLZMLHF");
        setIntField(term19135, term19135.getClass(), "employeeId", 865208305);
        setField(term19135, term19135.getClass(), "employeeFirstName", "fztQhjqwdP");
        setField(term19135, term19135.getClass(), "employeeLastName", "eVpkWxjuki");
        setFloatField(term19135, term19135.getClass(), "billableHours", 0.32273352F);
        setFloatField(term19135, term19135.getClass(), "billableHoursFrozen", 0.24959576F);
        setFloatField(term19135, term19135.getClass(), "billableHoursNotFrozen", 0.43337202F);
        setFloatField(term19135, term19135.getClass(), "unbillableHours", 0.34331435F);
        setFloatField(term19135, term19135.getClass(), "unbillableHoursFrozen", 0.13246995F);
        setFloatField(term19135, term19135.getClass(), "unbillableHoursNotFrozen", 0.012435675F);
        setFloatField(term19135, term19135.getClass(), "totalHours", 0.912685F);
        setFloatField(term19135, term19135.getClass(), "totalHoursFrozen", 0.25778466F);
        setFloatField(term19135, term19135.getClass(), "totalHoursNotFrozen", 0.11179066F);
        setField(term19135, term19135.getClass(), "workHoursMap", term19196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalHours", argTypes, term19135, args);
    }

};


