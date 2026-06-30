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

public class EmployeeInProjectDto_getMiddleName_5398926203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5064;

    public EmployeeInProjectDto_getMiddleName_5398926203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5146 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term5145 = ((Class) term5146).getDeclaredField((String) "MANAGER");
        ((Field) term5145).setAccessible(true);
        Object enum12 = ((Field) term5145).get((Object) null);
        Float term5113 = new Float(0.26413453F);
        term5064 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term5064, term5064.getClass(), "id", 1135664017);
        setField(term5064, term5064.getClass(), "firstName", "OWDIEULEFu");
        setField(term5064, term5064.getClass(), "middleName", "dWRymuLBtr");
        setField(term5064, term5064.getClass(), "lastName", "AijpHYOFuy");
        setField(term5064, term5064.getClass(), "projectRoleId", enum12);
        setField(term5064, term5064.getClass(), "externalRate", term5113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiddleName", argTypes, term5064, args);
    }

};


