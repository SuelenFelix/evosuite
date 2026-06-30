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

public class ProjectOfEmployee_getExternalRate_65882796210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59417;

    public ProjectOfEmployee_getExternalRate_65882796210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59417 = newInstance(Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee"));
        setIntField(term59417, term59417.getClass(), "id", 0);
        setField(term59417, term59417.getClass(), "name", null);
        setBooleanField(term59417, term59417.getClass(), "archived", false);
        setField(term59417, term59417.getClass(), "externalRate", null);
        setField(term59417, term59417.getClass(), "projectRoleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ProjectOfEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalRate", argTypes, term59417, args);
    }

};


