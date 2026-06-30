package ru.smartup.timetracker.dto.project.response;

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
import static ru.smartup.timetracker.dto.project.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Float;

public class EmployeeInProjectDto_setProjectRoleId_38806200011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8496;
     Object enum20;

    public EmployeeInProjectDto_setProjectRoleId_38806200011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8579 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term8578 = ((Class) term8579).getDeclaredField((String) "EMPLOYEE");
        ((Field) term8578).setAccessible(true);
        enum20 = ((Field) term8578).get((Object) null);
        Float term8546 = new Float(0.8474802F);
        term8496 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term8496, term8496.getClass(), "id", 1193880199);
        setField(term8496, term8496.getClass(), "firstName", "MLqYREekMl");
        setField(term8496, term8496.getClass(), "middleName", "ytSBIKXogI");
        setField(term8496, term8496.getClass(), "lastName", "nHXjMycHlU");
        setField(term8496, term8496.getClass(), "projectRoleId", enum20);
        setField(term8496, term8496.getClass(), "externalRate", term8546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Object[] args = new Object[1];
        args[0] = enum20;
        callMethod(klass, "setProjectRoleId", argTypes, term8496, args);
    }

};


