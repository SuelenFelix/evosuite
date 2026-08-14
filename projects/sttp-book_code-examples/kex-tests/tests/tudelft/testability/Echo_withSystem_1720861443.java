package tudelft.testability;

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
import static tudelft.testability.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Echo_withSystem_1720861443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303;
     Object term307;

    public Echo_withSystem_1720861443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303 = newInstance(Class.forName("tudelft.testability.Echo"));
        Object term306 = newInstance(Class.forName("tudelft.testability.SystemWrapper"));
        setField(term303, term303.getClass(), "result", "");
        setField(term303, term303.getClass(), "system", term306);
        term307 = newInstance(Class.forName("tudelft.testability.SystemWrapper"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.testability.Echo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tudelft.testability.SystemWrapper");
        Object[] args = new Object[1];
        args[0] = term307;
        callMethod(klass, "withSystem", argTypes, term303, args);
    }

};


