package core.utils;

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
import static core.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class App_reportMissingDriver_11952519053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9531;

    public App_reportMissingDriver_11952519053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9531 = newInstance(Class.forName("core.utils.App"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.App");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reportMissingDriver", argTypes, term9531, args);
    }

};


