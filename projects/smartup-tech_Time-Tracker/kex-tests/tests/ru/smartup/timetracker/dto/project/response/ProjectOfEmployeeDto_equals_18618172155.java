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
import java.lang.Float;
import java.lang.String;
import java.lang.Object;

public class ProjectOfEmployeeDto_equals_18618172155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1883;
     Object term1912;

    public ProjectOfEmployeeDto_equals_18618172155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term1884 = new Float(0.8564069F);
        Class<? extends Object> term1914 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1913 = ((Class) term1914).getDeclaredField((String) "EMPLOYEE");
        ((Field) term1913).setAccessible(true);
        Object enum5 = ((Field) term1913).get((Object) null);
        term1883 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto"));
        setField(term1883, term1883.getClass(), "externalRate", term1884);
        setField(term1883, term1883.getClass(), "projectRoleId", enum5);
        setIntField(term1883, term1883.getClass(), "id", -1922583790);
        setField(term1883, term1883.getClass(), "name", "jJCZpVmanW");
        setBooleanField(term1883, term1883.getClass(), "isArchived", true);
        term1912 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1912;
        callMethod(klass, "equals", argTypes, term1883, args);
    }

};


