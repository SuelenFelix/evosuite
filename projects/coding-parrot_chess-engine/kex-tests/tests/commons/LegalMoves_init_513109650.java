package commons;

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
import static commons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class LegalMoves_init_513109650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412;
     Object term425;

    public LegalMoves_init_513109650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term413 = new HashMap();
        Set<Object> term431 =  ((Map) term413).keySet();
        term412 = new HashSet((Collection<? extends Object>) term431);
        HashMap term426 = new HashMap();
        Set<Object> term432 =  ((Map) term426).keySet();
        term425 = new HashSet((Collection<? extends Object>) term432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("commons.LegalMoves");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term412;
        args[1] = term425;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


