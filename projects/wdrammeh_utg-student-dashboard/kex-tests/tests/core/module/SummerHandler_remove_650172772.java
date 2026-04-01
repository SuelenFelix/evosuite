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

public class SummerHandler_remove_650172772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36526;

    public SummerHandler_remove_650172772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36526 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term36526, term36526.getClass(), "score", 0.1374549299694151);
        setField(term36526, term36526.getClass(), "code", "ekxGuOYIwi");
        setField(term36526, term36526.getClass(), "name", "RbVQXSpxXy");
        setField(term36526, term36526.getClass(), "year", "YpJbIgJWWv");
        setField(term36526, term36526.getClass(), "semester", "JppkknKVOw");
        setField(term36526, term36526.getClass(), "lecturer", "iljANwuEjk");
        setBooleanField(term36526, term36526.getClass(), "isLecturerEditable", false);
        setField(term36526, term36526.getClass(), "campus", "kNqaJKIATy");
        setField(term36526, term36526.getClass(), "room", "vKQukfbJUd");
        setField(term36526, term36526.getClass(), "day", "lFRJFUMVbx");
        setField(term36526, term36526.getClass(), "time", "sZdUNdggUW");
        setField(term36526, term36526.getClass(), "requirement", "OqbwYQfvAe");
        setIntField(term36526, term36526.getClass(), "creditHours", 729658803);
        setBooleanField(term36526, term36526.getClass(), "isConfirmed", true);
        setField(term36526, term36526.getClass(), "status", "tRxZafjqIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term36526;
        callMethod(klass, "remove", argTypes, null, args);
    }

};


