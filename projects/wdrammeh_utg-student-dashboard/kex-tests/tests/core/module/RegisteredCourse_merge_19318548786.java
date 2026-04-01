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

public class RegisteredCourse_merge_19318548786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310359;

    public RegisteredCourse_merge_19318548786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310359 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term310359, term310359.getClass(), "code", null);
        setField(term310359, term310359.getClass(), "name", null);
        setField(term310359, term310359.getClass(), "year", null);
        setField(term310359, term310359.getClass(), "semester", null);
        setField(term310359, term310359.getClass(), "lecturer", null);
        setBooleanField(term310359, term310359.getClass(), "isLecturerEditable", false);
        setField(term310359, term310359.getClass(), "campus", null);
        setField(term310359, term310359.getClass(), "room", null);
        setField(term310359, term310359.getClass(), "day", null);
        setField(term310359, term310359.getClass(), "time", null);
        setField(term310359, term310359.getClass(), "requirement", null);
        setIntField(term310359, term310359.getClass(), "creditHours", 0);
        setBooleanField(term310359, term310359.getClass(), "isConfirmed", false);
        setField(term310359, term310359.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Module");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "merge", argTypes, term310359, args);
    }

};


