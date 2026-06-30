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

public class Course_getGradeComment_7112078284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28685;

    public Course_getGradeComment_7112078284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28685 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term28685, term28685.getClass(), "score", 0.36923381893433327);
        setField(term28685, term28685.getClass(), "code", "jiKYgYHqIS");
        setField(term28685, term28685.getClass(), "name", "DfISiziTgG");
        setField(term28685, term28685.getClass(), "year", "XqgfKFvPSD");
        setField(term28685, term28685.getClass(), "semester", "JiVRgTZvKc");
        setField(term28685, term28685.getClass(), "lecturer", "XPKmummaqg");
        setBooleanField(term28685, term28685.getClass(), "isLecturerEditable", false);
        setField(term28685, term28685.getClass(), "campus", "BKLfkLiZTH");
        setField(term28685, term28685.getClass(), "room", "SPpkrGcPRr");
        setField(term28685, term28685.getClass(), "day", "sEccwbJKYE");
        setField(term28685, term28685.getClass(), "time", "AWRooQKkdW");
        setField(term28685, term28685.getClass(), "requirement", "vjxIhXHxGR");
        setIntField(term28685, term28685.getClass(), "creditHours", -2015854073);
        setBooleanField(term28685, term28685.getClass(), "isConfirmed", true);
        setField(term28685, term28685.getClass(), "status", "QXzGXbEXMu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeComment", argTypes, term28685, args);
    }

};


