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

public class EmployeeInProjectDto_setExternalRate_34168834012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8919;
     Object term8971;

    public EmployeeInProjectDto_setExternalRate_34168834012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9004 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term9003 = ((Class) term9004).getDeclaredField((String) "EMPLOYEE");
        ((Field) term9003).setAccessible(true);
        Object enum21 = ((Field) term9003).get((Object) null);
        Float term8969 = new Float(0.9985961F);
        term8919 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term8919, term8919.getClass(), "id", -1087774327);
        setField(term8919, term8919.getClass(), "firstName", "ieCtQFdkii");
        setField(term8919, term8919.getClass(), "middleName", "dEnhdmILtU");
        setField(term8919, term8919.getClass(), "lastName", "hoicvmsovO");
        setField(term8919, term8919.getClass(), "projectRoleId", enum21);
        setField(term8919, term8919.getClass(), "externalRate", term8969);
        term8971 = new Float(0.51832694F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Float");
        Object[] args = new Object[1];
        args[0] = term8971;
        callMethod(klass, "setExternalRate", argTypes, term8919, args);
    }

};


