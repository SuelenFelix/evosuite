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

public class EmployeeInProjectDto_getLastName_3552547314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5483;

    public EmployeeInProjectDto_getLastName_3552547314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5566 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term5565 = ((Class) term5566).getDeclaredField((String) "EMPLOYEE");
        ((Field) term5565).setAccessible(true);
        Object enum13 = ((Field) term5565).get((Object) null);
        Float term5533 = new Float(0.7944024F);
        term5483 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term5483, term5483.getClass(), "id", 590364439);
        setField(term5483, term5483.getClass(), "firstName", "SbAoxhfrkn");
        setField(term5483, term5483.getClass(), "middleName", "kuTXqwMtDB");
        setField(term5483, term5483.getClass(), "lastName", "Ghbwtircqb");
        setField(term5483, term5483.getClass(), "projectRoleId", enum13);
        setField(term5483, term5483.getClass(), "externalRate", term5533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term5483, args);
    }

};


