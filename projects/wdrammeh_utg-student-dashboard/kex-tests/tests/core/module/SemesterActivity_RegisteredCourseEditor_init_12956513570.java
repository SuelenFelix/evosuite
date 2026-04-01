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
     Object term171683;

    public SemesterActivity_RegisteredCourseEditor_init_12956513570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171683 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term171683, term171683.getClass(), "code", "SPQVzOlOzZ");
        setField(term171683, term171683.getClass(), "name", "bOUAgAptAI");
        setField(term171683, term171683.getClass(), "year", "KSZfGbvzPE");
        setField(term171683, term171683.getClass(), "semester", "YfgYGgzYER");
        setField(term171683, term171683.getClass(), "lecturer", "IDClvDZuqE");
        setBooleanField(term171683, term171683.getClass(), "isLecturerEditable", false);
        setField(term171683, term171683.getClass(), "campus", "cMvKxpZOvg");
        setField(term171683, term171683.getClass(), "room", "WWBYemIuiK");
        setField(term171683, term171683.getClass(), "day", "nHYQYkycCR");
        setField(term171683, term171683.getClass(), "time", "yBiVacDcZX");
        setField(term171683, term171683.getClass(), "requirement", "QrKfEgQeoy");
        setIntField(term171683, term171683.getClass(), "creditHours", 703799187);
        setBooleanField(term171683, term171683.getClass(), "isConfirmed", true);
        setField(term171683, term171683.getClass(), "status", "oApgdbwnti");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$RegisteredCourseEditor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.RegisteredCourse");
        Object[] args = new Object[1];
        args[0] = term171683;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


