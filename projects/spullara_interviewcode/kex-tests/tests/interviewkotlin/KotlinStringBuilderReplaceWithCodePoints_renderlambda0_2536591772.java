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

public class KotlinStringBuilderReplaceWithCodePoints_renderlambda0_2536591772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36;
     Object term39;

    public KotlinStringBuilderReplaceWithCodePoints_renderlambda0_2536591772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36 = newInstance(Class.forName("interview.Entity"));
        setIntField(term36, term36.getClass(), "start", 1725571209);
        setIntField(term36, term36.getClass(), "end", -522618178);
        setField(term36, term36.getClass(), "html", null);
        term39 = newInstance(Class.forName("interview.Entity"));
        setIntField(term39, term39.getClass(), "start", 1134449235);
        setIntField(term39, term39.getClass(), "end", -883034806);
        setField(term39, term39.getClass(), "html", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("interviewkotlin.KotlinStringBuilderReplaceWithCodePoints");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("interview.Entity");
        argTypes[1] = Class.forName("interview.Entity");
        Object[] args = new Object[2];
        args[0] = term36;
        args[1] = term39;
        callMethod(klass, "render$lambda-0", argTypes, null, args);
    }

};


