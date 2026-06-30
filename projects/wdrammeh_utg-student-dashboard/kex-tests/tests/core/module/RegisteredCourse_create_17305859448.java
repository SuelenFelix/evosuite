package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RegisteredCourse_create_17305859448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92149;

    public RegisteredCourse_create_17305859448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92149 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term92149, term92149.getClass(), "code", null);
        setField(term92149, term92149.getClass(), "name", null);
        setField(term92149, term92149.getClass(), "year", null);
        setField(term92149, term92149.getClass(), "semester", null);
        setField(term92149, term92149.getClass(), "lecturer", null);
        setBooleanField(term92149, term92149.getClass(), "isLecturerEditable", false);
        setField(term92149, term92149.getClass(), "campus", null);
        setField(term92149, term92149.getClass(), "room", null);
        setField(term92149, term92149.getClass(), "day", null);
        setField(term92149, term92149.getClass(), "time", null);
        setField(term92149, term92149.getClass(), "requirement", null);
        setIntField(term92149, term92149.getClass(), "creditHours", 0);
        setBooleanField(term92149, term92149.getClass(), "isConfirmed", false);
        setField(term92149, term92149.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "create", argTypes, term92149, args);
    }

};


