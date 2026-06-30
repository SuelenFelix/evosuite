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

public class EmployeeProjectRoleModifyDto_toString_116767797310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3421;

    public EmployeeProjectRoleModifyDto_toString_116767797310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3437 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term3436 = ((Class) term3437).getDeclaredField((String) "MANAGER");
        ((Field) term3436).setAccessible(true);
        Object enum9 = ((Field) term3436).get((Object) null);
        Float term3434 = new Float(0.40176582F);
        term3421 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto"));
        setIntField(term3421, term3421.getClass(), "employeeId", -1456670397);
        setField(term3421, term3421.getClass(), "projectRoleId", enum9);
        setField(term3421, term3421.getClass(), "externalRate", term3434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.request.EmployeeProjectRoleModifyDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3421, args);
    }

};


