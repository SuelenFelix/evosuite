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

public class EmployeeInProjectDto_setFirstName_7871234278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7169;

    public EmployeeInProjectDto_setFirstName_7871234278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7264 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term7263 = ((Class) term7264).getDeclaredField((String) "EMPLOYEE");
        ((Field) term7263).setAccessible(true);
        Object enum17 = ((Field) term7263).get((Object) null);
        Float term7219 = new Float(0.6608425F);
        term7169 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term7169, term7169.getClass(), "id", -1179120542);
        setField(term7169, term7169.getClass(), "firstName", "GzFkzHGYFt");
        setField(term7169, term7169.getClass(), "middleName", "tShwQLRGNe");
        setField(term7169, term7169.getClass(), "lastName", "LvtrsXUliU");
        setField(term7169, term7169.getClass(), "projectRoleId", enum17);
        setField(term7169, term7169.getClass(), "externalRate", term7219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "setFirstName", argTypes, term7169, args);
    }

};


