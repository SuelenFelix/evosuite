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

public class Position_Signal_getVolume_4606194831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2530;

    public Position_Signal_getVolume_4606194831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2568 = Class.forName((String) "strategies.Position$Action");
        Field term2567 = ((Class) term2568).getDeclaredField((String) "BUY");
        ((Field) term2567).setAccessible(true);
        Object enum8 = ((Field) term2567).get((Object) null);
        term2530 = newInstance(Class.forName("strategies.Position$Signal"));
        Object term2540 = newInstance(Class.forName("java.time.Instant"));
        setDoubleField(term2530, term2530.getClass(), "volume", 0.6300849762307866);
        setDoubleField(term2530, term2530.getClass(), "price", 0.9737083944266686);
        setField(term2530, term2530.getClass(), "action", enum8);
        setLongField(term2540, term2540.getClass(), "seconds", 1725122217L);
        setIntField(term2540, term2540.getClass(), "nanos", 647000000);
        setField(term2530, term2530.getClass(), "instant", term2540);
        setField(term2530, term2530.getClass(), "uuid", "IDCWpPLRkE");
        setField(term2530, term2530.getClass(), "sId", "nyiiPDVjAc");
        setField(term2530, term2530.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Signal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term2530, args);
    }

};


