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

public class SubmittedWorkDaysForEmployeesDto_canEqual_130186073122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16717;
     Object term16773;

    public SubmittedWorkDaysForEmployeesDto_canEqual_130186073122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16717 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16743 = newInstance(Class.forName("java.util.Date"));
        setIntField(term16717, term16717.getClass(), "employeeId", 1114000454);
        setField(term16717, term16717.getClass(), "firstName", "HBGNxdNURv");
        setField(term16717, term16717.getClass(), "lastName", "mfCpTPPQQm");
        setLongField(term16743, term16743.getClass(), "fastTime", 1264037800343L);
        setField(term16743, term16743.getClass(), "cdate", null);
        setField(term16717, term16717.getClass(), "trackUnitWorkDay", term16743);
        setIntField(term16717, term16717.getClass(), "projectId", -556405712);
        setField(term16717, term16717.getClass(), "projectName", "OcJCIDNIXA");
        setLongField(term16717, term16717.getClass(), "trackUnitId", -8121849829073967555L);
        setLongField(term16717, term16717.getClass(), "taskId", 5219030281405653303L);
        setField(term16717, term16717.getClass(), "taskName", "XfRABIFVEp");
        setFloatField(term16717, term16717.getClass(), "trackUnitHours", 0.079128504F);
        term16773 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16773;
        callMethod(klass, "canEqual", argTypes, term16717, args);
    }

};


