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

public class ProjectOfEmployee_isArchived_15274814693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58268;

    public ProjectOfEmployee_isArchived_15274814693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Float term58283 = new Float(0.43692183F);
        Class<? extends Object> term58308 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term58307 = ((Class) term58308).getDeclaredField((String) "EMPLOYEE");
        ((Field) term58307).setAccessible(true);
        Object enum122 = ((Field) term58307).get((Object) null);
        term58268 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee"));
        setIntField(term58268, term58268.getClass(), "id", -571169753);
        setField(term58268, term58268.getClass(), "name", "BtvAvsJSei");
        setBooleanField(term58268, term58268.getClass(), "archived", true);
        setField(term58268, term58268.getClass(), "externalRate", term58283);
        setField(term58268, term58268.getClass(), "projectRoleId", enum122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchived", argTypes, term58268, args);
    }

};


