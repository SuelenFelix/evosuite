package ru.smartup.timetracker.dto.project.request;

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
import static ru.smartup.timetracker.dto.project.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeProjectRoleModifyDto_setExternalRate_76453009117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3786;

    public EmployeeProjectRoleModifyDto_setExternalRate_76453009117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3786 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto"));
        setIntField(term3786, term3786.getClass(), "employeeId", 0);
        setField(term3786, term3786.getClass(), "projectRoleId", null);
        setField(term3786, term3786.getClass(), "externalRate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Float");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExternalRate", argTypes, term3786, args);
    }

};


