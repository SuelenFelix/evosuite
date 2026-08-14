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

public class Position_Signal_getPrice_9742887989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3767;

    public Position_Signal_getPrice_9742887989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3767 = newInstance(Class.forName("strategies.Position$Signal"));
        setDoubleField(term3767, term3767.getClass(), "volume", 0.0);
        setDoubleField(term3767, term3767.getClass(), "price", 0.0);
        setField(term3767, term3767.getClass(), "action", null);
        setField(term3767, term3767.getClass(), "instant", null);
        setField(term3767, term3767.getClass(), "uuid", null);
        setField(term3767, term3767.getClass(), "sId", null);
        setField(term3767, term3767.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Signal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term3767, args);
    }

};


