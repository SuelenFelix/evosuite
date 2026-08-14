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

public class Position_getPositionType_125704644723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7431;

    public Position_getPositionType_125704644723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7431 = newInstance(Class.forName("strategies.Position"));
        setField(term7431, term7431.getClass(), "formatter", null);
        setField(term7431, term7431.getClass(), "signals", null);
        setField(term7431, term7431.getClass(), "pt", null);
        setField(term7431, term7431.getClass(), "sId", null);
        setIntField(term7431, term7431.getClass(), "initVolume", 0);
        setIntField(term7431, term7431.getClass(), "currVolume", 0);
        setDoubleField(term7431, term7431.getClass(), "pr", 0.0);
        setField(term7431, term7431.getClass(), "openInst", null);
        setField(term7431, term7431.getClass(), "closeInst", null);
        setBooleanField(term7431, term7431.getClass(), "open", false);
        setDoubleField(term7431, term7431.getClass(), "currWinLoss", 0.0);
        setField(term7431, term7431.getClass(), "uuid", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPositionType", argTypes, term7431, args);
    }

};


