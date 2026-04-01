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
     Object term310367;

    public RegisteredCourse_create_17305859448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310367 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term310367, term310367.getClass(), "code", null);
        setField(term310367, term310367.getClass(), "name", null);
        setField(term310367, term310367.getClass(), "year", null);
        setField(term310367, term310367.getClass(), "semester", null);
        setField(term310367, term310367.getClass(), "lecturer", null);
        setBooleanField(term310367, term310367.getClass(), "isLecturerEditable", false);
        setField(term310367, term310367.getClass(), "campus", null);
        setField(term310367, term310367.getClass(), "room", null);
        setField(term310367, term310367.getClass(), "day", null);
        setField(term310367, term310367.getClass(), "time", null);
        setField(term310367, term310367.getClass(), "requirement", null);
        setIntField(term310367, term310367.getClass(), "creditHours", 0);
        setBooleanField(term310367, term310367.getClass(), "isConfirmed", false);
        setField(term310367, term310367.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "create", argTypes, term310367, args);
    }

};


