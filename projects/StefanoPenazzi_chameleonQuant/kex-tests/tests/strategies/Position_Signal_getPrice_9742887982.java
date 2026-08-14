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

public class Position_Signal_getPrice_9742887982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2733;

    public Position_Signal_getPrice_9742887982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2771 = Class.forName((String) "strategies.Position$Action");
        Field term2770 = ((Class) term2771).getDeclaredField((String) "BUY");
        ((Field) term2770).setAccessible(true);
        Object enum9 = ((Field) term2770).get((Object) null);
        term2733 = newInstance(Class.forName("strategies.Position$Signal"));
        Object term2743 = newInstance(Class.forName("java.time.Instant"));
        setDoubleField(term2733, term2733.getClass(), "volume", 0.0668892744806211);
        setDoubleField(term2733, term2733.getClass(), "price", 0.3587267442738795);
        setField(term2733, term2733.getClass(), "action", enum9);
        setLongField(term2743, term2743.getClass(), "seconds", 1550698994L);
        setIntField(term2743, term2743.getClass(), "nanos", 689000000);
        setField(term2733, term2733.getClass(), "instant", term2743);
        setField(term2733, term2733.getClass(), "uuid", "aKnKipADSo");
        setField(term2733, term2733.getClass(), "sId", "wSQxaModmm");
        setField(term2733, term2733.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Signal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term2733, args);
    }

};


