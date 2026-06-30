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

public class EmployeeInProjectDto_getFirstName_6243659872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4641;

    public EmployeeInProjectDto_getFirstName_6243659872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4724 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term4723 = ((Class) term4724).getDeclaredField((String) "EMPLOYEE");
        ((Field) term4723).setAccessible(true);
        Object enum11 = ((Field) term4723).get((Object) null);
        Float term4691 = new Float(0.8783184F);
        term4641 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term4641, term4641.getClass(), "id", -1007160944);
        setField(term4641, term4641.getClass(), "firstName", "OclPbYPkcH");
        setField(term4641, term4641.getClass(), "middleName", "IoAlmYsBwc");
        setField(term4641, term4641.getClass(), "lastName", "TEParAifyi");
        setField(term4641, term4641.getClass(), "projectRoleId", enum11);
        setField(term4641, term4641.getClass(), "externalRate", term4691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term4641, args);
    }

};


