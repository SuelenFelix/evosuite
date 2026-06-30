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

public class ProjectOfEmployee_getName_19791876892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57888;

    public ProjectOfEmployee_getName_19791876892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term57903 = new Float(0.96323884F);
        Class<? extends Object> term57928 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term57927 = ((Class) term57928).getDeclaredField((String) "EMPLOYEE");
        ((Field) term57927).setAccessible(true);
        Object enum121 = ((Field) term57927).get((Object) null);
        term57888 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee"));
        setIntField(term57888, term57888.getClass(), "id", -2104981311);
        setField(term57888, term57888.getClass(), "name", "EULDrUNQvw");
        setBooleanField(term57888, term57888.getClass(), "archived", true);
        setField(term57888, term57888.getClass(), "externalRate", term57903);
        setField(term57888, term57888.getClass(), "projectRoleId", enum121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term57888, args);
    }

};


