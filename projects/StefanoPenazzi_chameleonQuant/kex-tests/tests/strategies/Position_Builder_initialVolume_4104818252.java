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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Position_Builder_initialVolume_4104818252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10375;
     Object term10401;

    public Position_Builder_initialVolume_4104818252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10404 = Class.forName((String) "strategies.Position$PositionType");
        Field term10403 = ((Class) term10404).getDeclaredField((String) "LONG");
        ((Field) term10403).setAccessible(true);
        Object enum33 = ((Field) term10403).get((Object) null);
        term10375 = newInstance(Class.forName("strategies.Position$Builder"));
        Object term10398 = newInstance(Class.forName("java.time.Instant"));
        setField(term10375, term10375.getClass(), "ts", null);
        setField(term10375, term10375.getClass(), "pt", enum33);
        setField(term10375, term10375.getClass(), "sId", "lHfTrWKMPk");
        setIntField(term10375, term10375.getClass(), "initVolume", -1899301124);
        setDoubleField(term10375, term10375.getClass(), "pr", 0.22227423914231126);
        setLongField(term10398, term10398.getClass(), "seconds", 1490956290L);
        setIntField(term10398, term10398.getClass(), "nanos", 70000000);
        setField(term10375, term10375.getClass(), "openInst", term10398);
        term10401 = new Integer(-1882480155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10401;
        callMethod(klass, "initialVolume", argTypes, term10375, args);
    }

};


