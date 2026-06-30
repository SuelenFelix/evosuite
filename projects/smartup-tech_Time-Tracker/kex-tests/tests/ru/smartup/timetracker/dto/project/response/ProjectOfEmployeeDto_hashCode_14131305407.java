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

public class ProjectOfEmployeeDto_hashCode_14131305407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2645;

    public ProjectOfEmployeeDto_hashCode_14131305407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term2646 = new Float(0.5254275F);
        Class<? extends Object> term2675 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term2674 = ((Class) term2675).getDeclaredField((String) "EMPLOYEE");
        ((Field) term2674).setAccessible(true);
        Object enum7 = ((Field) term2674).get((Object) null);
        term2645 = newInstance(Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto"));
        setField(term2645, term2645.getClass(), "externalRate", term2646);
        setField(term2645, term2645.getClass(), "projectRoleId", enum7);
        setIntField(term2645, term2645.getClass(), "id", -1955890973);
        setField(term2645, term2645.getClass(), "name", "SzjVpOQTyS");
        setBooleanField(term2645, term2645.getClass(), "isArchived", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.project.response.ProjectOfEmployeeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2645, args);
    }

};


