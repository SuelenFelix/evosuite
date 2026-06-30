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

public class EmployeeProjectRoleModifyDto_setExternalRate_7645300916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1993;
     Object term2009;

    public EmployeeProjectRoleModifyDto_setExternalRate_7645300916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2012 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term2011 = ((Class) term2012).getDeclaredField((String) "EMPLOYEE");
        ((Field) term2011).setAccessible(true);
        Object enum5 = ((Field) term2011).get((Object) null);
        Float term2007 = new Float(0.8564069F);
        term1993 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto"));
        setIntField(term1993, term1993.getClass(), "employeeId", -883034806);
        setField(term1993, term1993.getClass(), "projectRoleId", enum5);
        setField(term1993, term1993.getClass(), "externalRate", term2007);
        term2009 = new Float(0.5446086F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Float");
        Object[] args = new Object[1];
        args[0] = term2009;
        callMethod(klass, "setExternalRate", argTypes, term1993, args);
    }

};


