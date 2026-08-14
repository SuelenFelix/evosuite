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

public class Position_Signal_getAction_65900733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2936;

    public Position_Signal_getAction_65900733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2974 = Class.forName((String) "strategies.Position$Action");
        Field term2973 = ((Class) term2974).getDeclaredField((String) "BUY");
        ((Field) term2973).setAccessible(true);
        Object enum10 = ((Field) term2973).get((Object) null);
        term2936 = newInstance(Class.forName("strategies.Position$Signal"));
        Object term2946 = newInstance(Class.forName("java.time.Instant"));
        setDoubleField(term2936, term2936.getClass(), "volume", 0.07802449704920456);
        setDoubleField(term2936, term2936.getClass(), "price", 0.5279279537140873);
        setField(term2936, term2936.getClass(), "action", enum10);
        setLongField(term2946, term2946.getClass(), "seconds", 1804998087L);
        setIntField(term2946, term2946.getClass(), "nanos", 131000000);
        setField(term2936, term2936.getClass(), "instant", term2946);
        setField(term2936, term2936.getClass(), "uuid", "UlajhuVLaP");
        setField(term2936, term2936.getClass(), "sId", "gGSMzuGICf");
        setField(term2936, term2936.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Signal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAction", argTypes, term2936, args);
    }

};


