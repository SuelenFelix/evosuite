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

public class Position_Builder_build_116175489011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11270;

    public Position_Builder_build_116175489011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11270 = newInstance(Class.forName("strategies.Position$Builder"));
        setField(term11270, term11270.getClass(), "ts", null);
        setField(term11270, term11270.getClass(), "pt", null);
        setField(term11270, term11270.getClass(), "sId", null);
        setIntField(term11270, term11270.getClass(), "initVolume", 0);
        setDoubleField(term11270, term11270.getClass(), "pr", 0.0);
        setField(term11270, term11270.getClass(), "openInst", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term11270, args);
    }

};


