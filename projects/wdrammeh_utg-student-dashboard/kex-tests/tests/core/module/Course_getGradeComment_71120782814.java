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

public class Course_getGradeComment_71120782814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29965;

    public Course_getGradeComment_71120782814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29965 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29965, term29965.getClass(), "score", 0.0);
        setField(term29965, term29965.getClass(), "code", null);
        setField(term29965, term29965.getClass(), "name", null);
        setField(term29965, term29965.getClass(), "year", null);
        setField(term29965, term29965.getClass(), "semester", null);
        setField(term29965, term29965.getClass(), "lecturer", null);
        setBooleanField(term29965, term29965.getClass(), "isLecturerEditable", false);
        setField(term29965, term29965.getClass(), "campus", null);
        setField(term29965, term29965.getClass(), "room", null);
        setField(term29965, term29965.getClass(), "day", null);
        setField(term29965, term29965.getClass(), "time", null);
        setField(term29965, term29965.getClass(), "requirement", null);
        setIntField(term29965, term29965.getClass(), "creditHours", 0);
        setBooleanField(term29965, term29965.getClass(), "isConfirmed", false);
        setField(term29965, term29965.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeComment", argTypes, term29965, args);
    }

};


