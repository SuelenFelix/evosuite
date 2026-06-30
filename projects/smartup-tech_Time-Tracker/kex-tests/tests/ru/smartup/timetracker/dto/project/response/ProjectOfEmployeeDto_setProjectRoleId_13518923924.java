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

public class ProjectOfEmployeeDto_setProjectRoleId_13518923924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1154;
     Object enum4;

    public ProjectOfEmployeeDto_setProjectRoleId_13518923924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term1155 = new Float(0.5523636F);
        Class<? extends Object> term1195 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1194 = ((Class) term1195).getDeclaredField((String) "MANAGER");
        ((Field) term1194).setAccessible(true);
        Object enum3 = ((Field) term1194).get((Object) null);
        term1154 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto"));
        setField(term1154, term1154.getClass(), "externalRate", term1155);
        setField(term1154, term1154.getClass(), "projectRoleId", enum3);
        setIntField(term1154, term1154.getClass(), "id", 391863371);
        setField(term1154, term1154.getClass(), "name", "xxtlPwDYFs");
        setBooleanField(term1154, term1154.getClass(), "isArchived", false);
        Class<? extends Object> term1543 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1542 = ((Class) term1543).getDeclaredField((String) "EMPLOYEE");
        ((Field) term1542).setAccessible(true);
        enum4 = ((Field) term1542).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Object[] args = new Object[1];
        args[0] = enum4;
        callMethod(klass, "setProjectRoleId", argTypes, term1154, args);
    }

};


