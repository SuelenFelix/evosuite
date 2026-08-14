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
import java.lang.Double;

public class Position_addNewSignal_85428351113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7363;
     Object term7369;
     Object term7371;

    public Position_addNewSignal_85428351113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7363 = newInstance(Class.forName("strategies.Position"));
        setField(term7363, term7363.getClass(), "formatter", null);
        setField(term7363, term7363.getClass(), "signals", null);
        setField(term7363, term7363.getClass(), "pt", null);
        setField(term7363, term7363.getClass(), "sId", null);
        setIntField(term7363, term7363.getClass(), "initVolume", 0);
        setIntField(term7363, term7363.getClass(), "currVolume", 0);
        setDoubleField(term7363, term7363.getClass(), "pr", 0.0);
        setField(term7363, term7363.getClass(), "openInst", null);
        setField(term7363, term7363.getClass(), "closeInst", null);
        setBooleanField(term7363, term7363.getClass(), "open", false);
        setDoubleField(term7363, term7363.getClass(), "currWinLoss", 0.0);
        setField(term7363, term7363.getClass(), "uuid", null);
        term7369 = new Double(0.0);
        term7371 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("java.time.Instant");
        Object[] args = new Object[3];
        args[0] = term7369;
        args[1] = term7371;
        args[2] = null;
        callMethod(klass, "addNewSignal", argTypes, term7363, args);
    }

};


