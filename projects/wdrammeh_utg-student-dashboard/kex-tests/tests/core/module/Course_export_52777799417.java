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

public class Course_export_52777799417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29980;

    public Course_export_52777799417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29980 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29980, term29980.getClass(), "score", 0.0);
        setField(term29980, term29980.getClass(), "code", null);
        setField(term29980, term29980.getClass(), "name", null);
        setField(term29980, term29980.getClass(), "year", null);
        setField(term29980, term29980.getClass(), "semester", null);
        setField(term29980, term29980.getClass(), "lecturer", null);
        setBooleanField(term29980, term29980.getClass(), "isLecturerEditable", false);
        setField(term29980, term29980.getClass(), "campus", null);
        setField(term29980, term29980.getClass(), "room", null);
        setField(term29980, term29980.getClass(), "day", null);
        setField(term29980, term29980.getClass(), "time", null);
        setField(term29980, term29980.getClass(), "requirement", null);
        setIntField(term29980, term29980.getClass(), "creditHours", 0);
        setBooleanField(term29980, term29980.getClass(), "isConfirmed", false);
        setField(term29980, term29980.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term29980, args);
    }

};


