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

public class Position_getReturnOnInitialCapital_178086353420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7413;

    public Position_getReturnOnInitialCapital_178086353420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7413 = newInstance(Class.forName("strategies.Position"));
        setField(term7413, term7413.getClass(), "formatter", null);
        setField(term7413, term7413.getClass(), "signals", null);
        setField(term7413, term7413.getClass(), "pt", null);
        setField(term7413, term7413.getClass(), "sId", null);
        setIntField(term7413, term7413.getClass(), "initVolume", 0);
        setIntField(term7413, term7413.getClass(), "currVolume", 0);
        setDoubleField(term7413, term7413.getClass(), "pr", 0.0);
        setField(term7413, term7413.getClass(), "openInst", null);
        setField(term7413, term7413.getClass(), "closeInst", null);
        setBooleanField(term7413, term7413.getClass(), "open", false);
        setDoubleField(term7413, term7413.getClass(), "currWinLoss", 0.0);
        setField(term7413, term7413.getClass(), "uuid", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReturnOnInitialCapital", argTypes, term7413, args);
    }

};


