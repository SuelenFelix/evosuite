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

public class RegisteredCourse_exhibit_2865975054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310111;

    public RegisteredCourse_exhibit_2865975054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310111 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term310111, term310111.getClass(), "code", "vZpMxQNHKu");
        setField(term310111, term310111.getClass(), "name", "QLMSDWYwBC");
        setField(term310111, term310111.getClass(), "year", "feyxNWUenU");
        setField(term310111, term310111.getClass(), "semester", "qvqwmSUIiP");
        setField(term310111, term310111.getClass(), "lecturer", "eNOEXYoAtV");
        setBooleanField(term310111, term310111.getClass(), "isLecturerEditable", false);
        setField(term310111, term310111.getClass(), "campus", "SNqwfZGLFh");
        setField(term310111, term310111.getClass(), "room", "sMqpXbgEga");
        setField(term310111, term310111.getClass(), "day", "nYJlDpoMcL");
        setField(term310111, term310111.getClass(), "time", "SQnbnBmbcf");
        setField(term310111, term310111.getClass(), "requirement", "jaNVteZrZi");
        setIntField(term310111, term310111.getClass(), "creditHours", 1092325030);
        setBooleanField(term310111, term310111.getClass(), "isConfirmed", false);
        setField(term310111, term310111.getClass(), "status", "bMRkDiPUGu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "exhibit", argTypes, term310111, args);
    }

};


