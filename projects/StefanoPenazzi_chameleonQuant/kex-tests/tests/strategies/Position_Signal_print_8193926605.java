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

public class Position_Signal_print_8193926605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3346;

    public Position_Signal_print_8193926605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3385 = Class.forName((String) "strategies.Position$Action");
        Field term3384 = ((Class) term3385).getDeclaredField((String) "SELL");
        ((Field) term3384).setAccessible(true);
        Object enum12 = ((Field) term3384).get((Object) null);
        term3346 = newInstance(Class.forName("strategies.Position$Signal"));
        Object term3357 = newInstance(Class.forName("java.time.Instant"));
        setDoubleField(term3346, term3346.getClass(), "volume", 0.8878841294187743);
        setDoubleField(term3346, term3346.getClass(), "price", 0.6588948704887806);
        setField(term3346, term3346.getClass(), "action", enum12);
        setLongField(term3357, term3357.getClass(), "seconds", 1744090065L);
        setIntField(term3357, term3357.getClass(), "nanos", 937000000);
        setField(term3346, term3346.getClass(), "instant", term3357);
        setField(term3346, term3346.getClass(), "uuid", "GzFkzHGYFt");
        setField(term3346, term3346.getClass(), "sId", "tShwQLRGNe");
        setField(term3346, term3346.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Signal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "print", argTypes, term3346, args);
    }

};


