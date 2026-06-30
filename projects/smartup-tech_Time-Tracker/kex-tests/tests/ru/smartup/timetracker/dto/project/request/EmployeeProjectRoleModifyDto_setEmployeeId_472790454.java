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
import java.lang.Integer;

public class EmployeeProjectRoleModifyDto_setEmployeeId_472790454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281;
     Object term1296;

    public EmployeeProjectRoleModifyDto_setEmployeeId_472790454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1299 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1298 = ((Class) term1299).getDeclaredField((String) "MANAGER");
        ((Field) term1298).setAccessible(true);
        Object enum3 = ((Field) term1298).get((Object) null);
        Float term1294 = new Float(0.09123778F);
        term1281 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto"));
        setIntField(term1281, term1281.getClass(), "employeeId", 1725571209);
        setField(term1281, term1281.getClass(), "projectRoleId", enum3);
        setField(term1281, term1281.getClass(), "externalRate", term1294);
        term1296 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1296;
        callMethod(klass, "setEmployeeId", argTypes, term1281, args);
    }

};


