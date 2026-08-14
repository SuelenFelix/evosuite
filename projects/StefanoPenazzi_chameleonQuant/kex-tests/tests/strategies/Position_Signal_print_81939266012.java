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

public class Position_Signal_print_81939266012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3776;

    public Position_Signal_print_81939266012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3776 = newInstance(Class.forName("strategies.Position$Signal"));
        setDoubleField(term3776, term3776.getClass(), "volume", 0.0);
        setDoubleField(term3776, term3776.getClass(), "price", 0.0);
        setField(term3776, term3776.getClass(), "action", null);
        setField(term3776, term3776.getClass(), "instant", null);
        setField(term3776, term3776.getClass(), "uuid", null);
        setField(term3776, term3776.getClass(), "sId", null);
        setField(term3776, term3776.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Signal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "print", argTypes, term3776, args);
    }

};


