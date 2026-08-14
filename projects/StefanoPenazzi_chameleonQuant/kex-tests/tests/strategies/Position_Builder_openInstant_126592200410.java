package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Position_Builder_openInstant_126592200410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11267;

    public Position_Builder_openInstant_126592200410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11267 = newInstance(Class.forName("strategies.Position$Builder"));
        setField(term11267, term11267.getClass(), "ts", null);
        setField(term11267, term11267.getClass(), "pt", null);
        setField(term11267, term11267.getClass(), "sId", null);
        setIntField(term11267, term11267.getClass(), "initVolume", 0);
        setDoubleField(term11267, term11267.getClass(), "pr", 0.0);
        setField(term11267, term11267.getClass(), "openInst", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "openInstant", argTypes, term11267, args);
    }

};


