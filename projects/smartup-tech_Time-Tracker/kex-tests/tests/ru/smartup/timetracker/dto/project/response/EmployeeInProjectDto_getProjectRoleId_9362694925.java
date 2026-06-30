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

public class EmployeeInProjectDto_getProjectRoleId_9362694925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5906;

    public EmployeeInProjectDto_getProjectRoleId_9362694925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5988 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term5987 = ((Class) term5988).getDeclaredField((String) "MANAGER");
        ((Field) term5987).setAccessible(true);
        Object enum14 = ((Field) term5987).get((Object) null);
        Float term5955 = new Float(0.3692338F);
        term5906 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term5906, term5906.getClass(), "id", 865208305);
        setField(term5906, term5906.getClass(), "firstName", "xrwlQZdwCp");
        setField(term5906, term5906.getClass(), "middleName", "IDCWpPLRkE");
        setField(term5906, term5906.getClass(), "lastName", "nyiiPDVjAc");
        setField(term5906, term5906.getClass(), "projectRoleId", enum14);
        setField(term5906, term5906.getClass(), "externalRate", term5955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectRoleId", argTypes, term5906, args);
    }

};


