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

public class EmployeeInProjectDto_getExternalRate_14447983706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6325;

    public EmployeeInProjectDto_getExternalRate_14447983706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6407 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term6406 = ((Class) term6407).getDeclaredField((String) "MANAGER");
        ((Field) term6406).setAccessible(true);
        Object enum15 = ((Field) term6406).get((Object) null);
        Float term6374 = new Float(0.13906479F);
        term6325 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term6325, term6325.getClass(), "id", -1275173084);
        setField(term6325, term6325.getClass(), "firstName", "aKnKipADSo");
        setField(term6325, term6325.getClass(), "middleName", "wSQxaModmm");
        setField(term6325, term6325.getClass(), "lastName", "UlajhuVLaP");
        setField(term6325, term6325.getClass(), "projectRoleId", enum15);
        setField(term6325, term6325.getClass(), "externalRate", term6374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalRate", argTypes, term6325, args);
    }

};


