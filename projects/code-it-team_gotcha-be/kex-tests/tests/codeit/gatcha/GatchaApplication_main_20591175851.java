package codeit.gatcha;

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
import static codeit.gatcha.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GatchaApplication_main_20591175851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12843;

    public GatchaApplication_main_20591175851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12843 = (Object[]) newArray("java.lang.String", 3);
        setElement(term12843, 0, "MnqnyndkhF");
        setElement(term12843, 1, "MZzoPKpFlh");
        setElement(term12843, 2, "skVZETaBKX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.GatchaApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term12843;
        callMethod(klass, "main", argTypes, null, args);
    }

};


