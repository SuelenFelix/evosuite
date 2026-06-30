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

public class Course_getGrade_5243095133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28438;

    public Course_getGrade_5243095133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28438 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term28438, term28438.getClass(), "score", 0.2641345529914265);
        setField(term28438, term28438.getClass(), "code", "bWWfajKbEX");
        setField(term28438, term28438.getClass(), "name", "cAPeiZHKGJ");
        setField(term28438, term28438.getClass(), "year", "LvJFtLBaxj");
        setField(term28438, term28438.getClass(), "semester", "PHvxnGHptP");
        setField(term28438, term28438.getClass(), "lecturer", "TimdotUuNC");
        setBooleanField(term28438, term28438.getClass(), "isLecturerEditable", false);
        setField(term28438, term28438.getClass(), "campus", "PkWMRdJcBb");
        setField(term28438, term28438.getClass(), "room", "jSpAteRute");
        setField(term28438, term28438.getClass(), "day", "swZVeJAxjt");
        setField(term28438, term28438.getClass(), "time", "xOcJIiQQDu");
        setField(term28438, term28438.getClass(), "requirement", "GVizqqzXpy");
        setIntField(term28438, term28438.getClass(), "creditHours", -341152642);
        setBooleanField(term28438, term28438.getClass(), "isConfirmed", true);
        setField(term28438, term28438.getClass(), "status", "JqXGgAhZPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGrade", argTypes, term28438, args);
    }

};


