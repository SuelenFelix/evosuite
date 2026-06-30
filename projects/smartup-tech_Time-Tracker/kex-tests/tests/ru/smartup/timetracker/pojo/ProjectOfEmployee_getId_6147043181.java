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

public class ProjectOfEmployee_getId_6147043181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57512;

    public ProjectOfEmployee_getId_6147043181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term57527 = new Float(0.8598297F);
        Class<? extends Object> term57551 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term57550 = ((Class) term57551).getDeclaredField((String) "MANAGER");
        ((Field) term57550).setAccessible(true);
        Object enum120 = ((Field) term57550).get((Object) null);
        term57512 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee"));
        setIntField(term57512, term57512.getClass(), "id", -1310015129);
        setField(term57512, term57512.getClass(), "name", "ZUdnQXfzCI");
        setBooleanField(term57512, term57512.getClass(), "archived", false);
        setField(term57512, term57512.getClass(), "externalRate", term57527);
        setField(term57512, term57512.getClass(), "projectRoleId", enum120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term57512, args);
    }

};


