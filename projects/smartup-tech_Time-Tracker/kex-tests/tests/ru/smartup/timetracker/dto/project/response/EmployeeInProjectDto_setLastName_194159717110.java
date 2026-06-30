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

public class EmployeeInProjectDto_setLastName_194159717110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8055;

    public EmployeeInProjectDto_setLastName_194159717110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8149 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term8148 = ((Class) term8149).getDeclaredField((String) "MANAGER");
        ((Field) term8148).setAccessible(true);
        Object enum19 = ((Field) term8148).get((Object) null);
        Float term8104 = new Float(0.24413109F);
        term8055 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term8055, term8055.getClass(), "id", -226514366);
        setField(term8055, term8055.getClass(), "firstName", "JDswTTCZHV");
        setField(term8055, term8055.getClass(), "middleName", "onpbIeEKoi");
        setField(term8055, term8055.getClass(), "lastName", "YRHGsAkhxb");
        setField(term8055, term8055.getClass(), "projectRoleId", enum19);
        setField(term8055, term8055.getClass(), "externalRate", term8104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "setLastName", argTypes, term8055, args);
    }

};


