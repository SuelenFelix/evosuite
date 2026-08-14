package interviewkotlin;

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
import static interviewkotlin.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KotlinStringBuilderReplaceWithCodePoints_render_17256409334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42;

    public KotlinStringBuilderReplaceWithCodePoints_render_17256409334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42 = newInstance(Class.forName("interviewkotlin.KotlinStringBuilderReplaceWithCodePoints"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("interviewkotlin.KotlinStringBuilderReplaceWithCodePoints");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "render", argTypes, term42, args);
    }

};


