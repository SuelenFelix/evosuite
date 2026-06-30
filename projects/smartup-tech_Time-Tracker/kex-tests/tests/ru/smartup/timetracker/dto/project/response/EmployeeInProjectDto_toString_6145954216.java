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

public class EmployeeInProjectDto_toString_6145954216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10611;

    public EmployeeInProjectDto_toString_6145954216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10693 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term10692 = ((Class) term10693).getDeclaredField((String) "MANAGER");
        ((Field) term10692).setAccessible(true);
        Object enum25 = ((Field) term10692).get((Object) null);
        Float term10660 = new Float(0.13745493F);
        term10611 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term10611, term10611.getClass(), "id", 679763016);
        setField(term10611, term10611.getClass(), "firstName", "JUmudUmaaV");
        setField(term10611, term10611.getClass(), "middleName", "KoyGrUJeJW");
        setField(term10611, term10611.getClass(), "lastName", "HqBOwkVqjD");
        setField(term10611, term10611.getClass(), "projectRoleId", enum25);
        setField(term10611, term10611.getClass(), "externalRate", term10660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10611, args);
    }

};


