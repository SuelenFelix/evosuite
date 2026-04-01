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
     Object term310363;

    public RegisteredCourse_export_7489330327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310363 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term310363, term310363.getClass(), "code", null);
        setField(term310363, term310363.getClass(), "name", null);
        setField(term310363, term310363.getClass(), "year", null);
        setField(term310363, term310363.getClass(), "semester", null);
        setField(term310363, term310363.getClass(), "lecturer", null);
        setBooleanField(term310363, term310363.getClass(), "isLecturerEditable", false);
        setField(term310363, term310363.getClass(), "campus", null);
        setField(term310363, term310363.getClass(), "room", null);
        setField(term310363, term310363.getClass(), "day", null);
        setField(term310363, term310363.getClass(), "time", null);
        setField(term310363, term310363.getClass(), "requirement", null);
        setIntField(term310363, term310363.getClass(), "creditHours", 0);
        setBooleanField(term310363, term310363.getClass(), "isConfirmed", false);
        setField(term310363, term310363.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term310363, args);
    }

};


