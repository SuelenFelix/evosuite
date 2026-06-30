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

public class ProjectOfEmployee_getExternalRate_6588279624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58648;

    public ProjectOfEmployee_getExternalRate_6588279624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term58663 = new Float(0.80973893F);
        Class<? extends Object> term58687 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term58686 = ((Class) term58687).getDeclaredField((String) "MANAGER");
        ((Field) term58686).setAccessible(true);
        Object enum123 = ((Field) term58686).get((Object) null);
        term58648 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee"));
        setIntField(term58648, term58648.getClass(), "id", 318591690);
        setField(term58648, term58648.getClass(), "name", "vqnBkkxoIa");
        setBooleanField(term58648, term58648.getClass(), "archived", true);
        setField(term58648, term58648.getClass(), "externalRate", term58663);
        setField(term58648, term58648.getClass(), "projectRoleId", enum123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalRate", argTypes, term58648, args);
    }

};


