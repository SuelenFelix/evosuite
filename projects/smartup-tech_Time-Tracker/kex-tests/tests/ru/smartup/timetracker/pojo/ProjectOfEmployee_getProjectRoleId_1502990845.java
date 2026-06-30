package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;
import java.lang.String;
import java.lang.Object;

public class ProjectOfEmployee_getProjectRoleId_1502990845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59024;

    public ProjectOfEmployee_getProjectRoleId_1502990845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term59039 = new Float(0.7633268F);
        Class<? extends Object> term59064 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term59063 = ((Class) term59064).getDeclaredField((String) "EMPLOYEE");
        ((Field) term59063).setAccessible(true);
        Object enum124 = ((Field) term59063).get((Object) null);
        term59024 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee"));
        setIntField(term59024, term59024.getClass(), "id", -165587447);
        setField(term59024, term59024.getClass(), "name", "bycpZjxXFn");
        setBooleanField(term59024, term59024.getClass(), "archived", true);
        setField(term59024, term59024.getClass(), "externalRate", term59039);
        setField(term59024, term59024.getClass(), "projectRoleId", enum124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectRoleId", argTypes, term59024, args);
    }

};


