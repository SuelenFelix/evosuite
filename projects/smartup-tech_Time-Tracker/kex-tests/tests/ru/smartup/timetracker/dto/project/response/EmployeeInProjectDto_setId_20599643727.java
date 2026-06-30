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
import java.lang.Integer;

public class EmployeeInProjectDto_setId_20599643727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6744;
     Object term6796;

    public EmployeeInProjectDto_setId_20599643727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6829 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term6828 = ((Class) term6829).getDeclaredField((String) "EMPLOYEE");
        ((Field) term6828).setAccessible(true);
        Object enum16 = ((Field) term6828).get((Object) null);
        Float term6794 = new Float(0.6076495F);
        term6744 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term6744, term6744.getClass(), "id", -244121226);
        setField(term6744, term6744.getClass(), "firstName", "gGSMzuGICf");
        setField(term6744, term6744.getClass(), "middleName", "hxCBltsObl");
        setField(term6744, term6744.getClass(), "lastName", "BndsHwAFMv");
        setField(term6744, term6744.getClass(), "projectRoleId", enum16);
        setField(term6744, term6744.getClass(), "externalRate", term6794);
        term6796 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6796;
        callMethod(klass, "setId", argTypes, term6744, args);
    }

};


