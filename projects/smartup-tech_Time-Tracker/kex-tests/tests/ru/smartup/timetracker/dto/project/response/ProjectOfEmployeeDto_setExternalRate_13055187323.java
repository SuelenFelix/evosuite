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

public class ProjectOfEmployeeDto_setExternalRate_13055187323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776;
     Object term804;

    public ProjectOfEmployeeDto_setExternalRate_13055187323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term777 = new Float(0.3455959F);
        Class<? extends Object> term807 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term806 = ((Class) term807).getDeclaredField((String) "MANAGER");
        ((Field) term806).setAccessible(true);
        Object enum2 = ((Field) term806).get((Object) null);
        term776 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto"));
        setField(term776, term776.getClass(), "externalRate", term777);
        setField(term776, term776.getClass(), "projectRoleId", enum2);
        setIntField(term776, term776.getClass(), "id", 1484323161);
        setField(term776, term776.getClass(), "name", "MuLcgQHgqz");
        setBooleanField(term776, term776.getClass(), "isArchived", false);
        term804 = new Float(0.09123778F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Float");
        Object[] args = new Object[1];
        args[0] = term804;
        callMethod(klass, "setExternalRate", argTypes, term776, args);
    }

};


