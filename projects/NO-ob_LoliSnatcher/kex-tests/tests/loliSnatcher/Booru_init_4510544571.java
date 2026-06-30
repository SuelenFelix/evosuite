package loliSnatcher;

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
import static loliSnatcher.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Booru_init_4510544571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440;

    public Booru_init_4510544571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term498 = Class.forName((String) "java.io.File$PathStatus");
        Field term497 = ((Class) term498).getDeclaredField((String) "INVALID");
        ((Field) term497).setAccessible(true);
        Object enum0 = ((Field) term497).get((Object) null);
        term440 = newInstance(Class.forName("java.io.File"));
        setField(term440, term440.getClass(), "path", "ieCtQFdkii");
        setField(term440, term440.getClass(), "status", enum0);
        setIntField(term440, term440.getClass(), "prefixLength", 1193880199);
        setField(term440, term440.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("loliSnatcher.Booru");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term440;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


