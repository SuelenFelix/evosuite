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

public class Position_Builder_securityId_3217200237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11254;

    public Position_Builder_securityId_3217200237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11254 = newInstance(Class.forName("strategies.Position$Builder"));
        setField(term11254, term11254.getClass(), "ts", null);
        setField(term11254, term11254.getClass(), "pt", null);
        setField(term11254, term11254.getClass(), "sId", null);
        setIntField(term11254, term11254.getClass(), "initVolume", 0);
        setDoubleField(term11254, term11254.getClass(), "pr", 0.0);
        setField(term11254, term11254.getClass(), "openInst", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "securityId", argTypes, term11254, args);
    }

};


