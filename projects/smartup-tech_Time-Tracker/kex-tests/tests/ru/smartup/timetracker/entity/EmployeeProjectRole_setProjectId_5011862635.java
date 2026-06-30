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

public class EmployeeProjectRole_setProjectId_5011862635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17425;
     Object term17442;

    public EmployeeProjectRole_setProjectId_5011862635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17445 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term17444 = ((Class) term17445).getDeclaredField((String) "EMPLOYEE");
        ((Field) term17444).setAccessible(true);
        Object enum42 = ((Field) term17444).get((Object) null);
        Float term17440 = new Float(0.8564069F);
        term17425 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term17425, term17425.getClass(), "employeeId", 962840079);
        setIntField(term17425, term17425.getClass(), "projectId", 1540719661);
        setField(term17425, term17425.getClass(), "projectRoleId", enum42);
        setField(term17425, term17425.getClass(), "externalRate", term17440);
        term17442 = new Integer(1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17442;
        callMethod(klass, "setProjectId", argTypes, term17425, args);
    }

};


