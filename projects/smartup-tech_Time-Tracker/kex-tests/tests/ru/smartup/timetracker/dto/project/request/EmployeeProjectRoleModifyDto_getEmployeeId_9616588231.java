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
import java.lang.String;
import java.lang.Object;
import java.lang.Float;

public class EmployeeProjectRoleModifyDto_getEmployeeId_9616588231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;

    public EmployeeProjectRoleModifyDto_getEmployeeId_9616588231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term238 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term237 = ((Class) term238).getDeclaredField((String) "MANAGER");
        ((Field) term237).setAccessible(true);
        Object enum0 = ((Field) term237).get((Object) null);
        Float term212 = new Float(0.13238746F);
        term199 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto"));
        setIntField(term199, term199.getClass(), "employeeId", -2038273078);
        setField(term199, term199.getClass(), "projectRoleId", enum0);
        setField(term199, term199.getClass(), "externalRate", term212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term199, args);
    }

};


