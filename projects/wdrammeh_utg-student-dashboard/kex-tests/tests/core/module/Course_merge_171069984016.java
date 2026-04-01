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

public class Course_merge_171069984016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29975;

    public Course_merge_171069984016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29975 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29975, term29975.getClass(), "score", 0.0);
        setField(term29975, term29975.getClass(), "code", null);
        setField(term29975, term29975.getClass(), "name", null);
        setField(term29975, term29975.getClass(), "year", null);
        setField(term29975, term29975.getClass(), "semester", null);
        setField(term29975, term29975.getClass(), "lecturer", null);
        setBooleanField(term29975, term29975.getClass(), "isLecturerEditable", false);
        setField(term29975, term29975.getClass(), "campus", null);
        setField(term29975, term29975.getClass(), "room", null);
        setField(term29975, term29975.getClass(), "day", null);
        setField(term29975, term29975.getClass(), "time", null);
        setField(term29975, term29975.getClass(), "requirement", null);
        setIntField(term29975, term29975.getClass(), "creditHours", 0);
        setBooleanField(term29975, term29975.getClass(), "isConfirmed", false);
        setField(term29975, term29975.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Module");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "merge", argTypes, term29975, args);
    }

};


