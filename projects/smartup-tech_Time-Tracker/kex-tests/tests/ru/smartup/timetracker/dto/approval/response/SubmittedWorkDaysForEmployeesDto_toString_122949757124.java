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

public class SubmittedWorkDaysForEmployeesDto_toString_122949757124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16910;

    public SubmittedWorkDaysForEmployeesDto_toString_122949757124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16910 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto"));
        Object term16936 = newInstance(Class.forName("java.util.Date"));
        setIntField(term16910, term16910.getClass(), "employeeId", -505439934);
        setField(term16910, term16910.getClass(), "firstName", "iIRsCSYqXH");
        setField(term16910, term16910.getClass(), "lastName", "nghfqDXyCG");
        setLongField(term16936, term16936.getClass(), "fastTime", 1467783054847L);
        setField(term16936, term16936.getClass(), "cdate", null);
        setField(term16910, term16910.getClass(), "trackUnitWorkDay", term16936);
        setIntField(term16910, term16910.getClass(), "projectId", -344842608);
        setField(term16910, term16910.getClass(), "projectName", "WBAOTqErtm");
        setLongField(term16910, term16910.getClass(), "trackUnitId", -8892586408602479513L);
        setLongField(term16910, term16910.getClass(), "taskId", 4616440478358528406L);
        setField(term16910, term16910.getClass(), "taskName", "PqtVXXZMqK");
        setFloatField(term16910, term16910.getClass(), "trackUnitHours", 0.6563145F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysForEmployeesDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term16910, args);
    }

};


