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

public class Position_Signal_getInstant_484718574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3139;

    public Position_Signal_getInstant_484718574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3178 = Class.forName((String) "strategies.Position$Action");
        Field term3177 = ((Class) term3178).getDeclaredField((String) "SELL");
        ((Field) term3177).setAccessible(true);
        Object enum11 = ((Field) term3177).get((Object) null);
        term3139 = newInstance(Class.forName("strategies.Position$Signal"));
        Object term3150 = newInstance(Class.forName("java.time.Instant"));
        setDoubleField(term3139, term3139.getClass(), "volume", 0.3202192021706908);
        setDoubleField(term3139, term3139.getClass(), "price", 0.22651340641904605);
        setField(term3139, term3139.getClass(), "action", enum11);
        setLongField(term3150, term3150.getClass(), "seconds", 1538078916L);
        setIntField(term3150, term3150.getClass(), "nanos", 394000000);
        setField(term3139, term3139.getClass(), "instant", term3150);
        setField(term3139, term3139.getClass(), "uuid", "hxCBltsObl");
        setField(term3139, term3139.getClass(), "sId", "BndsHwAFMv");
        setField(term3139, term3139.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Signal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstant", argTypes, term3139, args);
    }

};


