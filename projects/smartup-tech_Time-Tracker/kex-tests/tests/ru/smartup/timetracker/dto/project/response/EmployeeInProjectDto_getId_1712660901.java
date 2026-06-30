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

public class EmployeeInProjectDto_getId_1712660901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4222;

    public EmployeeInProjectDto_getId_1712660901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4304 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term4303 = ((Class) term4304).getDeclaredField((String) "MANAGER");
        ((Field) term4303).setAccessible(true);
        Object enum10 = ((Field) term4303).get((Object) null);
        Float term4271 = new Float(0.40176582F);
        term4222 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto"));
        setIntField(term4222, term4222.getClass(), "id", -117576464);
        setField(term4222, term4222.getClass(), "firstName", "BYqFIqCKAV");
        setField(term4222, term4222.getClass(), "middleName", "vrQLuWIDJX");
        setField(term4222, term4222.getClass(), "lastName", "flxyYxBRtu");
        setField(term4222, term4222.getClass(), "projectRoleId", enum10);
        setField(term4222, term4222.getClass(), "externalRate", term4271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.EmployeeInProjectDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4222, args);
    }

};


