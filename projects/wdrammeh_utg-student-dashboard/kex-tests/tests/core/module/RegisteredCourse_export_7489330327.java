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

public class RegisteredCourse_export_7489330327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92145;

    public RegisteredCourse_export_7489330327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92145 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term92145, term92145.getClass(), "code", null);
        setField(term92145, term92145.getClass(), "name", null);
        setField(term92145, term92145.getClass(), "year", null);
        setField(term92145, term92145.getClass(), "semester", null);
        setField(term92145, term92145.getClass(), "lecturer", null);
        setBooleanField(term92145, term92145.getClass(), "isLecturerEditable", false);
        setField(term92145, term92145.getClass(), "campus", null);
        setField(term92145, term92145.getClass(), "room", null);
        setField(term92145, term92145.getClass(), "day", null);
        setField(term92145, term92145.getClass(), "time", null);
        setField(term92145, term92145.getClass(), "requirement", null);
        setIntField(term92145, term92145.getClass(), "creditHours", 0);
        setBooleanField(term92145, term92145.getClass(), "isConfirmed", false);
        setField(term92145, term92145.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term92145, args);
    }

};


