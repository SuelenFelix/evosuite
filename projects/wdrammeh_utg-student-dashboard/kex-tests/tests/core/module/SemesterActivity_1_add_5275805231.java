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

public class SemesterActivity_1_add_5275805231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320288;

    public SemesterActivity_1_add_5275805231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320288 = newInstance(Class.forName("core.module.SemesterActivity$1"));
        setField(term320288, term320288.getClass(), "elementData", null);
        setIntField(term320288, term320288.getClass(), "size", 0);
        setIntField(term320288, term320288.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.RegisteredCourse");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term320288, args);
    }

};


