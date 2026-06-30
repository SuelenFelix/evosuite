package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Float;
import java.lang.Integer;

public class EmployeeProjectRole_setEmployeeId_3670085604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17065;
     Object term17082;

    public EmployeeProjectRole_setEmployeeId_3670085604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17085 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term17084 = ((Class) term17085).getDeclaredField((String) "EMPLOYEE");
        ((Field) term17084).setAccessible(true);
        Object enum41 = ((Field) term17084).get((Object) null);
        Float term17080 = new Float(0.5523636F);
        term17065 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term17065, term17065.getClass(), "employeeId", -112921587);
        setIntField(term17065, term17065.getClass(), "projectId", 933028652);
        setField(term17065, term17065.getClass(), "projectRoleId", enum41);
        setField(term17065, term17065.getClass(), "externalRate", term17080);
        term17082 = new Integer(287287233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17082;
        callMethod(klass, "setEmployeeId", argTypes, term17065, args);
    }

};


