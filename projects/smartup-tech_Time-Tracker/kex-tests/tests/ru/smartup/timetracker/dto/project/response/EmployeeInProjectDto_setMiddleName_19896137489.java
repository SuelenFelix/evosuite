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

public class EmployeeInProjectDto_setMiddleName_19896137489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7614;

    public EmployeeInProjectDto_setMiddleName_19896137489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7708 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term7707 = ((Class) term7708).getDeclaredField((String) "MANAGER");
        ((Field) term7707).setAccessible(true);
        Object enum18 = ((Field) term7707).get((Object) null);
        Float term7663 = new Float(0.37773192F);
        term7614 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term7614, term7614.getClass(), "id", -73683645);
        setField(term7614, term7614.getClass(), "firstName", "jDtqGUpnZN");
        setField(term7614, term7614.getClass(), "middleName", "nGKItKLYNC");
        setField(term7614, term7614.getClass(), "lastName", "UiUYnPrcCi");
        setField(term7614, term7614.getClass(), "projectRoleId", enum18);
        setField(term7614, term7614.getClass(), "externalRate", term7663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setMiddleName", argTypes, term7614, args);
    }

};


