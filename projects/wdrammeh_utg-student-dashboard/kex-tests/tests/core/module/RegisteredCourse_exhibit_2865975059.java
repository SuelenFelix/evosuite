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

public class RegisteredCourse_exhibit_2865975059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92153;

    public RegisteredCourse_exhibit_2865975059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92153 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term92153, term92153.getClass(), "code", null);
        setField(term92153, term92153.getClass(), "name", null);
        setField(term92153, term92153.getClass(), "year", null);
        setField(term92153, term92153.getClass(), "semester", null);
        setField(term92153, term92153.getClass(), "lecturer", null);
        setBooleanField(term92153, term92153.getClass(), "isLecturerEditable", false);
        setField(term92153, term92153.getClass(), "campus", null);
        setField(term92153, term92153.getClass(), "room", null);
        setField(term92153, term92153.getClass(), "day", null);
        setField(term92153, term92153.getClass(), "time", null);
        setField(term92153, term92153.getClass(), "requirement", null);
        setIntField(term92153, term92153.getClass(), "creditHours", 0);
        setBooleanField(term92153, term92153.getClass(), "isConfirmed", false);
        setField(term92153, term92153.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "exhibit", argTypes, term92153, args);
    }

};


