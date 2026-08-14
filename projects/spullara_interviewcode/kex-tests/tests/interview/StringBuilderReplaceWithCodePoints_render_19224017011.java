package interview;

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
import static interview.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class StringBuilderReplaceWithCodePoints_render_19224017011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405;
     Object term406;

    public StringBuilderReplaceWithCodePoints_render_19224017011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405 = newInstance(Class.forName("interview.StringBuilderReplaceWithCodePoints"));
        HashMap term407 = new HashMap();
        Set<Object> term412 =  ((Map) term407).keySet();
        term406 = new HashSet((Collection<? extends Object>) term412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("interview.StringBuilderReplaceWithCodePoints");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term406;
        callMethod(klass, "render", argTypes, term405, args);
    }

};


