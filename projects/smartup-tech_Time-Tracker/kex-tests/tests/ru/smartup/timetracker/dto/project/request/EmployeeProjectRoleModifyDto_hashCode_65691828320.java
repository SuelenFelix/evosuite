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

public class EmployeeProjectRoleModifyDto_hashCode_65691828320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3792;

    public EmployeeProjectRoleModifyDto_hashCode_65691828320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3792 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto"));
        setIntField(term3792, term3792.getClass(), "employeeId", 0);
        setField(term3792, term3792.getClass(), "projectRoleId", null);
        setField(term3792, term3792.getClass(), "externalRate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3792, args);
    }

};


