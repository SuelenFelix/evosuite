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

public class ReportHours_getBillableHoursNotFrozen_68072059710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18687;

    public ReportHours_getBillableHoursNotFrozen_68072059710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18748 = new HashMap();
        term18687 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ReportHours"));
        setIntField(term18687, term18687.getClass(), "projectId", 1622346318);
        setField(term18687, term18687.getClass(), "projectName", "TimdotUuNC");
        setLongField(term18687, term18687.getClass(), "taskId", 6967924379644551255L);
        setField(term18687, term18687.getClass(), "taskName", "PkWMRdJcBb");
        setIntField(term18687, term18687.getClass(), "employeeId", 1048535127);
        setField(term18687, term18687.getClass(), "employeeFirstName", "jSpAteRute");
        setField(term18687, term18687.getClass(), "employeeLastName", "swZVeJAxjt");
        setFloatField(term18687, term18687.getClass(), "billableHours", 0.65889484F);
        setFloatField(term18687, term18687.getClass(), "billableHoursFrozen", 0.25392914F);
        setFloatField(term18687, term18687.getClass(), "billableHoursNotFrozen", 0.63972145F);
        setFloatField(term18687, term18687.getClass(), "unbillableHours", 0.3357792F);
        setFloatField(term18687, term18687.getClass(), "unbillableHoursFrozen", 0.25937343F);
        setFloatField(term18687, term18687.getClass(), "unbillableHoursNotFrozen", 0.8704517F);
        setFloatField(term18687, term18687.getClass(), "totalHours", 0.5873228F);
        setFloatField(term18687, term18687.getClass(), "totalHoursFrozen", 0.5703112F);
        setFloatField(term18687, term18687.getClass(), "totalHoursNotFrozen", 0.8823181F);
        setField(term18687, term18687.getClass(), "workHoursMap", term18748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ReportHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBillableHoursNotFrozen", argTypes, term18687, args);
    }

};


