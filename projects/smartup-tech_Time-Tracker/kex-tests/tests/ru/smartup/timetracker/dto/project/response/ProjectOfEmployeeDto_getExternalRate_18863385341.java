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

public class ProjectOfEmployeeDto_getExternalRate_18863385341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ProjectOfEmployeeDto_getExternalRate_18863385341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term2 = new Float(0.13238746F);
        Class<? extends Object> term53 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term52 = ((Class) term53).getDeclaredField((String) "MANAGER");
        ((Field) term52).setAccessible(true);
        Object enum0 = ((Field) term52).get((Object) null);
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto"));
        setField(term1, term1.getClass(), "externalRate", term2);
        setField(term1, term1.getClass(), "projectRoleId", enum0);
        setIntField(term1, term1.getClass(), "id", 568599855);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "isArchived", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalRate", argTypes, term1, args);
    }

};


