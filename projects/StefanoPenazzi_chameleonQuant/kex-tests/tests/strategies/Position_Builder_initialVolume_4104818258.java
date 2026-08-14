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
import java.lang.Integer;

public class Position_Builder_initialVolume_4104818258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11257;
     Object term11260;

    public Position_Builder_initialVolume_4104818258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11257 = newInstance(Class.forName("strategies.Position$Builder"));
        setField(term11257, term11257.getClass(), "ts", null);
        setField(term11257, term11257.getClass(), "pt", null);
        setField(term11257, term11257.getClass(), "sId", null);
        setIntField(term11257, term11257.getClass(), "initVolume", 0);
        setDoubleField(term11257, term11257.getClass(), "pr", 0.0);
        setField(term11257, term11257.getClass(), "openInst", null);
        term11260 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11260;
        callMethod(klass, "initialVolume", argTypes, term11257, args);
    }

};


