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

public class EmployeeInProjectDto_canEqual_170214945214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9768;
     Object term9820;

    public EmployeeInProjectDto_canEqual_170214945214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9852 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term9851 = ((Class) term9852).getDeclaredField((String) "EMPLOYEE");
        ((Field) term9851).setAccessible(true);
        Object enum23 = ((Field) term9851).get((Object) null);
        Float term9818 = new Float(0.76550204F);
        term9768 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term9768, term9768.getClass(), "id", -469968304);
        setField(term9768, term9768.getClass(), "firstName", "kBdSllIBVz");
        setField(term9768, term9768.getClass(), "middleName", "TJmVBGfTML");
        setField(term9768, term9768.getClass(), "lastName", "tPlsykYBqO");
        setField(term9768, term9768.getClass(), "projectRoleId", enum23);
        setField(term9768, term9768.getClass(), "externalRate", term9818);
        term9820 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9820;
        callMethod(klass, "canEqual", argTypes, term9768, args);
    }

};


