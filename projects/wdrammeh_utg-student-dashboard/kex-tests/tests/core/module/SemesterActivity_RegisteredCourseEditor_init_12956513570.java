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

public class SemesterActivity_RegisteredCourseEditor_init_12956513570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56592;

    public SemesterActivity_RegisteredCourseEditor_init_12956513570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56592 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term56592, term56592.getClass(), "code", "yevIIoVYHq");
        setField(term56592, term56592.getClass(), "name", "UuYWMTqWTV");
        setField(term56592, term56592.getClass(), "year", "DSFGlcaXUb");
        setField(term56592, term56592.getClass(), "semester", "sHMXNUzNeM");
        setField(term56592, term56592.getClass(), "lecturer", "gPzGDOEPPw");
        setBooleanField(term56592, term56592.getClass(), "isLecturerEditable", true);
        setField(term56592, term56592.getClass(), "campus", "rwKoAngzCu");
        setField(term56592, term56592.getClass(), "room", "VUkRVwROTl");
        setField(term56592, term56592.getClass(), "day", "UDlkdccCRn");
        setField(term56592, term56592.getClass(), "time", "McpzErOcYb");
        setField(term56592, term56592.getClass(), "requirement", "jqrVEUvYEz");
        setIntField(term56592, term56592.getClass(), "creditHours", -1332748804);
        setBooleanField(term56592, term56592.getClass(), "isConfirmed", false);
        setField(term56592, term56592.getClass(), "status", "QITgiBrmfj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$RegisteredCourseEditor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.RegisteredCourse");
        Object[] args = new Object[1];
        args[0] = term56592;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


