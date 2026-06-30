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

public class EmployeeInProjectDto_hashCode_44930014815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10192;

    public EmployeeInProjectDto_hashCode_44930014815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10274 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term10273 = ((Class) term10274).getDeclaredField((String) "MANAGER");
        ((Field) term10273).setAccessible(true);
        Object enum24 = ((Field) term10273).get((Object) null);
        Float term10241 = new Float(0.26441735F);
        term10192 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term10192, term10192.getClass(), "id", -1145578966);
        setField(term10192, term10192.getClass(), "firstName", "bLPjGVBhlX");
        setField(term10192, term10192.getClass(), "middleName", "whBvTVIIlC");
        setField(term10192, term10192.getClass(), "lastName", "IgRJUzaCwW");
        setField(term10192, term10192.getClass(), "projectRoleId", enum24);
        setField(term10192, term10192.getClass(), "externalRate", term10241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10192, args);
    }

};


