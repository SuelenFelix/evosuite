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

public class ProjectOfEmployee_getProjectRoleId_15029908411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59420;

    public ProjectOfEmployee_getProjectRoleId_15029908411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59420 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee"));
        setIntField(term59420, term59420.getClass(), "id", 0);
        setField(term59420, term59420.getClass(), "name", null);
        setBooleanField(term59420, term59420.getClass(), "archived", false);
        setField(term59420, term59420.getClass(), "externalRate", null);
        setField(term59420, term59420.getClass(), "projectRoleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectRoleId", argTypes, term59420, args);
    }

};


